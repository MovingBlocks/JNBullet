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

public class SoftBodyTetraData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyTetraData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyTetraData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyTetraData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyTetraData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyTetraData obj) {
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
				SoftbodyJNI.delete_SoftBodyTetraData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setC0(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyTetraData_c0_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getC0() {
    long cPtr = SoftbodyJNI.SoftBodyTetraData_c0_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setMaterial(SoftBodyMaterialData value) {
    SoftbodyJNI.SoftBodyTetraData_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
  }

  public SoftBodyMaterialData getMaterial() {
    long cPtr = SoftbodyJNI.SoftBodyTetraData_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
  }

  public void setNodeIndices(int[] value) {
    SoftbodyJNI.SoftBodyTetraData_nodeIndices_set(swigCPtr, this, value);
  }

  public int[] getNodeIndices() {
    return SoftbodyJNI.SoftBodyTetraData_nodeIndices_get(swigCPtr, this);
}

  public void setRestVolume(float value) {
    SoftbodyJNI.SoftBodyTetraData_restVolume_set(swigCPtr, this, value);
  }

  public float getRestVolume() {
    return SoftbodyJNI.SoftBodyTetraData_restVolume_get(swigCPtr, this);
  }

  public void setC1(float value) {
    SoftbodyJNI.SoftBodyTetraData_c1_set(swigCPtr, this, value);
  }

  public float getC1() {
    return SoftbodyJNI.SoftBodyTetraData_c1_get(swigCPtr, this);
  }

  public void setC2(float value) {
    SoftbodyJNI.SoftBodyTetraData_c2_set(swigCPtr, this, value);
  }

  public float getC2() {
    return SoftbodyJNI.SoftBodyTetraData_c2_get(swigCPtr, this);
  }

  public void setPad(int value) {
    SoftbodyJNI.SoftBodyTetraData_pad_set(swigCPtr, this, value);
  }

  public int getPad() {
    return SoftbodyJNI.SoftBodyTetraData_pad_get(swigCPtr, this);
  }

  public SoftBodyTetraData() {
    this(SoftbodyJNI.new_SoftBodyTetraData(), true);
  }

}
