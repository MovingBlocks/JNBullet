pipeline {
   agent { 
    label "java-native"
   }
   stages {
       stage('Preparation') { // for display purposes
          // Get some code from a GitHub repository
          steps {
            git(
                branch: 'master',
                url: 'https://github.com/MovingBlocks/NativeBullet.git'
            )
            sh 'git submodule update --init --recursive'
            sh 'cmake --version'
            sh 'java -version'
          }
      }
       stage('Publish') {
           steps {
              withCredentials([usernamePassword(credentialsId: 'artifactory-gooey', usernameVariable: 'artifactoryUser', passwordVariable: 'artifactoryPass')]) {
                sh './gradlew --console=plain -Dorg.gradle.internal.publish.checksums.insecure=true publish -PmavenUser=${artifactoryUser} -PmavenPass=${artifactoryPass}'
              }
           }
       }
       
   }

}
