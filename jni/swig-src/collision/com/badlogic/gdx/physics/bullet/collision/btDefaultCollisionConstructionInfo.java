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

public class btDefaultCollisionConstructionInfo extends BulletBase {
	private long swigCPtr;
	
	protected btDefaultCollisionConstructionInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDefaultCollisionConstructionInfo, normally you should not need this constructor it's intended for low-level usage. */ 
	public btDefaultCollisionConstructionInfo(long cPtr, boolean cMemoryOwn) {
		this("btDefaultCollisionConstructionInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDefaultCollisionConstructionInfo obj) {
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
				CollisionJNI.delete_btDefaultCollisionConstructionInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPersistentManifoldPool(btPoolAllocator value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_persistentManifoldPool_set(swigCPtr, this, btPoolAllocator.getCPtr(value), value);
  }

  public btPoolAllocator getPersistentManifoldPool() {
    long cPtr = CollisionJNI.btDefaultCollisionConstructionInfo_persistentManifoldPool_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public void setCollisionAlgorithmPool(btPoolAllocator value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_collisionAlgorithmPool_set(swigCPtr, this, btPoolAllocator.getCPtr(value), value);
  }

  public btPoolAllocator getCollisionAlgorithmPool() {
    long cPtr = CollisionJNI.btDefaultCollisionConstructionInfo_collisionAlgorithmPool_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public void setDefaultMaxPersistentManifoldPoolSize(int value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_defaultMaxPersistentManifoldPoolSize_set(swigCPtr, this, value);
  }

  public int getDefaultMaxPersistentManifoldPoolSize() {
    return CollisionJNI.btDefaultCollisionConstructionInfo_defaultMaxPersistentManifoldPoolSize_get(swigCPtr, this);
  }

  public void setDefaultMaxCollisionAlgorithmPoolSize(int value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_defaultMaxCollisionAlgorithmPoolSize_set(swigCPtr, this, value);
  }

  public int getDefaultMaxCollisionAlgorithmPoolSize() {
    return CollisionJNI.btDefaultCollisionConstructionInfo_defaultMaxCollisionAlgorithmPoolSize_get(swigCPtr, this);
  }

  public void setCustomCollisionAlgorithmMaxElementSize(int value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_customCollisionAlgorithmMaxElementSize_set(swigCPtr, this, value);
  }

  public int getCustomCollisionAlgorithmMaxElementSize() {
    return CollisionJNI.btDefaultCollisionConstructionInfo_customCollisionAlgorithmMaxElementSize_get(swigCPtr, this);
  }

  public void setUseEpaPenetrationAlgorithm(int value) {
    CollisionJNI.btDefaultCollisionConstructionInfo_useEpaPenetrationAlgorithm_set(swigCPtr, this, value);
  }

  public int getUseEpaPenetrationAlgorithm() {
    return CollisionJNI.btDefaultCollisionConstructionInfo_useEpaPenetrationAlgorithm_get(swigCPtr, this);
  }

  public btDefaultCollisionConstructionInfo() {
    this(CollisionJNI.new_btDefaultCollisionConstructionInfo(), true);
  }

}
