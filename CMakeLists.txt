cmake_minimum_required(VERSION 3.5)
project(bullet)



file(GLOB_RECURSE SRC_NATIVES
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletDynamics/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletDynamics/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletCollision/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletCollision/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletSoftBody/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletSoftBody/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/LinearMath/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/LinearMath/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/Bullet3Common/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/Bullet3Common/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletInverseDynamics/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/BulletInverseDynamics/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src/Extras/Serialize/BulletFileLoader/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/Extras/Serialize/BulletWorldImporter/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/Extras/Serialize/BulletFileLoader/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/bullet3/Extras/InverseDynamics/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/custom/**/*.cpp"
    "${CMAKE_SOURCE_DIR}/natives/memcpy_wrap.c")
file(GLOB SRC_SWIG "${CMAKE_SOURCE_DIR}/build/swig/*.cpp")

if(WIN32)
    SET(JAVA_JVM_LIBRARY /usr/lib/jvm/java-8-openjdk-amd64/include)
    SET(JAVA_AWT_LIBRARY /usr/lib/jvm/java-8-openjdk-amd64/include)

     if (MINGW)
         set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -static-libgcc")
         set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -static-libgcc -static-libstdc++")
         set(CMAKE_SHARED_LIBRARY_LINK_C_FLAGS "${CMAKE_SHARED_LIBRARY_LINK_C_FLAGS} -static-libgcc -s")
         set(CMAKE_SHARED_LIBRARY_LINK_CXX_FLAGS "${CMAKE_SHARED_LIBRARY_LINK_CXX_FLAGS} -static-libgcc -static-libstdc++ -s")
     endif()
endif(WIN32)

find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})


add_library(bullet SHARED ${SRC_SWIG} ${SRC_NATIVES})
set_target_properties(bullet PROPERTIES COMPILE_FLAGS  "-DBT_NO_PROFILE -DBT_USE_INVERSE_DYNAMICS_WITH_BULLET2 -DBT_THREADSAFE=1")

IF (NOT WIN32)
    LINK_LIBRARIES( pthread )
ENDIF (NOT WIN32)

target_include_directories(bullet PRIVATE
    "${CMAKE_SOURCE_DIR}/natives/bullet3/src",
    "${CMAKE_SOURCE_DIR}/natives/custom",
    "${CMAKE_SOURCE_DIR}/natives/bullet3/Extras/Serialize",
    "${CMAKE_SOURCE_DIR}/natives/bullet3/Extras"
)

target_include_directories(bullet PUBLIC
    build/swig
)

string(TOLOWER ${CMAKE_SYSTEM_NAME} LOWER_CMAKE_SYSTEM_NAME)
set_target_properties(bullet PROPERTIES OUTPUT_NAME "bullet-${LOWER_CMAKE_SYSTEM_NAME}-${CMAKE_SYSTEM_ARCH}")
