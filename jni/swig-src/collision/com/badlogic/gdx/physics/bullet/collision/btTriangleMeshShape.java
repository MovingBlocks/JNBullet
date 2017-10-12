/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class btTriangleMeshShape extends btConcaveShape {
	private long swigCPtr;
	
	protected btTriangleMeshShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleMeshShape, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
		this("btTriangleMeshShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleMeshShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleMeshShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btTriangleMeshShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public Vector3f localGetSupportingVertex(Vector3f vec) {
	return CollisionJNI.btTriangleMeshShape_localGetSupportingVertex(swigCPtr, this, vec);
}

  public Vector3f localGetSupportingVertexWithoutMargin(Vector3f vec) {
	return CollisionJNI.btTriangleMeshShape_localGetSupportingVertexWithoutMargin(swigCPtr, this, vec);
}

  public void recalcLocalAabb() {
    CollisionJNI.btTriangleMeshShape_recalcLocalAabb(swigCPtr, this);
  }

  public btStridingMeshInterface getMeshInterface() {
    long cPtr = CollisionJNI.btTriangleMeshShape_getMeshInterface__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
  }

  public Vector3f getLocalAabbMin() {
	return CollisionJNI.btTriangleMeshShape_getLocalAabbMin(swigCPtr, this);
}

  public Vector3f getLocalAabbMax() {
	return CollisionJNI.btTriangleMeshShape_getLocalAabbMax(swigCPtr, this);
}

}
