pipeline {
   agent { dockerfile true }
   stages {
       stage('Preparation') { // for display purposes
          // Get some code from a GitHub repository
          steps {
            sh 'cmake --version'
            sh 'java -version'
          }
       }
       stage('Build Gradle') {
            steps{
                sh './gradlew build'
            }
       }
       stage('natives') {
           stages {
	           stage('Build linux_amd64_gcc') {
	                steps{
	                   sh 'mkdir linux_amd64_gcc'
	                   sh 'cd linux_amd64_gcc'
	                   sh 'cmake .. -DCMAKE_TOOLCHAIN_FILE=${WORKSPACE}/toolchains/linux_amd64_gcc.cmake'
	                }
	           }
	           stage('Build linux_i386_gcc') {
	                steps{
	                   sh 'mkdir linux_i386_gcc'
	                   sh 'cd linux_i386_gcc'
	                   sh 'cmake .. -DCMAKE_TOOLCHAIN_FILE=${WORKSPACE}/toolchains/linux_i386_gcc.cmake'
	                }
	           }
	           stage('Build linux_windows_amd64_mingw32') {
	                steps{
	                   sh 'mkdir linux_amd64_gcc'
	                   sh 'cd linux_amd64_gcc'
	                   sh 'cmake .. -DCMAKE_TOOLCHAIN_FILE=${WORKSPACE}/toolchains/linux_amd64_gcc.cmake'
	                }
	           }
	           stage('Build linux_windows_i686_mingw32') {
	                steps{
	                   sh 'mkdir linux_windows_i686_mingw32'
	                   sh 'cd linux_amd64_gcc'
	                   sh 'cmake .. -DCMAKE_TOOLCHAIN_FILE=${WORKSPACE}/toolchains/linux_windows_i686_mingw32.cmake'
	                }
	           }
           }
       }
   }
}
