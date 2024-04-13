# TeraBullet (Terasology Version)

TeraBullet is a version of bullet with extensions for direct interactions for voxel worlds. Written for use with Terasology. this is an implementation of bullet wraps around native bullet using SWIG.

## Prerequisites

Make sure the following applications are installed:

- Java 11 or later
- [CMake](https://cmake.org/)
- [SWIG](https://www.swig.org/) v4.0.2
- [MinGW-w64](https://www.mingw-w64.org/) (cross-compilation for Windows on Linux)

Clone this repository and initialize all git submodules:

```sh
git submodule update --init --recursive
```

## Build

To build the Java library and all supported natives for the current platform run

```sh
./gradlew build buildNatives
```

The native libraries are written to `build/natives/*` and are `.so`, `dll`, or `.dylib` files.

To see a list of all known natives (platforms and operating systems), run

```
./gradlew listNatives
```

To build only the Java library part of bullet, simply run 

```
./gradlew build
```

## Publishing

...

## Testing

To test be sure to make the version in `gradle.properties` unique so you can ensure you use it by updating the corresponding version in Terasology's root `build.gradle` (natives) as well as its `engine/build.gradle` (Java wrapper). Use `./gradlew build zipNatives publishToMavenLocal` to get binaries created locally for JNBullet that Terasology can then read, and make sure to refresh its natives (delete the `natives` directory and rerun `gradlew extractNatives`)

## License

This library is Licensed under the [Apache 2 License](http://www.apache.org/licenses/LICENSE-2.0.html) and is a rework of bullet wrapper
from [libgdx](https://github.com/libgdx/libgdx)
