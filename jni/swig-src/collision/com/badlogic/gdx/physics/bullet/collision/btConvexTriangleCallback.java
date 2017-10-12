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

public class btConvexTriangleCallback extends btTriangleCallback {
	private long swigCPtr;
	
	protected btConvexTriangleCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexTriangleCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexTriangleCallback, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexTriangleCallback(long cPtr, boolean cMemoryOwn) {
		this("btConvexTriangleCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexTriangleCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexTriangleCallback obj) {
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
				CollisionJNI.delete_btConvexTriangleCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.btConvexTriangleCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.btConvexTriangleCallback_change_ownership(this, swigCPtr, true);
  }

  public void setTriangleCount(int value) {
    CollisionJNI.btConvexTriangleCallback_triangleCount_set(swigCPtr, this, value);
  }

  public int getTriangleCount() {
    return CollisionJNI.btConvexTriangleCallback_triangleCount_get(swigCPtr, this);
  }

  public void setManifoldPtr(btPersistentManifold value) {
    CollisionJNI.btConvexTriangleCallback_manifoldPtr_set(swigCPtr, this, btPersistentManifold.getCPtr(value), value);
  }

  public btPersistentManifold getManifoldPtr() {
    long cPtr = CollisionJNI.btConvexTriangleCallback_manifoldPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public btConvexTriangleCallback(btDispatcher dispatcher, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, boolean isSwapped) {
    this(CollisionJNI.new_btConvexTriangleCallback(btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, isSwapped), true);
    CollisionJNI.btConvexTriangleCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void setTimeStepAndCounters(float collisionMarginTriangle, btDispatcherInfo dispatchInfo, btCollisionObjectWrapper convexBodyWrap, btCollisionObjectWrapper triBodyWrap, btManifoldResult resultOut) {
    CollisionJNI.btConvexTriangleCallback_setTimeStepAndCounters(swigCPtr, this, collisionMarginTriangle, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btCollisionObjectWrapper.getCPtr(convexBodyWrap), convexBodyWrap, btCollisionObjectWrapper.getCPtr(triBodyWrap), triBodyWrap, btManifoldResult.getCPtr(resultOut), resultOut);
  }

  public void clearWrapperData() {
    CollisionJNI.btConvexTriangleCallback_clearWrapperData(swigCPtr, this);
  }

  public void processTriangle(btVector3 triangle, int partId, int triangleIndex) {
    if (getClass() == btConvexTriangleCallback.class) CollisionJNI.btConvexTriangleCallback_processTriangle(swigCPtr, this, btVector3.getCPtr(triangle), triangle, partId, triangleIndex); else CollisionJNI.btConvexTriangleCallback_processTriangleSwigExplicitbtConvexTriangleCallback(swigCPtr, this, btVector3.getCPtr(triangle), triangle, partId, triangleIndex);
  }

  public void clearCache() {
    CollisionJNI.btConvexTriangleCallback_clearCache(swigCPtr, this);
  }

  public Vector3f getAabbMin() {
	return CollisionJNI.btConvexTriangleCallback_getAabbMin(swigCPtr, this);
}

  public Vector3f getAabbMax() {
	return CollisionJNI.btConvexTriangleCallback_getAabbMax(swigCPtr, this);
}

}
