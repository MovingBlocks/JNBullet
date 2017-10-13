/**
 * Maintain a copy of the data
 */
%module btBvhTriangleMeshShape

%{
#include <BulletCollision/CollisionShapes/btBvhTriangleMeshShape.h>
%}

%ignore btBvhTriangleMeshShape::btBvhTriangleMeshShape(btStridingMeshInterface* meshInterface, bool useQuantizedAabbCompression, bool buildBvh = true);
%ignore btBvhTriangleMeshShape::btBvhTriangleMeshShape(btStridingMeshInterface* meshInterface, bool useQuantizedAabbCompression,const btVector3& bvhAabbMin,const btVector3& bvhAabbMax, bool buildBvh = true);
%javamethodmodifiers btBvhTriangleMeshShape::btBvhTriangleMeshShape "private";

%extend btBvhTriangleMeshShape {
	btBvhTriangleMeshShape(bool dummy, btStridingMeshInterface* meshInterface, bool useQuantizedAabbCompression, bool buildBvh = true) {
		return new btBvhTriangleMeshShape(meshInterface, useQuantizedAabbCompression, buildBvh);
	}
	btBvhTriangleMeshShape(bool dummy, btStridingMeshInterface* meshInterface, bool useQuantizedAabbCompression,const btVector3& bvhAabbMin,const btVector3& bvhAabbMax, bool buildBvh = true) {
		return new btBvhTriangleMeshShape(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}
};

%typemap(javaimports) btBvhTriangleMeshShape %{
import org.terasology.math.geom.Vector3f;
%}

%typemap(javacode) btBvhTriangleMeshShape %{
	
	private btStridingMeshInterface meshInterface = null;
	
	/** @return The {@link btStridingMeshInterface} this shape encapsulates. */ 
	public btStridingMeshInterface getMeshInterface() {
		return meshInterface;
	}


	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(0, meshInterface, useQuantizedAabbCompression);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, buildBvh);
	}
	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3f bvhAabbMin, Vector3f bvhAabbMax, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}
	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3f bvhAabbMin, Vector3f bvhAabbMax) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(true, meshInterface, useQuantizedAabbCompression);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3f bvhAabbMin, Vector3f bvhAabbMax, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3f bvhAabbMin, Vector3f bvhAabbMax) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	
	public void dispose() {
		if (meshInterface != null)
			meshInterface.release();
		meshInterface = null;
		super.dispose();
	}
%}

%include "BulletCollision/CollisionShapes/btBvhTriangleMeshShape.h"