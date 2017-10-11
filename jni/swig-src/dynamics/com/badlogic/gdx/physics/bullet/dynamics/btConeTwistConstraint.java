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
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConeTwistConstraint extends btTypedConstraint {
	private long swigCPtr;
	
	protected btConeTwistConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btConeTwistConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConeTwistConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btConeTwistConstraint(long cPtr, boolean cMemoryOwn) {
		this("btConeTwistConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btConeTwistConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConeTwistConstraint obj) {
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
				DynamicsJNI.delete_btConeTwistConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConeTwistConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    this(DynamicsJNI.new_btConeTwistConstraint__SWIG_0(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame), true);
  }

  public btConeTwistConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
    this(DynamicsJNI.new_btConeTwistConstraint__SWIG_1(btRigidBody.getCPtr(rbA), rbA, rbAFrame), true);
  }

  public void getInfo1NonVirtual(btTypedConstraint.btConstraintInfo1 info) {
    DynamicsJNI.btConeTwistConstraint_getInfo1NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo1.getCPtr(info), info);
  }

  public void getInfo2NonVirtual(btTypedConstraint.btConstraintInfo2 info, Matrix4 transA, Matrix4 transB, Matrix3 invInertiaWorldA, Matrix3 invInertiaWorldB) {
    DynamicsJNI.btConeTwistConstraint_getInfo2NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info, transA, transB, invInertiaWorldA, invInertiaWorldB);
  }

  public void updateRHS(float timeStep) {
    DynamicsJNI.btConeTwistConstraint_updateRHS(swigCPtr, this, timeStep);
  }

  public btRigidBody getRigidBodyA() {
	return btRigidBody.getInstance(DynamicsJNI.btConeTwistConstraint_getRigidBodyA(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyB() {
	return btRigidBody.getInstance(DynamicsJNI.btConeTwistConstraint_getRigidBodyB(swigCPtr, this), false);
}

  public void setAngularOnly(boolean angularOnly) {
    DynamicsJNI.btConeTwistConstraint_setAngularOnly(swigCPtr, this, angularOnly);
  }

  public boolean getAngularOnly() {
    return DynamicsJNI.btConeTwistConstraint_getAngularOnly(swigCPtr, this);
  }

  public void setLimit(int limitIndex, float limitValue) {
    DynamicsJNI.btConeTwistConstraint_setLimit__SWIG_0(swigCPtr, this, limitIndex, limitValue);
  }

  public float getLimit(int limitIndex) {
    return DynamicsJNI.btConeTwistConstraint_getLimit(swigCPtr, this, limitIndex);
  }

  public void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness, float _biasFactor, float _relaxationFactor) {
    DynamicsJNI.btConeTwistConstraint_setLimit__SWIG_1(swigCPtr, this, _swingSpan1, _swingSpan2, _twistSpan, _softness, _biasFactor, _relaxationFactor);
  }

  public void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness, float _biasFactor) {
    DynamicsJNI.btConeTwistConstraint_setLimit__SWIG_2(swigCPtr, this, _swingSpan1, _swingSpan2, _twistSpan, _softness, _biasFactor);
  }

  public void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness) {
    DynamicsJNI.btConeTwistConstraint_setLimit__SWIG_3(swigCPtr, this, _swingSpan1, _swingSpan2, _twistSpan, _softness);
  }

  public void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan) {
    DynamicsJNI.btConeTwistConstraint_setLimit__SWIG_4(swigCPtr, this, _swingSpan1, _swingSpan2, _twistSpan);
  }

  public Matrix4 getAFrame() {
	return DynamicsJNI.btConeTwistConstraint_getAFrame(swigCPtr, this);
}

  public Matrix4 getBFrame() {
	return DynamicsJNI.btConeTwistConstraint_getBFrame(swigCPtr, this);
}

  public int getSolveTwistLimit() {
    return DynamicsJNI.btConeTwistConstraint_getSolveTwistLimit(swigCPtr, this);
  }

  public int getSolveSwingLimit() {
    return DynamicsJNI.btConeTwistConstraint_getSolveSwingLimit(swigCPtr, this);
  }

  public float getTwistLimitSign() {
    return DynamicsJNI.btConeTwistConstraint_getTwistLimitSign(swigCPtr, this);
  }

  public void calcAngleInfo() {
    DynamicsJNI.btConeTwistConstraint_calcAngleInfo(swigCPtr, this);
  }

  public void calcAngleInfo2(Matrix4 transA, Matrix4 transB, Matrix3 invInertiaWorldA, Matrix3 invInertiaWorldB) {
    DynamicsJNI.btConeTwistConstraint_calcAngleInfo2(swigCPtr, this, transA, transB, invInertiaWorldA, invInertiaWorldB);
  }

  public float getSwingSpan1() {
    return DynamicsJNI.btConeTwistConstraint_getSwingSpan1(swigCPtr, this);
  }

  public float getSwingSpan2() {
    return DynamicsJNI.btConeTwistConstraint_getSwingSpan2(swigCPtr, this);
  }

  public float getTwistSpan() {
    return DynamicsJNI.btConeTwistConstraint_getTwistSpan(swigCPtr, this);
  }

  public float getLimitSoftness() {
    return DynamicsJNI.btConeTwistConstraint_getLimitSoftness(swigCPtr, this);
  }

  public float getBiasFactor() {
    return DynamicsJNI.btConeTwistConstraint_getBiasFactor(swigCPtr, this);
  }

  public float getRelaxationFactor() {
    return DynamicsJNI.btConeTwistConstraint_getRelaxationFactor(swigCPtr, this);
  }

  public float getTwistAngle() {
    return DynamicsJNI.btConeTwistConstraint_getTwistAngle(swigCPtr, this);
  }

  public boolean isPastSwingLimit() {
    return DynamicsJNI.btConeTwistConstraint_isPastSwingLimit(swigCPtr, this);
  }

  public float getDamping() {
    return DynamicsJNI.btConeTwistConstraint_getDamping(swigCPtr, this);
  }

  public void setDamping(float damping) {
    DynamicsJNI.btConeTwistConstraint_setDamping(swigCPtr, this, damping);
  }

  public void enableMotor(boolean b) {
    DynamicsJNI.btConeTwistConstraint_enableMotor(swigCPtr, this, b);
  }

  public boolean isMotorEnabled() {
    return DynamicsJNI.btConeTwistConstraint_isMotorEnabled(swigCPtr, this);
  }

  public float getMaxMotorImpulse() {
    return DynamicsJNI.btConeTwistConstraint_getMaxMotorImpulse(swigCPtr, this);
  }

  public boolean isMaxMotorImpulseNormalized() {
    return DynamicsJNI.btConeTwistConstraint_isMaxMotorImpulseNormalized(swigCPtr, this);
  }

  public void setMaxMotorImpulse(float maxMotorImpulse) {
    DynamicsJNI.btConeTwistConstraint_setMaxMotorImpulse(swigCPtr, this, maxMotorImpulse);
  }

  public void setMaxMotorImpulseNormalized(float maxMotorImpulse) {
    DynamicsJNI.btConeTwistConstraint_setMaxMotorImpulseNormalized(swigCPtr, this, maxMotorImpulse);
  }

  public float getFixThresh() {
    return DynamicsJNI.btConeTwistConstraint_getFixThresh(swigCPtr, this);
  }

  public void setFixThresh(float fixThresh) {
    DynamicsJNI.btConeTwistConstraint_setFixThresh(swigCPtr, this, fixThresh);
  }

  public void setMotorTarget(Quaternion q) {
    DynamicsJNI.btConeTwistConstraint_setMotorTarget(swigCPtr, this, q);
  }

  public Quaternion getMotorTarget() {
	return DynamicsJNI.btConeTwistConstraint_getMotorTarget(swigCPtr, this);
}

  public void setMotorTargetInConstraintSpace(Quaternion q) {
    DynamicsJNI.btConeTwistConstraint_setMotorTargetInConstraintSpace(swigCPtr, this, q);
  }

  public Vector3 GetPointForAngle(float fAngleInRadians, float fLength) {
	return DynamicsJNI.btConeTwistConstraint_GetPointForAngle(swigCPtr, this, fAngleInRadians, fLength);
}

  public void setParam(int num, float value, int axis) {
    DynamicsJNI.btConeTwistConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    DynamicsJNI.btConeTwistConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public void setFrames(Matrix4 frameA, Matrix4 frameB) {
    DynamicsJNI.btConeTwistConstraint_setFrames(swigCPtr, this, frameA, frameB);
  }

  public Matrix4 getFrameOffsetA() {
	return DynamicsJNI.btConeTwistConstraint_getFrameOffsetA(swigCPtr, this);
}

  public Matrix4 getFrameOffsetB() {
	return DynamicsJNI.btConeTwistConstraint_getFrameOffsetB(swigCPtr, this);
}

  public float getParam(int num, int axis) {
    return DynamicsJNI.btConeTwistConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return DynamicsJNI.btConeTwistConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public int getFlags() {
    return DynamicsJNI.btConeTwistConstraint_getFlags(swigCPtr, this);
  }

}
