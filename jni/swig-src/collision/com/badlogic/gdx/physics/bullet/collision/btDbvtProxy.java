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

public class btDbvtProxy extends btBroadphaseProxy {
	private long swigCPtr;
	
	protected btDbvtProxy(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btDbvtProxy_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDbvtProxy, normally you should not need this constructor it's intended for low-level usage. */
	public btDbvtProxy(long cPtr, boolean cMemoryOwn) {
		this("btDbvtProxy", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btDbvtProxy_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDbvtProxy obj) {
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
				CollisionJNI.delete_btDbvtProxy(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLeaf(btDbvtNode value) {
    CollisionJNI.btDbvtProxy_leaf_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getLeaf() {
	return btDbvtNode.internalTemp(CollisionJNI.btDbvtProxy_leaf_get(swigCPtr, this), false);
}

  public void setLinks(SWIGTYPE_p_p_btDbvtProxy value) {
    CollisionJNI.btDbvtProxy_links_set(swigCPtr, this, SWIGTYPE_p_p_btDbvtProxy.getCPtr(value));
  }

  public SWIGTYPE_p_p_btDbvtProxy getLinks() {
    long cPtr = CollisionJNI.btDbvtProxy_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btDbvtProxy(cPtr, false);
  }

  public void setStage(int value) {
    CollisionJNI.btDbvtProxy_stage_set(swigCPtr, this, value);
  }

  public int getStage() {
    return CollisionJNI.btDbvtProxy_stage_get(swigCPtr, this);
  }

  public btDbvtProxy(Vector3 aabbMin, Vector3 aabbMax, long userPtr, short collisionFilterGroup, short collisionFilterMask) {
    this(CollisionJNI.new_btDbvtProxy(aabbMin, aabbMax, userPtr, collisionFilterGroup, collisionFilterMask), true);
  }

}
