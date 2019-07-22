 # Base on a Jenkins agent image - see https://github.com/jenkinsci/docker-jnlp-slave
FROM openjdk:8

# Install Ansible and other tools
RUN apt-get update && apt-get install -y git nano

# install cmake and JRE for gradle and cmake
RUN apt-get install -y gcc g++ default-jre swig mingw-w64 cmake gcc-multilib g++-multilib
