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

public class btTriangleConvexcastCallback extends btTriangleCallback {
	private long swigCPtr;
	
	protected btTriangleConvexcastCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleConvexcastCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleConvexcastCallback, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleConvexcastCallback(long cPtr, boolean cMemoryOwn) {
		this("btTriangleConvexcastCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleConvexcastCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleConvexcastCallback obj) {
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
				CollisionJNI.delete_btTriangleConvexcastCallback(swigCPtr);
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
    CollisionJNI.btTriangleConvexcastCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.btTriangleConvexcastCallback_change_ownership(this, swigCPtr, true);
  }

  public void setConvexShape(btConvexShape value) {
    CollisionJNI.btTriangleConvexcastCallback_convexShape_set(swigCPtr, this, btConvexShape.getCPtr(value), value);
  }

  public btConvexShape getConvexShape() {
    long cPtr = CollisionJNI.btTriangleConvexcastCallback_convexShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

  public void setConvexShapeFrom(btTransform value) {
    CollisionJNI.btTriangleConvexcastCallback_convexShapeFrom_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getConvexShapeFrom() {
    long cPtr = CollisionJNI.btTriangleConvexcastCallback_convexShapeFrom_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setConvexShapeTo(btTransform value) {
    CollisionJNI.btTriangleConvexcastCallback_convexShapeTo_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getConvexShapeTo() {
    long cPtr = CollisionJNI.btTriangleConvexcastCallback_convexShapeTo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setTriangleToWorld(btTransform value) {
    CollisionJNI.btTriangleConvexcastCallback_triangleToWorld_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getTriangleToWorld() {
    long cPtr = CollisionJNI.btTriangleConvexcastCallback_triangleToWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setHitFraction(float value) {
    CollisionJNI.btTriangleConvexcastCallback_hitFraction_set(swigCPtr, this, value);
  }

  public float getHitFraction() {
    return CollisionJNI.btTriangleConvexcastCallback_hitFraction_get(swigCPtr, this);
  }

  public void setTriangleCollisionMargin(float value) {
    CollisionJNI.btTriangleConvexcastCallback_triangleCollisionMargin_set(swigCPtr, this, value);
  }

  public float getTriangleCollisionMargin() {
    return CollisionJNI.btTriangleConvexcastCallback_triangleCollisionMargin_get(swigCPtr, this);
  }

  public void setAllowedPenetration(float value) {
    CollisionJNI.btTriangleConvexcastCallback_allowedPenetration_set(swigCPtr, this, value);
  }

  public float getAllowedPenetration() {
    return CollisionJNI.btTriangleConvexcastCallback_allowedPenetration_get(swigCPtr, this);
  }

  public btTriangleConvexcastCallback(btConvexShape convexShape, Matrix4f convexShapeFrom, Matrix4f convexShapeTo, Matrix4f triangleToWorld, float triangleCollisionMargin) {
    this(CollisionJNI.new_btTriangleConvexcastCallback(btConvexShape.getCPtr(convexShape), convexShape, convexShapeFrom, convexShapeTo, triangleToWorld, triangleCollisionMargin), true);
    CollisionJNI.btTriangleConvexcastCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void processTriangle(btVector3 triangle, int partId, int triangleIndex) {
    if (getClass() == btTriangleConvexcastCallback.class) CollisionJNI.btTriangleConvexcastCallback_processTriangle(swigCPtr, this, btVector3.getCPtr(triangle), triangle, partId, triangleIndex); else CollisionJNI.btTriangleConvexcastCallback_processTriangleSwigExplicitbtTriangleConvexcastCallback(swigCPtr, this, btVector3.getCPtr(triangle), triangle, partId, triangleIndex);
  }

  public float reportHit(Vector3f hitNormalLocal, Vector3f hitPointLocal, float hitFraction, int partId, int triangleIndex) {
    return CollisionJNI.btTriangleConvexcastCallback_reportHit(swigCPtr, this, hitNormalLocal, hitPointLocal, hitFraction, partId, triangleIndex);
  }

}
