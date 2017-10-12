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

public class btCollisionConfiguration extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionConfiguration(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionConfiguration, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionConfiguration(long cPtr, boolean cMemoryOwn) {
		this("btCollisionConfiguration", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionConfiguration obj) {
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
				CollisionJNI.delete_btCollisionConfiguration(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btPoolAllocator getPersistentManifoldPool() {
    long cPtr = CollisionJNI.btCollisionConfiguration_getPersistentManifoldPool(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public btPoolAllocator getCollisionAlgorithmPool() {
    long cPtr = CollisionJNI.btCollisionConfiguration_getCollisionAlgorithmPool(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public btCollisionAlgorithmCreateFunc getCollisionAlgorithmCreateFunc(int proxyType0, int proxyType1) {
    long cPtr = CollisionJNI.btCollisionConfiguration_getCollisionAlgorithmCreateFunc(swigCPtr, this, proxyType0, proxyType1);
    return (cPtr == 0) ? null : new btCollisionAlgorithmCreateFunc(cPtr, false);
  }

}
