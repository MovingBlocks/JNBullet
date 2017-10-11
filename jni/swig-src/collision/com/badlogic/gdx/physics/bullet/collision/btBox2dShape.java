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
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBox2dShape extends btPolyhedralConvexShape {
	private long swigCPtr;
	
	protected btBox2dShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btBox2dShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBox2dShape, normally you should not need this constructor it's intended for low-level usage. */
	public btBox2dShape(long cPtr, boolean cMemoryOwn) {
		this("btBox2dShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btBox2dShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btBox2dShape obj) {
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
				CollisionJNI.delete_btBox2dShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public Vector3 getHalfExtentsWithMargin() {
	return CollisionJNI.btBox2dShape_getHalfExtentsWithMargin(swigCPtr, this);
}

  public Vector3 getHalfExtentsWithoutMargin() {
	return CollisionJNI.btBox2dShape_getHalfExtentsWithoutMargin(swigCPtr, this);
}

  public btBox2dShape(Vector3 boxHalfExtents) {
    this(CollisionJNI.new_btBox2dShape(boxHalfExtents), true);
  }

  public int getVertexCount() {
    return CollisionJNI.btBox2dShape_getVertexCount(swigCPtr, this);
  }

  public btVector3 getVertices() {
    long cPtr = CollisionJNI.btBox2dShape_getVertices(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btVector3 getNormals() {
    long cPtr = CollisionJNI.btBox2dShape_getNormals(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getCentroid() {
	return CollisionJNI.btBox2dShape_getCentroid(swigCPtr, this);
}

  public void getPlaneEquation(btVector4 plane, int i) {
    CollisionJNI.btBox2dShape_getPlaneEquation(swigCPtr, this, btVector4.getCPtr(plane), plane, i);
  }

}
