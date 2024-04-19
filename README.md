# TeraBullet (Terasology Version)

_TeraBullet is a version of [bullet](https://github.com/bulletphysics/bullet3) with extensions for direct interactions for voxel worlds, written for use with Terasology.
Bullet is a real-time collision detection and multi-physics simulation, for instance intended for use in games.
In Terasology, we use it, for instance, for simulating gravity for player and object movements as well as for collisions between players and/or objects.
This is an implementation of bullet wraps around native bullet using SWIG._

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

## Release Management

A _release_ denotes that an artifact for the associated commit is available for consumption. Our
[GitHub action](https://github.com/MovingBlocks/JNBullet/actions) automatically builds and publishes releases for the main `master` branch.
The artifact is published to our [Artifactory] under the version specified in [`gradle.properties`](./gradle.properties).

> ⚠ **Note:** Whether an artifact should be published as release or snapshot is determined by whether or not there is a
> `-SNAPSHOT` in the version. Publishing will fail in case publishing the same non-snapshot version is attempted
> again.

The exact build steps for this library are defined in the [GitHub action workflow](./.github/workflows/allInOne.yml).

🗄 [**Snapshots**](https://artifactory.terasology.io/ui/repos/tree/General/libs-snapshot-local/org/terasology/jnbullet) ▪ [**Releases**](https://artifactory.terasology.io/ui/repos/tree/General/libs-release-local/org/terasology/jnbullet)

### Release Process

As releases are automatically triggered from `master` the required steps to make a 
non-snapshot release for any version is as follows:

1. **Decide on release version** ▪ Which branch to publish, under which version?

    _The version number MUST be a higher SemVer than the current version of the branch to release.
     The version bump SHOULD follow SemVer specifications, e.g., increase the major version for breaking changes, or do
     a patch release for bug fixes._
 
1. **Make the release commit** ▪ Trigger a release via the [GitHub Action]

    _Update the version in [gradle.properties](./gradle.properties) and remove the `-SNAPSHOT` suffix. Commit the change with the
     following message and push it:_

    > `release: version {{version}}`

    _Until we have automatic tagging or a tag-based release process it is recommended to manually
     [create and push an annotated tag][git-tag] for the respective version on `master`. For a library release v1.2.3
     the tag process is:_
    
    ```sh
    git tag -a v1.2.3 -m "Release version 1.2.3"
    git push --tags
    ```
    
1. **Prepare for next release** ▪ Bump to next snapshot version

    _Next, we have to increase the version number to be able to get pre-release `-SNAPSHOT` builds for subsequent 
     commits. Therefore, the version number MUST be a higher SemVer than the version just released. This will typically
     be a minor version bump. To do this, just update the version in [gradle.properties](./gradle.properties), commit the 
     change with the following message and push it:_
    
    > `chore: prepare next snapshot for {{version}}`

1. **Make the release visible** ▪ Create the GitHub Release

    _Finally, we need to create the GitHub release to make the new release visible.
     Navigate to [JNBullet Releases](https://github.com/MovingBlocks/JNBullet/releases) and "Draft a new release".
     Select the tag you created earlier and name the release as "v{{version}}", optionally with a descriptive suffix like " - Initial Release".
     "Generate release notes" to have GitHub automatically add a list of new changes and contributors since the last release and publish the release._

## Testing

To test be sure to make the version in `gradle.properties` unique so you can ensure you use it by updating the corresponding version in Terasology's root `build.gradle` (natives) as well as its `engine/build.gradle` (Java wrapper). Use `./gradlew build zipNatives publishToMavenLocal` to get binaries created locally for JNBullet that Terasology can then read, and make sure to refresh its natives (delete the `natives` directory and rerun `gradlew extractNatives`)

## License

This library is Licensed under the [Apache 2 License](http://www.apache.org/licenses/LICENSE-2.0.html) and is a rework of bullet wrapper
from [libgdx](https://github.com/libgdx/libgdx)
