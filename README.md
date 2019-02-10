# TeraBullet (Terasology Version)

TeraBullet is a version of bullet with extensions for direct interactions for voxel worlds. Written for use with Terasology. 
this is an implementation of bullet that wraps around native bullet using SWIG.

# Building

The java and native side of this process is entirely done through gradle. "./gradlew build" is sufficient to produce both the shared library and jar.

To build the natives on linux you need:

* swig installed on the system to produce both the generated code for the native and java bindings
* gcc compiler
