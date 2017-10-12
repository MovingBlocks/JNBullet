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

public class btMinkowskiSumShape extends btConvexInternalShape {
	private long swigCPtr;
	
	protected btMinkowskiSumShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btMinkowskiSumShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMinkowskiSumShape, normally you should not need this constructor it's intended for low-level usage. */
	public btMinkowskiSumShape(long cPtr, boolean cMemoryOwn) {
		this("btMinkowskiSumShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btMinkowskiSumShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMinkowskiSumShape obj) {
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
				CollisionJNI.delete_btMinkowskiSumShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btMinkowskiSumShape(btConvexShape shapeA, btConvexShape shapeB) {
    this(CollisionJNI.new_btMinkowskiSumShape(btConvexShape.getCPtr(shapeA), shapeA, btConvexShape.getCPtr(shapeB), shapeB), true);
  }

  public void setTransformA(Matrix4f transA) {
    CollisionJNI.btMinkowskiSumShape_setTransformA(swigCPtr, this, transA);
  }

  public void setTransformB(Matrix4f transB) {
    CollisionJNI.btMinkowskiSumShape_setTransformB(swigCPtr, this, transB);
  }

  public Matrix4f getTransformA() {
	return CollisionJNI.btMinkowskiSumShape_getTransformA(swigCPtr, this);
}

  public Matrix4f GetTransformB() {
	return CollisionJNI.btMinkowskiSumShape_GetTransformB(swigCPtr, this);
}

  public btConvexShape getShapeA() {
    long cPtr = CollisionJNI.btMinkowskiSumShape_getShapeA(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

  public btConvexShape getShapeB() {
    long cPtr = CollisionJNI.btMinkowskiSumShape_getShapeB(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

}
