/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class SoftRigidAnchorData extends BulletBase {
	private long swigCPtr;
	
	protected SoftRigidAnchorData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftRigidAnchorData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftRigidAnchorData(long cPtr, boolean cMemoryOwn) {
		this("SoftRigidAnchorData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftRigidAnchorData obj) {
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
				SoftbodyJNI.delete_SoftRigidAnchorData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setC0(SWIGTYPE_p_btMatrix3x3FloatData value) {
    SoftbodyJNI.SoftRigidAnchorData_c0_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3FloatData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3FloatData getC0() {
    return new SWIGTYPE_p_btMatrix3x3FloatData(SoftbodyJNI.SoftRigidAnchorData_c0_get(swigCPtr, this), true);
  }

  public void setC1(btVector3FloatData value) {
    SoftbodyJNI.SoftRigidAnchorData_c1_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getC1() {
    long cPtr = SoftbodyJNI.SoftRigidAnchorData_c1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setLocalFrame(btVector3FloatData value) {
    SoftbodyJNI.SoftRigidAnchorData_localFrame_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLocalFrame() {
    long cPtr = SoftbodyJNI.SoftRigidAnchorData_localFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setRigidBody(btRigidBodyFloatData value) {
    SoftbodyJNI.SoftRigidAnchorData_rigidBody_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getRigidBody() {
    long cPtr = SoftbodyJNI.SoftRigidAnchorData_rigidBody_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setNodeIndex(int value) {
    SoftbodyJNI.SoftRigidAnchorData_nodeIndex_set(swigCPtr, this, value);
  }

  public int getNodeIndex() {
    return SoftbodyJNI.SoftRigidAnchorData_nodeIndex_get(swigCPtr, this);
  }

  public void setC2(float value) {
    SoftbodyJNI.SoftRigidAnchorData_c2_set(swigCPtr, this, value);
  }

  public float getC2() {
    return SoftbodyJNI.SoftRigidAnchorData_c2_get(swigCPtr, this);
  }

  public SoftRigidAnchorData() {
    this(SoftbodyJNI.new_SoftRigidAnchorData(), true);
  }

}
