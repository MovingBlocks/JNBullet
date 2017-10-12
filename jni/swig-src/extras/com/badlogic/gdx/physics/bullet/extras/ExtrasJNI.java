/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
import com.badlogic.gdx.utils.Pool;

public class ExtrasJNI {
  public final static native long new_btStringArray__SWIG_0();
  public final static native void delete_btStringArray(long jarg1);
  public final static native long new_btStringArray__SWIG_1(long jarg1, btStringArray jarg1_);
  public final static native int btStringArray_size(long jarg1, btStringArray jarg1_);
  public final static native String btStringArray_at__SWIG_0(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native void btStringArray_clear(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_pop_back(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_resizeNoInitialize(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native void btStringArray_resize__SWIG_0(long jarg1, btStringArray jarg1_, int jarg2, String jarg3);
  public final static native void btStringArray_resize__SWIG_1(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native String btStringArray_expandNonInitializing(long jarg1, btStringArray jarg1_);
  public final static native String btStringArray_expand__SWIG_0(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native String btStringArray_expand__SWIG_1(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_push_back(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native int btStringArray_capacity(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_reserve(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native long new_btStringArray_less();
  public final static native void delete_btStringArray_less(long jarg1);
  public final static native void btStringArray_swap(long jarg1, btStringArray jarg1_, int jarg2, int jarg3);
  public final static native int btStringArray_findBinarySearch(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native int btStringArray_findLinearSearch(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native void btStringArray_remove(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native void btStringArray_initializeFromBuffer(long jarg1, btStringArray jarg1_, long jarg2, int jarg3, int jarg4);
  public final static native void btStringArray_copyFromArray(long jarg1, btStringArray jarg1_, long jarg2, btStringArray jarg2_);
  public final static native long new_btWorldImporter(long jarg1, btDynamicsWorld jarg1_);
  public final static native void delete_btWorldImporter(long jarg1);
  public final static native void btWorldImporter_deleteAllData(long jarg1, btWorldImporter jarg1_);
  public final static native void btWorldImporter_setVerboseMode(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getVerboseMode(long jarg1, btWorldImporter jarg1_);
  public final static native int btWorldImporter_getNumCollisionShapes(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getCollisionShapeByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumRigidBodies(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getRigidBodyByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumConstraints(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getConstraintByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumBvhs(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getBvhByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumTriangleInfoMaps(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getTriangleInfoMapByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native long btWorldImporter_getCollisionShapeByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native long btWorldImporter_getRigidBodyByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native long btWorldImporter_getConstraintByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native String btWorldImporter_getNameForPointer__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2);
  public final static native void btWorldImporter_setDynamicsWorldInfo(long jarg1, btWorldImporter jarg1_, Vector3f jarg2, long jarg3, btContactSolverInfo jarg3_);
  public final static native long btWorldImporter_createRigidBody(long jarg1, btWorldImporter jarg1_, boolean jarg2, float jarg3, Matrix4f jarg4, long jarg5, btCollisionShape jarg5_, String jarg6);
  public final static native long btWorldImporter_createCollisionObject(long jarg1, btWorldImporter jarg1_, Matrix4f jarg2, long jarg3, btCollisionShape jarg3_, String jarg4);
  public final static native long btWorldImporter_createPlaneShape(long jarg1, btWorldImporter jarg1_, Vector3f jarg2, float jarg3);
  public final static native long btWorldImporter_createBoxShape(long jarg1, btWorldImporter jarg1_, Vector3f jarg2);
  public final static native long btWorldImporter_createSphereShape(long jarg1, btWorldImporter jarg1_, float jarg2);
  public final static native long btWorldImporter_createCapsuleShapeX(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCapsuleShapeY(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCapsuleShapeZ(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeX(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeY(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeZ(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createConeShapeX(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createConeShapeY(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createConeShapeZ(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createTriangleMeshContainer(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createBvhTriangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_, long jarg3, btOptimizedBvh jarg3_);
  public final static native long btWorldImporter_createConvexTriangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_);
  public final static native long btWorldImporter_createGimpactShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_);
  public final static native long btWorldImporter_createStridingMeshInterfaceData(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterfaceData jarg2_);
  public final static native long btWorldImporter_createConvexHullShape(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createCompoundShape(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createScaledTrangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btBvhTriangleMeshShape jarg2_, Vector3f jarg3);
  public final static native long btWorldImporter_createMultiSphereShape(long jarg1, btWorldImporter jarg1_, long jarg2, btVector3 jarg2_, java.nio.FloatBuffer jarg3, int jarg4);
  public final static native long btWorldImporter_createMeshInterface(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterfaceData jarg2_);
  public final static native long btWorldImporter_createOptimizedBvh(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createTriangleInfoMap(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createPoint2PointConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Vector3f jarg4, Vector3f jarg5);
  public final static native long btWorldImporter_createPoint2PointConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Vector3f jarg3);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5, boolean jarg6);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_2(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4f jarg3, boolean jarg4);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_3(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4f jarg3);
  public final static native long btWorldImporter_createConeTwistConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5);
  public final static native long btWorldImporter_createConeTwistConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4f jarg3);
  public final static native long btWorldImporter_createGeneric6DofConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5, boolean jarg6);
  public final static native long btWorldImporter_createGeneric6DofConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4f jarg3, boolean jarg4);
  public final static native long btWorldImporter_createGeneric6DofSpringConstraint(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5, boolean jarg6);
  public final static native long btWorldImporter_createGeneric6DofSpring2Constraint(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5, int jarg6);
  public final static native long btWorldImporter_createSliderConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4f jarg4, Matrix4f jarg5, boolean jarg6);
  public final static native long btWorldImporter_createSliderConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4f jarg3, boolean jarg4);
  public final static native long btWorldImporter_createGearConstraint(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Vector3f jarg4, Vector3f jarg5, float jarg6);
  public final static native long new_btBulletWorldImporter__SWIG_0(long jarg1, btDynamicsWorld jarg1_);
  public final static native long new_btBulletWorldImporter__SWIG_1();
  public final static native void delete_btBulletWorldImporter(long jarg1);
  public final static native boolean btBulletWorldImporter_loadFile__SWIG_0(long jarg1, btBulletWorldImporter jarg1_, String jarg2, String jarg3);
  public final static native boolean btBulletWorldImporter_loadFile__SWIG_1(long jarg1, btBulletWorldImporter jarg1_, String jarg2);
  public final static native boolean btBulletWorldImporter_loadFileFromMemory__SWIG_0(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_convertAllObjects(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_convertAllObjectsSwigExplicitbtBulletWorldImporter(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_loadFileFromMemory__SWIG_1(long jarg1, btBulletWorldImporter jarg1_, java.nio.ByteBuffer jarg2, int jarg3);
  public final static native void btBulletWorldImporter_director_connect(btBulletWorldImporter obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void btBulletWorldImporter_change_ownership(btBulletWorldImporter obj, long cptr, boolean take_or_release);
  public final static native long btBulletWorldImporter_SWIGUpcast(long jarg1);

  public static void SwigDirector_btBulletWorldImporter_deleteAllData(btBulletWorldImporter jself) {
    jself.deleteAllData();
  }
  public static void SwigDirector_btBulletWorldImporter_setDynamicsWorldInfo(btBulletWorldImporter jself, Vector3f gravity, long solverInfo) {
    jself.setDynamicsWorldInfo(gravity, new btContactSolverInfo(solverInfo, false));
  }
  public static long SwigDirector_btBulletWorldImporter_createRigidBody(btBulletWorldImporter jself, boolean isDynamic, float mass, Matrix4f startTransform, long shape, String bodyName) {
    return btRigidBody.getCPtr(jself.createRigidBody(isDynamic, mass, startTransform, (shape == 0) ? null : new btCollisionShape(shape, false), bodyName));
  }
  public static long SwigDirector_btBulletWorldImporter_createCollisionObject(btBulletWorldImporter jself, Matrix4f startTransform, long shape, String bodyName) {
    return btCollisionObject.getCPtr(jself.createCollisionObject(startTransform, (shape == 0) ? null : new btCollisionShape(shape, false), bodyName));
  }
  public static long SwigDirector_btBulletWorldImporter_createPlaneShape(btBulletWorldImporter jself, Vector3f planeNormal, float planeConstant) {
    return btCollisionShape.getCPtr(jself.createPlaneShape(planeNormal, planeConstant));
  }
  public static long SwigDirector_btBulletWorldImporter_createBoxShape(btBulletWorldImporter jself, Vector3f halfExtents) {
    return btCollisionShape.getCPtr(jself.createBoxShape(halfExtents));
  }
  public static long SwigDirector_btBulletWorldImporter_createSphereShape(btBulletWorldImporter jself, float radius) {
    return btCollisionShape.getCPtr(jself.createSphereShape(radius));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeX(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCapsuleShapeX(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeY(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCapsuleShapeY(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeZ(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCapsuleShapeZ(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeX(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCylinderShapeX(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeY(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCylinderShapeY(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeZ(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createCylinderShapeZ(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeShapeX(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createConeShapeX(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeShapeY(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createConeShapeY(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeShapeZ(btBulletWorldImporter jself, float radius, float height) {
    return btCollisionShape.getCPtr(jself.createConeShapeZ(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createTriangleMeshContainer(btBulletWorldImporter jself) {
    return btTriangleIndexVertexArray.getCPtr(jself.createTriangleMeshContainer());
  }
  public static long SwigDirector_btBulletWorldImporter_createBvhTriangleMeshShape(btBulletWorldImporter jself, long trimesh, long bvh) {
    return btBvhTriangleMeshShape.getCPtr(jself.createBvhTriangleMeshShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false), (bvh == 0) ? null : new btOptimizedBvh(bvh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createConvexTriangleMeshShape(btBulletWorldImporter jself, long trimesh) {
    return btCollisionShape.getCPtr(jself.createConvexTriangleMeshShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createGimpactShape(btBulletWorldImporter jself, long trimesh) {
    return btGImpactMeshShape.getCPtr(jself.createGimpactShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createStridingMeshInterfaceData(btBulletWorldImporter jself, long interfaceData) {
    return btStridingMeshInterfaceData.getCPtr(jself.createStridingMeshInterfaceData((interfaceData == 0) ? null : new btStridingMeshInterfaceData(interfaceData, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createConvexHullShape(btBulletWorldImporter jself) {
    return btConvexHullShape.getCPtr(jself.createConvexHullShape());
  }
  public static long SwigDirector_btBulletWorldImporter_createCompoundShape(btBulletWorldImporter jself) {
    return btCompoundShape.getCPtr(jself.createCompoundShape());
  }
  public static long SwigDirector_btBulletWorldImporter_createScaledTrangleMeshShape(btBulletWorldImporter jself, long meshShape, Vector3f localScalingbtBvhTriangleMeshShape) {
    return btScaledBvhTriangleMeshShape.getCPtr(jself.createScaledTrangleMeshShape((meshShape == 0) ? null : new btBvhTriangleMeshShape(meshShape, false), localScalingbtBvhTriangleMeshShape));
  }
  public static long SwigDirector_btBulletWorldImporter_createMeshInterface(btBulletWorldImporter jself, long meshData) {
    return btTriangleIndexVertexArray.getCPtr(jself.createMeshInterface(new btStridingMeshInterfaceData(meshData, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createOptimizedBvh(btBulletWorldImporter jself) {
    return btOptimizedBvh.getCPtr(jself.createOptimizedBvh());
  }
  public static long SwigDirector_btBulletWorldImporter_createTriangleInfoMap(btBulletWorldImporter jself) {
    return btTriangleInfoMap.getCPtr(jself.createTriangleInfoMap());
  }
  public static long SwigDirector_btBulletWorldImporter_createPoint2PointConstraint__SWIG_0(btBulletWorldImporter jself, long rbA, long rbB, Vector3f pivotInA, Vector3f pivotInB) {
    return btPoint2PointConstraint.getCPtr(jself.createPoint2PointConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), pivotInA, pivotInB));
  }
  public static long SwigDirector_btBulletWorldImporter_createPoint2PointConstraint__SWIG_1(btBulletWorldImporter jself, long rbA, Vector3f pivotInA) {
    return btPoint2PointConstraint.getCPtr(jself.createPoint2PointConstraint(new btRigidBody(rbA, false), pivotInA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_0(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f rbAFrame, Matrix4f rbBFrame, boolean useReferenceFrameA) {
    return btHingeConstraint.getCPtr(jself.createHingeConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame, useReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_1(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f rbAFrame, Matrix4f rbBFrame) {
    return btHingeConstraint.getCPtr(jself.createHingeConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_2(btBulletWorldImporter jself, long rbA, Matrix4f rbAFrame, boolean useReferenceFrameA) {
    return btHingeConstraint.getCPtr(jself.createHingeConstraint(new btRigidBody(rbA, false), rbAFrame, useReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_3(btBulletWorldImporter jself, long rbA, Matrix4f rbAFrame) {
    return btHingeConstraint.getCPtr(jself.createHingeConstraint(new btRigidBody(rbA, false), rbAFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeTwistConstraint__SWIG_0(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f rbAFrame, Matrix4f rbBFrame) {
    return btConeTwistConstraint.getCPtr(jself.createConeTwistConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeTwistConstraint__SWIG_1(btBulletWorldImporter jself, long rbA, Matrix4f rbAFrame) {
    return btConeTwistConstraint.getCPtr(jself.createConeTwistConstraint(new btRigidBody(rbA, false), rbAFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofConstraint__SWIG_0(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f frameInA, Matrix4f frameInB, boolean useLinearReferenceFrameA) {
    return btGeneric6DofConstraint.getCPtr(jself.createGeneric6DofConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofConstraint__SWIG_1(btBulletWorldImporter jself, long rbB, Matrix4f frameInB, boolean useLinearReferenceFrameB) {
    return btGeneric6DofConstraint.getCPtr(jself.createGeneric6DofConstraint(new btRigidBody(rbB, false), frameInB, useLinearReferenceFrameB));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofSpringConstraint(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f frameInA, Matrix4f frameInB, boolean useLinearReferenceFrameA) {
    return btGeneric6DofSpringConstraint.getCPtr(jself.createGeneric6DofSpringConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofSpring2Constraint(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f frameInA, Matrix4f frameInB, int rotateOrder) {
    return btGeneric6DofSpring2Constraint.getCPtr(jself.createGeneric6DofSpring2Constraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, rotateOrder));
  }
  public static long SwigDirector_btBulletWorldImporter_createSliderConstraint__SWIG_0(btBulletWorldImporter jself, long rbA, long rbB, Matrix4f frameInA, Matrix4f frameInB, boolean useLinearReferenceFrameA) {
    return btSliderConstraint.getCPtr(jself.createSliderConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createSliderConstraint__SWIG_1(btBulletWorldImporter jself, long rbB, Matrix4f frameInB, boolean useLinearReferenceFrameA) {
    return btSliderConstraint.getCPtr(jself.createSliderConstraint(new btRigidBody(rbB, false), frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createGearConstraint(btBulletWorldImporter jself, long rbA, long rbB, Vector3f axisInA, Vector3f axisInB, float ratio) {
    return SWIGTYPE_p_btGearConstraint.getCPtr(jself.createGearConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), axisInA, axisInB, ratio));
  }
  public static boolean SwigDirector_btBulletWorldImporter_convertAllObjects(btBulletWorldImporter jself, long file) {
    return jself.convertAllObjects((file == 0) ? null : new SWIGTYPE_p_bParse__btBulletFile(file, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
