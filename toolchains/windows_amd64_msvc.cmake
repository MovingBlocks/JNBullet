# Copyright 2015, alex at staticlibs.net
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

cmake_minimum_required ( VERSION 2.8.12 )

# default to Debug
set ( CMAKE_BUILD_TYPE "Debug" CACHE STRING "Default build type" )

set ( CMAKE_SYSTEM_NAME Windows )
set ( CMAKE_SYSTEM_ARCH amd64)

set ( CMAKE_C_COMPILER cl.exe )
set ( CMAKE_CXX_COMPILER cl.exe )
