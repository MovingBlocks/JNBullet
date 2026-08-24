import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.authentication.http.BasicAuthentication

plugins {
    `java-library`
    `maven-publish`
}

// Compilation succeeds for both targets on either Mac platform, but in both cases the output is
// for the platform we're on. Therefore, we only include our own platform as target here.
val natives: List<String> = if (Os.isFamily(Os.FAMILY_MAC)) {
    if (Os.isArch("aarch64")) {
        listOf("macosx_aarch64_clang")
    } else {
        listOf("macosx_amd64_clang")
    }
} else if (Os.isFamily(Os.FAMILY_UNIX)) {
    if (Os.isArch("aarch64")) {
        // No MinGW-w64 cross target here: the Windows amd64 build is unrelated to and
        // not reliably available when cross-compiling from an aarch64 host.
        listOf("linux_aarch64_gcc")
    } else {
        // Cross-compilation with MinGW-w64 allows us to also build the Windows amd64 target
        // on Linux, and with llvm-mingw (must be on PATH, see toolchains/linux_windows_arm64_llvm_mingw32.cmake)
        // the Windows arm64 target too.
        listOf("linux_amd64_gcc", "linux_windows_amd64_mingw32", "linux_windows_arm64_llvm_mingw32")
    }
} else {
    throw GradleException("This script only works on Linux or Mac")
}

val allNatives = listOf(
    "linux_amd64_gcc",
    "linux_aarch64_gcc",
    "linux_windows_amd64_mingw32",
    "linux_windows_arm64_llvm_mingw32",
    "macosx_aarch64_clang",
    "macosx_amd64_clang"
)

val generatedSrcDir = "src/generated/java"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

// We use both Maven Central and our own Artifactory instance, which contains module builds, extra libs, and so on
repositories {
    mavenCentral()

    // Terasology Artifactory instance for libs not readily available elsewhere plus our own libs
    maven {
        val repoViaEnv = System.getenv("RESOLUTION_REPO")
        if (rootProject.hasProperty("alternativeResolutionRepo")) {
            // If the user supplies an alternative repo via gradle.properties then use that
            name = "from alternativeResolutionRepo property"
            url = uri(rootProject.property("alternativeResolutionRepo") as String)
        } else if (!repoViaEnv.isNullOrEmpty()) {
            name = "from \$RESOLUTION_REPO"
            url = uri(repoViaEnv)
        } else {
            // Our default is the main virtual repo containing everything except repos for testing Artifactory itself
            name = "Terasology Artifactory"
            url = uri("https://artifactory.terasology.io/artifactory/virtual-repo-live")
        }
    }
}

group = "org.terasology.jnbullet"

dependencies {
    api("org.joml:joml:1.9.25")
    api("net.sf.trove4j:trove4j:3.0.3")
    implementation("org.slf4j:slf4j-api:1.7.21")
}

sourceSets {
    main {
        java {
            srcDir(generatedSrcDir)
        }
    }
}

val generateSources by tasks.registering {
    dependsOn(":swig-src:Swig")
}

tasks.compileJava {
    dependsOn(generateSources)
}

tasks.named<Delete>("clean") {
    // the clean task should delete the folder, because it is the
    // output folder of generateSources, but it doesn't do it.
    delete(generatedSrcDir)
}

val sourceJar by tasks.registering(Jar::class) {
    description = "Create a JAR with all sources"
    from(sourceSets.main.get().allSource)
    from(sourceSets.test.get().allSource)
    archiveClassifier.set("sources")
}

val javadocJar by tasks.registering(Jar::class) {
    description = "Create a JAR with the JavaDoc for the java sources"
    dependsOn(tasks.javadoc)
    from(tasks.javadoc.get().destinationDir)
    archiveClassifier.set("javadoc")
}

natives.forEach { module ->
    tasks.register<Exec>("native_$module") {
        description = "cmake $module "
        executable = "cmake"
        workingDir = file("$rootDir/build/natives/$module")
        args(rootDir, "-DCMAKE_TOOLCHAIN_FILE=$rootDir/toolchains/$module.cmake", "-DCMAKE_BUILD_TYPE=Release")

        doFirst {
            mkdir("$rootDir/build/natives/$module")
        }
        doLast {
            val process = ProcessBuilder("make", "-j${Runtime.getRuntime().availableProcessors()}")
                .directory(file("$rootDir/build/natives/$module"))
                .redirectErrorStream(true)
                .start()
            process.inputStream.bufferedReader().forEachLine { println(it) }
            val exitCode = process.waitFor()
            if (exitCode != 0) {
                throw GradleException("make failed with exit code $exitCode")
            }
        }
    }
}

