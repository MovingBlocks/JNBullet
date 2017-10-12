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

public class btPointCollector extends btDiscreteCollisionDetectorInterface.Result {
	private long swigCPtr;
	
	protected btPointCollector(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btPointCollector_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPointCollector, normally you should not need this constructor it's intended for low-level usage. */
	public btPointCollector(long cPtr, boolean cMemoryOwn) {
		this("btPointCollector", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btPointCollector_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btPointCollector obj) {
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
				CollisionJNI.delete_btPointCollector(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNormalOnBInWorld(btVector3 value) {
    CollisionJNI.btPointCollector_normalOnBInWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getNormalOnBInWorld() {
    long cPtr = CollisionJNI.btPointCollector_normalOnBInWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setPointInWorld(btVector3 value) {
    CollisionJNI.btPointCollector_pointInWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getPointInWorld() {
    long cPtr = CollisionJNI.btPointCollector_pointInWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setDistance(float value) {
    CollisionJNI.btPointCollector_distance_set(swigCPtr, this, value);
  }

  public float getDistance() {
    return CollisionJNI.btPointCollector_distance_get(swigCPtr, this);
  }

  public void setHasResult(boolean value) {
    CollisionJNI.btPointCollector_hasResult_set(swigCPtr, this, value);
  }

  public boolean getHasResult() {
    return CollisionJNI.btPointCollector_hasResult_get(swigCPtr, this);
  }

  public btPointCollector() {
    this(CollisionJNI.new_btPointCollector(), true);
  }

}
