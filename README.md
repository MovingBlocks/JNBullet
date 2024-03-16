# TeraBullet (Terasology Version)

TeraBullet is a version of bullet with extensions for direct interactions for voxel worlds. Written for use with Terasology. this is an implementation of bullet wraps around native bullet using SWIG.

## Prerequisites

Clone this repository and initialize all git submodules:

```sh
git submodule update --init --recursive
```

Install Java 11 or later.

## Linux (for Linux and Windows artifacts)

Install `swig`, `cmake` and `mingw-w64`.

## MacOS

Install `swig` and `cmake`.

## Build

To build all natives for the current platform run

```sh
./gradlew buildNatives
```

The native libraries are written to `build/natives/*` and are `.so`, `dll`, or `.dylib` files.

To see a list of all known natives (platforms and operating systems), run

```
./gradlew listNatives
```

To build the Java library part of bullet, simply run 

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
