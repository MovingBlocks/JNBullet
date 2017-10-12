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

public class btPrimitiveManagerBase extends BulletBase {
	private long swigCPtr;
	
	protected btPrimitiveManagerBase(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPrimitiveManagerBase, normally you should not need this constructor it's intended for low-level usage. */ 
	public btPrimitiveManagerBase(long cPtr, boolean cMemoryOwn) {
		this("btPrimitiveManagerBase", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btPrimitiveManagerBase obj) {
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
				CollisionJNI.delete_btPrimitiveManagerBase(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public boolean is_trimesh() {
    return CollisionJNI.btPrimitiveManagerBase_is_trimesh(swigCPtr, this);
  }

  public int get_primitive_count() {
    return CollisionJNI.btPrimitiveManagerBase_get_primitive_count(swigCPtr, this);
  }

  public void get_primitive_box(int prim_index, btAABB primbox) {
    CollisionJNI.btPrimitiveManagerBase_get_primitive_box(swigCPtr, this, prim_index, btAABB.getCPtr(primbox), primbox);
  }

  public void get_primitive_triangle(int prim_index, btPrimitiveTriangle triangle) {
    CollisionJNI.btPrimitiveManagerBase_get_primitive_triangle(swigCPtr, this, prim_index, btPrimitiveTriangle.getCPtr(triangle), triangle);
  }

}
