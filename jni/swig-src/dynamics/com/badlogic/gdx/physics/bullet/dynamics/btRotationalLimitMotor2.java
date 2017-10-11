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

public class btRotationalLimitMotor2 extends BulletBase {
	private long swigCPtr;
	
	protected btRotationalLimitMotor2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btRotationalLimitMotor2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btRotationalLimitMotor2(long cPtr, boolean cMemoryOwn) {
		this("btRotationalLimitMotor2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btRotationalLimitMotor2 obj) {
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
				DynamicsJNI.delete_btRotationalLimitMotor2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLoLimit(float value) {
    DynamicsJNI.btRotationalLimitMotor2_loLimit_set(swigCPtr, this, value);
  }

  public float getLoLimit() {
    return DynamicsJNI.btRotationalLimitMotor2_loLimit_get(swigCPtr, this);
  }

  public void setHiLimit(float value) {
    DynamicsJNI.btRotationalLimitMotor2_hiLimit_set(swigCPtr, this, value);
  }

  public float getHiLimit() {
    return DynamicsJNI.btRotationalLimitMotor2_hiLimit_get(swigCPtr, this);
  }

  public void setBounce(float value) {
    DynamicsJNI.btRotationalLimitMotor2_bounce_set(swigCPtr, this, value);
  }

  public float getBounce() {
    return DynamicsJNI.btRotationalLimitMotor2_bounce_get(swigCPtr, this);
  }

  public void setStopERP(float value) {
    DynamicsJNI.btRotationalLimitMotor2_stopERP_set(swigCPtr, this, value);
  }

  public float getStopERP() {
    return DynamicsJNI.btRotationalLimitMotor2_stopERP_get(swigCPtr, this);
  }

  public void setStopCFM(float value) {
    DynamicsJNI.btRotationalLimitMotor2_stopCFM_set(swigCPtr, this, value);
  }

  public float getStopCFM() {
    return DynamicsJNI.btRotationalLimitMotor2_stopCFM_get(swigCPtr, this);
  }

  public void setMotorERP(float value) {
    DynamicsJNI.btRotationalLimitMotor2_motorERP_set(swigCPtr, this, value);
  }

  public float getMotorERP() {
    return DynamicsJNI.btRotationalLimitMotor2_motorERP_get(swigCPtr, this);
  }

  public void setMotorCFM(float value) {
    DynamicsJNI.btRotationalLimitMotor2_motorCFM_set(swigCPtr, this, value);
  }

  public float getMotorCFM() {
    return DynamicsJNI.btRotationalLimitMotor2_motorCFM_get(swigCPtr, this);
  }

  public void setEnableMotor(boolean value) {
    DynamicsJNI.btRotationalLimitMotor2_enableMotor_set(swigCPtr, this, value);
  }

  public boolean getEnableMotor() {
    return DynamicsJNI.btRotationalLimitMotor2_enableMotor_get(swigCPtr, this);
  }

  public void setTargetVelocity(float value) {
    DynamicsJNI.btRotationalLimitMotor2_targetVelocity_set(swigCPtr, this, value);
  }

  public float getTargetVelocity() {
    return DynamicsJNI.btRotationalLimitMotor2_targetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorForce(float value) {
    DynamicsJNI.btRotationalLimitMotor2_maxMotorForce_set(swigCPtr, this, value);
  }

  public float getMaxMotorForce() {
    return DynamicsJNI.btRotationalLimitMotor2_maxMotorForce_get(swigCPtr, this);
  }

  public void setServoMotor(boolean value) {
    DynamicsJNI.btRotationalLimitMotor2_servoMotor_set(swigCPtr, this, value);
  }

  public boolean getServoMotor() {
    return DynamicsJNI.btRotationalLimitMotor2_servoMotor_get(swigCPtr, this);
  }

  public void setServoTarget(float value) {
    DynamicsJNI.btRotationalLimitMotor2_servoTarget_set(swigCPtr, this, value);
  }

  public float getServoTarget() {
    return DynamicsJNI.btRotationalLimitMotor2_servoTarget_get(swigCPtr, this);
  }

  public void setEnableSpring(boolean value) {
    DynamicsJNI.btRotationalLimitMotor2_enableSpring_set(swigCPtr, this, value);
  }

  public boolean getEnableSpring() {
    return DynamicsJNI.btRotationalLimitMotor2_enableSpring_get(swigCPtr, this);
  }

  public void setSpringStiffness(float value) {
    DynamicsJNI.btRotationalLimitMotor2_springStiffness_set(swigCPtr, this, value);
  }

  public float getSpringStiffness() {
    return DynamicsJNI.btRotationalLimitMotor2_springStiffness_get(swigCPtr, this);
  }

  public void setSpringStiffnessLimited(boolean value) {
    DynamicsJNI.btRotationalLimitMotor2_springStiffnessLimited_set(swigCPtr, this, value);
  }

  public boolean getSpringStiffnessLimited() {
    return DynamicsJNI.btRotationalLimitMotor2_springStiffnessLimited_get(swigCPtr, this);
  }

  public void setSpringDamping(float value) {
    DynamicsJNI.btRotationalLimitMotor2_springDamping_set(swigCPtr, this, value);
  }

  public float getSpringDamping() {
    return DynamicsJNI.btRotationalLimitMotor2_springDamping_get(swigCPtr, this);
  }

  public void setSpringDampingLimited(boolean value) {
    DynamicsJNI.btRotationalLimitMotor2_springDampingLimited_set(swigCPtr, this, value);
  }

  public boolean getSpringDampingLimited() {
    return DynamicsJNI.btRotationalLimitMotor2_springDampingLimited_get(swigCPtr, this);
  }

  public void setEquilibriumPoint(float value) {
    DynamicsJNI.btRotationalLimitMotor2_equilibriumPoint_set(swigCPtr, this, value);
  }

  public float getEquilibriumPoint() {
    return DynamicsJNI.btRotationalLimitMotor2_equilibriumPoint_get(swigCPtr, this);
  }

  public void setCurrentLimitError(float value) {
    DynamicsJNI.btRotationalLimitMotor2_currentLimitError_set(swigCPtr, this, value);
  }

  public float getCurrentLimitError() {
    return DynamicsJNI.btRotationalLimitMotor2_currentLimitError_get(swigCPtr, this);
  }

  public void setCurrentLimitErrorHi(float value) {
    DynamicsJNI.btRotationalLimitMotor2_currentLimitErrorHi_set(swigCPtr, this, value);
  }

  public float getCurrentLimitErrorHi() {
    return DynamicsJNI.btRotationalLimitMotor2_currentLimitErrorHi_get(swigCPtr, this);
  }

  public void setCurrentPosition(float value) {
    DynamicsJNI.btRotationalLimitMotor2_currentPosition_set(swigCPtr, this, value);
  }

  public float getCurrentPosition() {
    return DynamicsJNI.btRotationalLimitMotor2_currentPosition_get(swigCPtr, this);
  }

  public void setCurrentLimit(int value) {
    DynamicsJNI.btRotationalLimitMotor2_currentLimit_set(swigCPtr, this, value);
  }

  public int getCurrentLimit() {
    return DynamicsJNI.btRotationalLimitMotor2_currentLimit_get(swigCPtr, this);
  }

  public btRotationalLimitMotor2() {
    this(DynamicsJNI.new_btRotationalLimitMotor2__SWIG_0(), true);
  }

  public btRotationalLimitMotor2(btRotationalLimitMotor2 limot) {
    this(DynamicsJNI.new_btRotationalLimitMotor2__SWIG_1(btRotationalLimitMotor2.getCPtr(limot), limot), true);
  }

  public boolean isLimited() {
    return DynamicsJNI.btRotationalLimitMotor2_isLimited(swigCPtr, this);
  }

  public void testLimitValue(float test_value) {
    DynamicsJNI.btRotationalLimitMotor2_testLimitValue(swigCPtr, this, test_value);
  }

}
