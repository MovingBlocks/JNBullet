pipeline {
    agent {
        label "java-native"
    }
    stages {
        stage('Preparation') {
            steps {
                checkout scm
                sh 'git submodule update --init --recursive'
                sh 'cmake --version'
                sh 'java -version'
            }
        }

        stage('Build Win+Linux') {
            steps {
                sh './gradlew --console=plain clean build buildNatives'
            }
        }

        stage('Build Mac ') {
            agent {
                label 'cervator-mac'
            }

            steps {
                steps {
                    checkout scm
                    sh 'git submodule update --init --recursive'
                    sh 'cmake --version'
                    sh 'java -version'

                    sh './gradlew --console=plain clean buildNatives'

                    stash includes: 'build/natives/macosx_amd64_clang/libbullet-darwin-amd64.dylib', name: 'macNative'
                }
            }
        }

        stage('Publish') {
            when {
                anyOf {
                    branch 'master'
                    branch pattern: "release/v\\d+.x", comparator: "REGEXP"
                }
                // Only allow a publish if Mac natives are available?
            }
            steps {

                unstash 'macNative'

                withCredentials([usernamePassword(credentialsId: 'artifactory-gooey', usernameVariable: 'artifactoryUser', passwordVariable: 'artifactoryPass')]) {
                    sh './gradlew --info --console=plain -Dorg.gradle.internal.publish.checksums.insecure=true zipNatives publish -PmavenUser=${artifactoryUser} -PmavenPass=${artifactoryPass}'
                }
            }
        }
    }
}
