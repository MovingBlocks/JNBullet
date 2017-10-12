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

public class btCollisionShape extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionShape, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionShape(long cPtr, boolean cMemoryOwn) {
		this("btCollisionShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionShape obj) {
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
				CollisionJNI.delete_btCollisionShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}


  public static btCollisionShape newDerivedObject(long swigCPtr, boolean owner) {
    if (swigCPtr == 0) {
      return null;
    }
    
    final int shapeType = CollisionJNI.btCollisionShape_getShapeType(swigCPtr, null);
    
    switch (shapeType) {
    case BroadphaseNativeTypes.BOX_SHAPE_PROXYTYPE:
      return new btBoxShape(swigCPtr, owner);
    case BroadphaseNativeTypes.TRIANGLE_SHAPE_PROXYTYPE:
      return new btTriangleShape(swigCPtr, owner);
    case BroadphaseNativeTypes.TETRAHEDRAL_SHAPE_PROXYTYPE:
      return new btBU_Simplex1to4(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_TRIANGLEMESH_SHAPE_PROXYTYPE:
      return new btConvexTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_HULL_SHAPE_PROXYTYPE:
      return new btConvexHullShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_POINT_CLOUD_SHAPE_PROXYTYPE:
      return new btConvexPointCloudShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_POLYHEDRAL_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.SPHERE_SHAPE_PROXYTYPE:
      return new btSphereShape(swigCPtr, owner);
    case BroadphaseNativeTypes.MULTI_SPHERE_SHAPE_PROXYTYPE:
      return new btMultiSphereShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CAPSULE_SHAPE_PROXYTYPE:
      return new btCapsuleShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONE_SHAPE_PROXYTYPE:
      return new btConeShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_SHAPE_PROXYTYPE:
      return new btConvexShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CYLINDER_SHAPE_PROXYTYPE:
      return new btCylinderShape(swigCPtr, owner);
    case BroadphaseNativeTypes.UNIFORM_SCALING_SHAPE_PROXYTYPE:
      return new btUniformScalingShape(swigCPtr, owner);
    case BroadphaseNativeTypes.MINKOWSKI_SUM_SHAPE_PROXYTYPE:
      // btMinkowskiSumShape is actually a MINKOWSKI_DIFFERENCE_SHAPE_PROXYTYPE and nothing
      // is one of these
      break;
    case BroadphaseNativeTypes.MINKOWSKI_DIFFERENCE_SHAPE_PROXYTYPE:
      return new btMinkowskiSumShape(swigCPtr, owner);
    case BroadphaseNativeTypes.BOX_2D_SHAPE_PROXYTYPE:
      return new btBox2dShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_2D_SHAPE_PROXYTYPE:
      return new btConvex2dShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_CONVEX_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.TRIANGLE_MESH_SHAPE_PROXYTYPE:
      return new btBvhTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.SCALED_TRIANGLE_MESH_SHAPE_PROXYTYPE:
      return new btScaledBvhTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.FAST_CONCAVE_MESH_PROXYTYPE:
      // TODO I couldn't find one
      break;
    case BroadphaseNativeTypes.TERRAIN_SHAPE_PROXYTYPE:
      return new btHeightfieldTerrainShape(swigCPtr, owner);
/*
    case BroadphaseNativeTypes.GIMPACT_SHAPE_PROXYTYPE:
      return new btGimpactShape(swigCPtr, owner);
*/
    case BroadphaseNativeTypes.MULTIMATERIAL_TRIANGLE_MESH_PROXYTYPE:
      return new btMultimaterialTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.EMPTY_SHAPE_PROXYTYPE:
      return new btEmptyShape(swigCPtr, owner);
    case BroadphaseNativeTypes.STATIC_PLANE_PROXYTYPE:
      return new btStaticPlaneShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_CONCAVE_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.COMPOUND_SHAPE_PROXYTYPE:
      return new btCompoundShape(swigCPtr, owner);
/*
    case BroadphaseNativeTypes.SOFTBODY_SHAPE_PROXYTYPE:
      return new btSoftBodyShape(swigCPtr, owner);
    case BroadphaseNativeTypes.HFFLUID_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
    case BroadphaseNativeTypes.HFFLUID_BUOYANT_CONVEX_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
    case BroadphaseNativeTypes.INVALID_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
*/
    }

    throw new RuntimeException("Unknown shape type " + Integer.toString(shapeType));
  }

  public void getAabb(Matrix4f t, Vector3f aabbMin, Vector3f aabbMax) {
    CollisionJNI.btCollisionShape_getAabb(swigCPtr, this, t, aabbMin, aabbMax);
  }

  public void getBoundingSphere(Vector3f center, SWIGTYPE_p_float radius) {
    CollisionJNI.btCollisionShape_getBoundingSphere(swigCPtr, this, center, SWIGTYPE_p_float.getCPtr(radius));
  }

  public float getAngularMotionDisc() {
    return CollisionJNI.btCollisionShape_getAngularMotionDisc(swigCPtr, this);
  }

  public float getContactBreakingThreshold(float defaultContactThresholdFactor) {
    return CollisionJNI.btCollisionShape_getContactBreakingThreshold(swigCPtr, this, defaultContactThresholdFactor);
  }

  public void calculateTemporalAabb(Matrix4f curTrans, Vector3f linvel, Vector3f angvel, float timeStep, Vector3f temporalAabbMin, Vector3f temporalAabbMax) {
    CollisionJNI.btCollisionShape_calculateTemporalAabb(swigCPtr, this, curTrans, linvel, angvel, timeStep, temporalAabbMin, temporalAabbMax);
  }

  public boolean isPolyhedral() {
    return CollisionJNI.btCollisionShape_isPolyhedral(swigCPtr, this);
  }

  public boolean isConvex2d() {
    return CollisionJNI.btCollisionShape_isConvex2d(swigCPtr, this);
  }

  public boolean isConvex() {
    return CollisionJNI.btCollisionShape_isConvex(swigCPtr, this);
  }

  public boolean isNonMoving() {
    return CollisionJNI.btCollisionShape_isNonMoving(swigCPtr, this);
  }

  public boolean isConcave() {
    return CollisionJNI.btCollisionShape_isConcave(swigCPtr, this);
  }

  public boolean isCompound() {
    return CollisionJNI.btCollisionShape_isCompound(swigCPtr, this);
  }

  public boolean isSoftBody() {
    return CollisionJNI.btCollisionShape_isSoftBody(swigCPtr, this);
  }

  public boolean isInfinite() {
    return CollisionJNI.btCollisionShape_isInfinite(swigCPtr, this);
  }

  public void setLocalScaling(Vector3f scaling) {
    CollisionJNI.btCollisionShape_setLocalScaling(swigCPtr, this, scaling);
  }

  public Vector3f getLocalScaling() {
	return CollisionJNI.btCollisionShape_getLocalScaling(swigCPtr, this);
}

  public void calculateLocalInertia(float mass, Vector3f inertia) {
    CollisionJNI.btCollisionShape_calculateLocalInertia(swigCPtr, this, mass, inertia);
  }

  public String getName() {
    return CollisionJNI.btCollisionShape_getName(swigCPtr, this);
  }

  public int getShapeType() {
    return CollisionJNI.btCollisionShape_getShapeType(swigCPtr, this);
  }

  public Vector3f getAnisotropicRollingFrictionDirection() {
	return CollisionJNI.btCollisionShape_getAnisotropicRollingFrictionDirection(swigCPtr, this);
}

  public void setMargin(float margin) {
    CollisionJNI.btCollisionShape_setMargin(swigCPtr, this, margin);
  }

  public float getMargin() {
    return CollisionJNI.btCollisionShape_getMargin(swigCPtr, this);
  }

  public void setUserPointer(long userPtr) {
    CollisionJNI.btCollisionShape_setUserPointer(swigCPtr, this, userPtr);
  }

  public long getUserPointer() {
    return CollisionJNI.btCollisionShape_getUserPointer(swigCPtr, this);
  }

  public void setUserIndex(int index) {
    CollisionJNI.btCollisionShape_setUserIndex(swigCPtr, this, index);
  }

  public int getUserIndex() {
    return CollisionJNI.btCollisionShape_getUserIndex(swigCPtr, this);
  }

  public int calculateSerializeBufferSize() {
    return CollisionJNI.btCollisionShape_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(long dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return CollisionJNI.btCollisionShape_serialize(swigCPtr, this, dataBuffer, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleShape(SWIGTYPE_p_btSerializer serializer) {
    CollisionJNI.btCollisionShape_serializeSingleShape(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

}
