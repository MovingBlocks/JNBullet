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

public class btCollisionShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionShapeData(long cPtr, boolean cMemoryOwn) {
		this("btCollisionShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionShapeData obj) {
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
				CollisionJNI.delete_btCollisionShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setName(String value) {
    CollisionJNI.btCollisionShapeData_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return CollisionJNI.btCollisionShapeData_name_get(swigCPtr, this);
  }

  public void setShapeType(int value) {
    CollisionJNI.btCollisionShapeData_shapeType_set(swigCPtr, this, value);
  }

  public int getShapeType() {
    return CollisionJNI.btCollisionShapeData_shapeType_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    CollisionJNI.btCollisionShapeData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return CollisionJNI.btCollisionShapeData_padding_get(swigCPtr, this);
  }

  public btCollisionShapeData() {
    this(CollisionJNI.new_btCollisionShapeData(), true);
  }

}
