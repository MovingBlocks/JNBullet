/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class btHinge2Constraint extends btGeneric6DofSpring2Constraint {
	private long swigCPtr;
	
	protected btHinge2Constraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btHinge2Constraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHinge2Constraint, normally you should not need this constructor it's intended for low-level usage. */
	public btHinge2Constraint(long cPtr, boolean cMemoryOwn) {
		this("btHinge2Constraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btHinge2Constraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btHinge2Constraint obj) {
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
				DynamicsJNI.delete_btHinge2Constraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btHinge2Constraint(btRigidBody rbA, btRigidBody rbB, Vector3f anchor, Vector3f axis1, Vector3f axis2) {
    this(DynamicsJNI.new_btHinge2Constraint(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, anchor, axis1, axis2), true);
  }

  public Vector3f getAnchor() {
	return DynamicsJNI.btHinge2Constraint_getAnchor(swigCPtr, this);
}

  public Vector3f getAnchor2() {
	return DynamicsJNI.btHinge2Constraint_getAnchor2(swigCPtr, this);
}

  public Vector3f getAxis1() {
	return DynamicsJNI.btHinge2Constraint_getAxis1(swigCPtr, this);
}

  public Vector3f getAxis2() {
	return DynamicsJNI.btHinge2Constraint_getAxis2(swigCPtr, this);
}

  public float getAngle1() {
    return DynamicsJNI.btHinge2Constraint_getAngle1(swigCPtr, this);
  }

  public float getAngle2() {
    return DynamicsJNI.btHinge2Constraint_getAngle2(swigCPtr, this);
  }

  public void setUpperLimit(float ang1max) {
    DynamicsJNI.btHinge2Constraint_setUpperLimit(swigCPtr, this, ang1max);
  }

  public void setLowerLimit(float ang1min) {
    DynamicsJNI.btHinge2Constraint_setLowerLimit(swigCPtr, this, ang1min);
  }

}
