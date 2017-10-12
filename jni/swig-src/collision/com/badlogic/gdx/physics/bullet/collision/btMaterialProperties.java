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

public class btMaterialProperties extends BulletBase {
	private long swigCPtr;
	
	protected btMaterialProperties(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMaterialProperties, normally you should not need this constructor it's intended for low-level usage. */ 
	public btMaterialProperties(long cPtr, boolean cMemoryOwn) {
		this("btMaterialProperties", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btMaterialProperties obj) {
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
				CollisionJNI.delete_btMaterialProperties(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNumMaterials(int value) {
    CollisionJNI.btMaterialProperties_numMaterials_set(swigCPtr, this, value);
  }

  public int getNumMaterials() {
    return CollisionJNI.btMaterialProperties_numMaterials_get(swigCPtr, this);
  }

  public void setMaterialBase(java.nio.ByteBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btMaterialProperties_materialBase_set(swigCPtr, this, value);
    }
  }

  public java.nio.ByteBuffer getMaterialBase() {
    return CollisionJNI.btMaterialProperties_materialBase_get(swigCPtr, this);
}

  public void setMaterialStride(int value) {
    CollisionJNI.btMaterialProperties_materialStride_set(swigCPtr, this, value);
  }

  public int getMaterialStride() {
    return CollisionJNI.btMaterialProperties_materialStride_get(swigCPtr, this);
  }

  public void setMaterialType(int value) {
    CollisionJNI.btMaterialProperties_materialType_set(swigCPtr, this, value);
  }

  public int getMaterialType() {
    return CollisionJNI.btMaterialProperties_materialType_get(swigCPtr, this);
  }

  public void setNumTriangles(int value) {
    CollisionJNI.btMaterialProperties_numTriangles_set(swigCPtr, this, value);
  }

  public int getNumTriangles() {
    return CollisionJNI.btMaterialProperties_numTriangles_get(swigCPtr, this);
  }

  public void setTriangleMaterialsBase(java.nio.ByteBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btMaterialProperties_triangleMaterialsBase_set(swigCPtr, this, value);
    }
  }

  public java.nio.ByteBuffer getTriangleMaterialsBase() {
    return CollisionJNI.btMaterialProperties_triangleMaterialsBase_get(swigCPtr, this);
}

  public void setTriangleMaterialStride(int value) {
    CollisionJNI.btMaterialProperties_triangleMaterialStride_set(swigCPtr, this, value);
  }

  public int getTriangleMaterialStride() {
    return CollisionJNI.btMaterialProperties_triangleMaterialStride_get(swigCPtr, this);
  }

  public void setTriangleType(int value) {
    CollisionJNI.btMaterialProperties_triangleType_set(swigCPtr, this, value);
  }

  public int getTriangleType() {
    return CollisionJNI.btMaterialProperties_triangleType_get(swigCPtr, this);
  }

  public btMaterialProperties() {
    this(CollisionJNI.new_btMaterialProperties(), true);
  }

}
