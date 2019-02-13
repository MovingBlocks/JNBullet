# TeraBullet (Terasology Version)

TeraBullet is a version of bullet with extensions for direct interactions for voxel worlds. Written for use with Terasology. this is an implementation of bullet wraps around native bullet using SWIG.

# Building

## linux - linux and windows

To build the natives on linux you need:

- ant - installed on the system to build the natives for the generated wrapper code
- swig - installed on the system to produce both the generated code for the native and java bindings

* linux
  1. gcc
  2. gcc-c++
  - i686
     2. libstdc++.i686
     3. glibc-devel.i686
  - amd64
    1. glibc-devel
    2. libstdc++
* windows
  - i686
    1. mingw32-winpthreads
    2. mingw32-winpthreads-static
    3. mingw32-gcc
    4. mingw32-gcc-c++
  - amd64
    1. mingw64-winpthreads
    2. mingw64-winpthreads-static
    3. mingw64-gcc
    4. mingw64-gcc-c++

Then simple run ```ant``` to generated the binding code between java along with compiling the necessary libraries. 


the output is produced under the ```native-build``` folder and is formatted in this fashion:
```libbullet-[linux,windows]-[i686,amd64].[dll,so]```



To build the java portion of bullet, simply run ```./gralew build```

## OSX

* mac
  - i686
  - amd64


# License

This library is Licensed under the [Apache 2 License](http://www.apache.org/licenses/LICENSE-2.0.html) and is a rework of bullet wrapper
from [libgdx](https://github.com/libgdx/libgdx)