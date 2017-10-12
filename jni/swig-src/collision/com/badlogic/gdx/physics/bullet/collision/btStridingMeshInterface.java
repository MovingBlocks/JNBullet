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

public class btStridingMeshInterface extends BulletBase {
	private long swigCPtr;
	
	protected btStridingMeshInterface(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btStridingMeshInterface, normally you should not need this constructor it's intended for low-level usage. */ 
	public btStridingMeshInterface(long cPtr, boolean cMemoryOwn) {
		this("btStridingMeshInterface", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btStridingMeshInterface obj) {
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
				CollisionJNI.delete_btStridingMeshInterface(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void InternalProcessAllTriangles(btInternalTriangleIndexCallback callback, Vector3f aabbMin, Vector3f aabbMax) {
    CollisionJNI.btStridingMeshInterface_InternalProcessAllTriangles(swigCPtr, this, btInternalTriangleIndexCallback.getCPtr(callback), callback, aabbMin, aabbMax);
  }

  public void calculateAabbBruteForce(Vector3f aabbMin, Vector3f aabbMax) {
    CollisionJNI.btStridingMeshInterface_calculateAabbBruteForce(swigCPtr, this, aabbMin, aabbMax);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btStridingMeshInterface_getLockedVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btStridingMeshInterface_getLockedVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btStridingMeshInterface_getLockedReadOnlyVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btStridingMeshInterface_getLockedReadOnlyVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public void unLockVertexBase(int subpart) {
    CollisionJNI.btStridingMeshInterface_unLockVertexBase(swigCPtr, this, subpart);
  }

  public void unLockReadOnlyVertexBase(int subpart) {
    CollisionJNI.btStridingMeshInterface_unLockReadOnlyVertexBase(swigCPtr, this, subpart);
  }

  public int getNumSubParts() {
    return CollisionJNI.btStridingMeshInterface_getNumSubParts(swigCPtr, this);
  }

  public void preallocateVertices(int numverts) {
    CollisionJNI.btStridingMeshInterface_preallocateVertices(swigCPtr, this, numverts);
  }

  public void preallocateIndices(int numindices) {
    CollisionJNI.btStridingMeshInterface_preallocateIndices(swigCPtr, this, numindices);
  }

  public boolean hasPremadeAabb() {
    return CollisionJNI.btStridingMeshInterface_hasPremadeAabb(swigCPtr, this);
  }

  public void setPremadeAabb(Vector3f aabbMin, Vector3f aabbMax) {
    CollisionJNI.btStridingMeshInterface_setPremadeAabb(swigCPtr, this, aabbMin, aabbMax);
  }

  public void getPremadeAabb(btVector3 aabbMin, btVector3 aabbMax) {
    CollisionJNI.btStridingMeshInterface_getPremadeAabb(swigCPtr, this, btVector3.getCPtr(aabbMin), aabbMin, btVector3.getCPtr(aabbMax), aabbMax);
  }

  public Vector3f getScaling() {
	return CollisionJNI.btStridingMeshInterface_getScaling(swigCPtr, this);
}

  public void setScaling(Vector3f scaling) {
    CollisionJNI.btStridingMeshInterface_setScaling(swigCPtr, this, scaling);
  }

  public int calculateSerializeBufferSize() {
    return CollisionJNI.btStridingMeshInterface_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(long dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return CollisionJNI.btStridingMeshInterface_serialize(swigCPtr, this, dataBuffer, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

}
