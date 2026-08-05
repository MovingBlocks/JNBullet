# the name of the target operating system
SET(CMAKE_SYSTEM_NAME Windows)
set ( CMAKE_SYSTEM_ARCH aarch64)

# Classic mingw-w64 (GCC) has no Windows/ARM64 target; this uses the LLVM-based
# llvm-mingw toolchain instead (https://github.com/mstorsjo/llvm-mingw), which
# must be on PATH providing these compiler names.
set(COMPILER_PREFIX "aarch64-w64-mingw32")

SET(CMAKE_C_COMPILER ${COMPILER_PREFIX}-gcc)
SET(CMAKE_CXX_COMPILER ${COMPILER_PREFIX}-g++)

set(CMAKE_CXX_FLAGS_RELEASE "-O3")
