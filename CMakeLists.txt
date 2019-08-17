cmake_minimum_required(VERSION 3.5)
project(bullet)

file(GLOB_RECURSE SRC_NATIVES "${CMAKE_SOURCE_DIR}/natives/**/*.cpp" "${CMAKE_SOURCE_DIR}/natives/**/*.c")
file(GLOB SRC_SWIG "${CMAKE_SOURCE_DIR}/build/swig/*.cpp")

#find_package(JNI REQUIRED)
#include_directories(${JNI_INCLUDE_DIRS})

add_library(bullet SHARED ${SRC_SWIG} ${SRC_NATIVES})
set_target_properties(bullet PROPERTIES COMPILE_FLAGS  "-DBT_NO_PROFILE -DBT_USE_INVERSE_DYNAMICS_WITH_BULLET2 ")

target_include_directories(bullet PRIVATE
    "${CMAKE_SOURCE_DIR}/natives/jni-headers",
    "${CMAKE_SOURCE_DIR}/natives/bullet3/bullet",
    "${CMAKE_SOURCE_DIR}/natives/custom",
    "${CMAKE_SOURCE_DIR}/natives/extras/Serialize",
    "${CMAKE_SOURCE_DIR}/natives/extras"
)

target_include_directories(bullet PUBLIC
    build/swig
)

if(MSVC OR MSYS OR MINGW OR win32)
    target_include_directories(bullet PRIVATE "${CMAKE_SOURCE_DIR}/natives/jni-headers/win32")
    set(PLATFORM "win32")
endif()

if(UNIX AND NOT APPLE)
    target_include_directories(bullet PRIVATE "${CMAKE_SOURCE_DIR}/natives/jni-headers/linux")
endif()

if(APPLE)
    target_include_directories(bullet PRIVATE "${CMAKE_SOURCE_DIR}/natives/jni-headers/mac")
endif()

string(TOLOWER ${CMAKE_SYSTEM_NAME} LOWER_CMAKE_SYSTEM_NAME)
set_target_properties(bullet PROPERTIES OUTPUT_NAME "bullet-${LOWER_CMAKE_SYSTEM_NAME}-${CMAKE_SYSTEM_ARCH}")