val buildNatives by tasks.registering {
    description = "Builds Natives"
    natives.forEach { module ->
        dependsOn("native_$module")
    }
}

val listNatives by tasks.registering {
    description = "List all supported platforms."
    doLast {
        println("All known natives (*supported):")
        allNatives.forEach { module ->
            // check whether module is contained in natives
            if (natives.contains(module)) {
                println("  *native_$module")
            } else {
                println("   native_$module")
            }
        }
    }
}

// TODO: outputs are not defined well enough yet for Gradle to skip this if already done (maybe more the natives task?)
val zipNatives by tasks.registering(Zip::class) {
    description = "Creates a zip archive that contains all TeraBullet native files"
    allNatives.forEach { module ->
        from("$rootDir/build/natives/$module") {
            include("*linux*")
            into("linux")
        }

        from("$rootDir/build/natives/$module") {
            include("*windows*")
            into("windows")
        }

        from("$rootDir/build/natives/$module") {
            include("*darwin*")
            into("macosx")
        }
    }

    destinationDirectory.set(buildDir)
    archiveBaseName.set("JNBullet")
}

buildNatives {
    dependsOn(generateSources)
}
// Building natives is a prerequisite for zipping them, but we don't want to re-compute them every time.
// Also, we build natives on different platforms and combine them to a single zip, so we can't just depend on the native tasks anyway.
//zipNatives.dependsOn(buildNatives)

tasks.javadoc {
    isFailOnError = false
}

tasks.named("publish") {
    dependsOn(sourceJar, javadocJar, zipNatives)
}

// Define the artifacts we want to publish (the .pom will also be included since the Maven plugin is active)
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "JNBullet"
            groupId = project.group.toString()

            from(components["java"])
            artifact(sourceJar)
            artifact(javadocJar)
            artifact(zipNatives)

            pom.withXml {
                asNode().apply {
                    appendNode("name", "JNBullet")
                    appendNode("description", "A Java Native Bullet Wrapper")
                    appendNode("url", "http://www.example.com/project")
                    (appendNode("licenses") as groovy.util.Node).apply {
                        (appendNode("license") as groovy.util.Node).apply {
                            appendNode("name", "The Apache License, Version 2.0")
                            appendNode("url", "http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    (appendNode("developers") as groovy.util.Node).apply {
                        (appendNode("developer") as groovy.util.Node).apply {
                            appendNode("id", "michaelpollind")
                            appendNode("name", "Michael Pollind")
                            appendNode("email", "mpollind@gmail.com")
                        }
                    }
                    (appendNode("scm") as groovy.util.Node).apply {
                        appendNode("connection", "https://github.com/MovingBlocks/JNBullet")
                        appendNode("developerConnection", "git@github.com:MovingBlocks/JNBullet.git")
                        appendNode("url", "https://github.com/MovingBlocks/JNBullet")
                    }
                }
            }

            repositories {
                maven {
                    name = "TerasologyOrg"

                    if (rootProject.hasProperty("publishRepo")) {
                        // This first option is good for local testing, you can set a full explicit target repo in gradle.properties
                        val publishRepo = rootProject.property("publishRepo") as String
                        url = uri("https://artifactory.terasology.io/artifactory/$publishRepo")

                        logger.info("Changing PUBLISH repoKey set via Gradle property to {}", publishRepo)
                    } else {
                        // Support override from the environment to use a different target publish org
                        var deducedPublishRepo = System.getenv("PUBLISH_ORG")
                        if (deducedPublishRepo.isNullOrEmpty()) {
                            // If not then default
                            deducedPublishRepo = "libs"
                        }

                        // Base final publish repo on whether we're building a snapshot or a release
                        deducedPublishRepo += if (project.version.toString().endsWith("SNAPSHOT")) {
                            "-snapshot-local"
                        } else {
                            "-release-local"
                        }

                        logger.info("The final deduced publish repo is {}", deducedPublishRepo)
                        url = uri("https://artifactory.terasology.io/artifactory/$deducedPublishRepo")
                    }

                    if (rootProject.hasProperty("mavenUser") && rootProject.hasProperty("mavenPass")) {
                        credentials {
                            username = rootProject.property("mavenUser") as String
                            password = rootProject.property("mavenPass") as String
                        }
                        authentication {
                            create<BasicAuthentication>("basic")
                        }
                    }
                }
            }
        }
    }
}
