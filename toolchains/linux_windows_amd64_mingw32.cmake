# the name of the target operating system
SET(CMAKE_SYSTEM_NAME Windows)
set ( CMAKE_SYSTEM_ARCH amd64)

# Choose an appropriate compiler prefix

# for classical mingw32
# see http://www.mingw.org/
#set(COMPILER_PREFIX "i586-mingw32msvc")

# for 32 or 64 bits mingw-w64
# see http://mingw-w64.sourceforge.net/
set(COMPILER_PREFIX "x86_64-w64-mingw32")

SET(CMAKE_C_COMPILER ${COMPILER_PREFIX}-gcc)
SET(CMAKE_CXX_COMPILER ${COMPILER_PREFIX}-g++)

set(CMAKE_CXX_FLAGS_RELEASE "-O3")

# here is the target environment located
#SET(USER_ROOT_PATH /home/erk/erk-win32-dev)
#SET(CMAKE_FIND_ROOT_PATH  /usr/${COMPILER_PREFIX} ${USER_ROOT_PATH})

# adjust the default behaviour of the FIND_XXX() commands:
# search headers and libraries in the target environment, search
# programs in the host environment
#set(CMAKE_FIND_ROOT_PATH_MODE_PROGRAM NEVER)
#set(CMAKE_FIND_ROOT_PATH_MODE_LIBRARY ONLY)
#set(CMAKE_FIND_ROOT_PATH_MODE_INCLUDE ONLY)
