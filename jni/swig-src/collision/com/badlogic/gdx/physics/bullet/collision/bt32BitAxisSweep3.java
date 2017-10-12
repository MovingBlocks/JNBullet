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

public class bt32BitAxisSweep3 extends btAxisSweep3InternalInt {
	private long swigCPtr;
	
	protected bt32BitAxisSweep3(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.bt32BitAxisSweep3_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bt32BitAxisSweep3, normally you should not need this constructor it's intended for low-level usage. */
	public bt32BitAxisSweep3(long cPtr, boolean cMemoryOwn) {
		this("bt32BitAxisSweep3", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.bt32BitAxisSweep3_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(bt32BitAxisSweep3 obj) {
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
				CollisionJNI.delete_bt32BitAxisSweep3(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public bt32BitAxisSweep3(Vector3f worldAabbMin, Vector3f worldAabbMax, long maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(CollisionJNI.new_bt32BitAxisSweep3__SWIG_0(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public bt32BitAxisSweep3(Vector3f worldAabbMin, Vector3f worldAabbMax, long maxHandles, btOverlappingPairCache pairCache) {
    this(CollisionJNI.new_bt32BitAxisSweep3__SWIG_1(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public bt32BitAxisSweep3(Vector3f worldAabbMin, Vector3f worldAabbMax, long maxHandles) {
    this(CollisionJNI.new_bt32BitAxisSweep3__SWIG_2(worldAabbMin, worldAabbMax, maxHandles), true);
  }

  public bt32BitAxisSweep3(Vector3f worldAabbMin, Vector3f worldAabbMax) {
    this(CollisionJNI.new_bt32BitAxisSweep3__SWIG_3(worldAabbMin, worldAabbMax), true);
  }

}
