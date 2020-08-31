pipeline {
    agent {
        // We primarily build on an agent meant for Java and native builds
        label "java-native"
    }
    stages {
        stage('Preparation') {
            steps {
                checkout scm
                // JNBullet uses a submodule to get the source for Bullet itself, so we need to explicitly grab that as well
                sh 'git submodule update --init --recursive'
                sh 'cmake --version'
                sh 'java -version'
            }
        }

        // Linux can build natives for both itself and Windows, so we do that on the main node first
        stage('Build Win+Linux') {
            steps {
                sh './gradlew --console=plain clean build buildNatives'
            }
        }

        // This project also needs natives for Macs, which we do by building the whole thing over again on a Mac node
        stage('Build Mac ') {
            agent {
                label 'cervator-mac'
            }

            steps {
                checkout scm
                sh 'git submodule update --init --recursive'
                sh 'cmake --version'
                sh 'java -version'

                sh './gradlew --console=plain clean buildNatives'

                // We stash the one artifact we care about here (since we're on a dedicated Mac builder) for later use
                stash includes: 'build/natives/macosx_amd64_clang/libbullet-darwin-amd64.dylib', name: 'macNative'
            }
        }

        // Publishing only happens when we're on special branches
        stage('Publish') {
            when {
                anyOf {
                    branch 'master'
                    branch pattern: "release/v\\d+.x", comparator: "REGEXP"
                }
            }
            steps {
                // Unstash the one Mac artifact we need to cram into the zip full of natives
                unstash 'macNative'

                sh 'ls build'
                sh 'ls build/natives'
                sh 'ls build/natives/macosx_amd64_clang'

                withCredentials([usernamePassword(credentialsId: 'artifactory-gooey', usernameVariable: 'artifactoryUser', passwordVariable: 'artifactoryPass')]) {
                    sh './gradlew --info --console=plain -Dorg.gradle.internal.publish.checksums.insecure=true zipNatives publish -PmavenUser=${artifactoryUser} -PmavenPass=${artifactoryPass}'
                }
            }
        }
    }
}
