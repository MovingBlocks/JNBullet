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

public class btSliderConstraintDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btSliderConstraintDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSliderConstraintDoubleData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSliderConstraintDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btSliderConstraintDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSliderConstraintDoubleData obj) {
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
				DynamicsJNI.delete_btSliderConstraintDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintDoubleData value) {
    DynamicsJNI.btSliderConstraintDoubleData_typeConstraintData_set(swigCPtr, this, btTypedConstraintDoubleData.getCPtr(value), value);
  }

  public btTypedConstraintDoubleData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btSliderConstraintDoubleData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintDoubleData(cPtr, false);
  }

  public void setRbAFrame(btTransformDoubleData value) {
    DynamicsJNI.btSliderConstraintDoubleData_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbAFrame() {
    long cPtr = DynamicsJNI.btSliderConstraintDoubleData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setRbBFrame(btTransformDoubleData value) {
    DynamicsJNI.btSliderConstraintDoubleData_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbBFrame() {
    long cPtr = DynamicsJNI.btSliderConstraintDoubleData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setLinearUpperLimit(double value) {
    DynamicsJNI.btSliderConstraintDoubleData_linearUpperLimit_set(swigCPtr, this, value);
  }

  public double getLinearUpperLimit() {
    return DynamicsJNI.btSliderConstraintDoubleData_linearUpperLimit_get(swigCPtr, this);
  }

  public void setLinearLowerLimit(double value) {
    DynamicsJNI.btSliderConstraintDoubleData_linearLowerLimit_set(swigCPtr, this, value);
  }

  public double getLinearLowerLimit() {
    return DynamicsJNI.btSliderConstraintDoubleData_linearLowerLimit_get(swigCPtr, this);
  }

  public void setAngularUpperLimit(double value) {
    DynamicsJNI.btSliderConstraintDoubleData_angularUpperLimit_set(swigCPtr, this, value);
  }

  public double getAngularUpperLimit() {
    return DynamicsJNI.btSliderConstraintDoubleData_angularUpperLimit_get(swigCPtr, this);
  }

  public void setAngularLowerLimit(double value) {
    DynamicsJNI.btSliderConstraintDoubleData_angularLowerLimit_set(swigCPtr, this, value);
  }

  public double getAngularLowerLimit() {
    return DynamicsJNI.btSliderConstraintDoubleData_angularLowerLimit_get(swigCPtr, this);
  }

  public void setUseLinearReferenceFrameA(int value) {
    DynamicsJNI.btSliderConstraintDoubleData_useLinearReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseLinearReferenceFrameA() {
    return DynamicsJNI.btSliderConstraintDoubleData_useLinearReferenceFrameA_get(swigCPtr, this);
  }

  public void setUseOffsetForConstraintFrame(int value) {
    DynamicsJNI.btSliderConstraintDoubleData_useOffsetForConstraintFrame_set(swigCPtr, this, value);
  }

  public int getUseOffsetForConstraintFrame() {
    return DynamicsJNI.btSliderConstraintDoubleData_useOffsetForConstraintFrame_get(swigCPtr, this);
  }

  public btSliderConstraintDoubleData() {
    this(DynamicsJNI.new_btSliderConstraintDoubleData(), true);
  }

}
