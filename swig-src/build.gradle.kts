import org.gradle.api.file.FileVisitDetails
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

val swigTarget = listOf("linearmath", "collision", "dynamics", "softbody", "extras", "inversedynamics")

swigTarget.forEach { module ->
    tasks.register<Exec>("swig_$module") {
        description = "Swigging collision"
        executable = "swig"
        args(
            "-java",
            "-c++",
            "-Wall",
            "-Wextra",
            "-fvirtual",
            "-fastdispatch",
            "-macroerrors",
            "-package",
            "com.badlogic.gdx.physics.bullet.$module",
            "-I$rootDir/natives/bullet3/src",
            "-I$rootDir/natives/custom",
            "-I$rootDir/natives/bullet3/Extras",
            "-I$rootDir/natives/bullet3/Extras/Serialize",
            "-o", "$rootDir/build/swig/${module}_wrap.cpp",
            "-outdir",
            "$rootDir/src/generated/java/com/badlogic/gdx/physics/bullet/$module",
            "$rootDir/swig-src/$module/$module.i"
        )

        doFirst {
            mkdir("$rootDir/src/generated/java/com/badlogic/gdx/physics/bullet/$module")
            mkdir("$rootDir/build/swig")
        }
    }
}

tasks.register("Swig") {
    description = "Builds C++ bindings from java to Bullet3"
    dependsOn("swig_collision")
    dependsOn("swig_dynamics")
    dependsOn("swig_softbody")
    dependsOn("swig_extras")
    dependsOn("swig_inversedynamics")
    dependsOn("swig_linearmath")
    doLast {
        val swigTree = fileTree("$rootDir/build/swig") { include("*.cpp") }
        swigTree.visit(closureOf<FileVisitDetails> {
            println("$relativePath => $file")
            @Suppress("UNUSED_VARIABLE")
            val fileContents = file.readText()
        })
    }
}

tasks.register("BuildClasses") {
    swigTarget.forEach { module ->
        val swigVisit = fileTree("$rootDir/src/generated/java/com/badlogic/gdx/physics/bullet/$module") { include("*.java") }
        val outputFile = File("$rootDir/swig-src/$module", "classes.i")
        val writer = BufferedWriter(FileWriter(outputFile, false))

        swigVisit.visit(closureOf<FileVisitDetails> {
            val classTarget = file.name.split(".")[0]
            writer.write("SPECIFY_CLASS($classTarget, com.badlogic.gdx.physics.bullet.$module)\n")
        })
        writer.close()
    }
}
