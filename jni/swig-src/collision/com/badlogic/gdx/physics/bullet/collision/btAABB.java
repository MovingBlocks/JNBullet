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

public class btAABB extends BulletBase {
	private long swigCPtr;
	
	protected btAABB(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btAABB, normally you should not need this constructor it's intended for low-level usage. */ 
	public btAABB(long cPtr, boolean cMemoryOwn) {
		this("btAABB", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btAABB obj) {
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
				CollisionJNI.delete_btAABB(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setMin(btVector3 value) {
    CollisionJNI.btAABB_min_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMin() {
    long cPtr = CollisionJNI.btAABB_min_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMax(btVector3 value) {
    CollisionJNI.btAABB_max_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMax() {
    long cPtr = CollisionJNI.btAABB_max_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btAABB() {
    this(CollisionJNI.new_btAABB__SWIG_0(), true);
  }

  public btAABB(Vector3f V1, Vector3f V2, Vector3f V3) {
    this(CollisionJNI.new_btAABB__SWIG_1(V1, V2, V3), true);
  }

  public btAABB(Vector3f V1, Vector3f V2, Vector3f V3, float margin) {
    this(CollisionJNI.new_btAABB__SWIG_2(V1, V2, V3, margin), true);
  }

  public btAABB(btAABB other) {
    this(CollisionJNI.new_btAABB__SWIG_3(btAABB.getCPtr(other), other), true);
  }

  public btAABB(btAABB other, float margin) {
    this(CollisionJNI.new_btAABB__SWIG_4(btAABB.getCPtr(other), other, margin), true);
  }

  public void invalidate() {
    CollisionJNI.btAABB_invalidate(swigCPtr, this);
  }

  public void increment_margin(float margin) {
    CollisionJNI.btAABB_increment_margin(swigCPtr, this, margin);
  }

  public void copy_with_margin(btAABB other, float margin) {
    CollisionJNI.btAABB_copy_with_margin(swigCPtr, this, btAABB.getCPtr(other), other, margin);
  }

  public void appy_transform(Matrix4f trans) {
    CollisionJNI.btAABB_appy_transform(swigCPtr, this, trans);
  }

  public void appy_transform_trans_cache(BT_BOX_BOX_TRANSFORM_CACHE trans) {
    CollisionJNI.btAABB_appy_transform_trans_cache(swigCPtr, this, BT_BOX_BOX_TRANSFORM_CACHE.getCPtr(trans), trans);
  }

  public void merge(btAABB box) {
    CollisionJNI.btAABB_merge(swigCPtr, this, btAABB.getCPtr(box), box);
  }

  public void get_center_extend(Vector3f center, Vector3f extend) {
    CollisionJNI.btAABB_get_center_extend(swigCPtr, this, center, extend);
  }

  public void find_intersection(btAABB other, btAABB intersection) {
    CollisionJNI.btAABB_find_intersection(swigCPtr, this, btAABB.getCPtr(other), other, btAABB.getCPtr(intersection), intersection);
  }

  public boolean has_collision(btAABB other) {
    return CollisionJNI.btAABB_has_collision(swigCPtr, this, btAABB.getCPtr(other), other);
  }

  public boolean collide_ray(Vector3f vorigin, Vector3f vdir) {
    return CollisionJNI.btAABB_collide_ray(swigCPtr, this, vorigin, vdir);
  }

  public void projection_interval(Vector3f direction, SWIGTYPE_p_float vmin, SWIGTYPE_p_float vmax) {
    CollisionJNI.btAABB_projection_interval(swigCPtr, this, direction, SWIGTYPE_p_float.getCPtr(vmin), SWIGTYPE_p_float.getCPtr(vmax));
  }

  public int plane_classify(btVector4 plane) {
    return CollisionJNI.btAABB_plane_classify(swigCPtr, this, btVector4.getCPtr(plane), plane);
  }

  public boolean overlapping_trans_conservative(btAABB box, Matrix4f trans1_to_0) {
    return CollisionJNI.btAABB_overlapping_trans_conservative(swigCPtr, this, btAABB.getCPtr(box), box, trans1_to_0);
  }

  public boolean overlapping_trans_conservative2(btAABB box, BT_BOX_BOX_TRANSFORM_CACHE trans1_to_0) {
    return CollisionJNI.btAABB_overlapping_trans_conservative2(swigCPtr, this, btAABB.getCPtr(box), box, BT_BOX_BOX_TRANSFORM_CACHE.getCPtr(trans1_to_0), trans1_to_0);
  }

  public boolean overlapping_trans_cache(btAABB box, BT_BOX_BOX_TRANSFORM_CACHE transcache, boolean fulltest) {
    return CollisionJNI.btAABB_overlapping_trans_cache(swigCPtr, this, btAABB.getCPtr(box), box, BT_BOX_BOX_TRANSFORM_CACHE.getCPtr(transcache), transcache, fulltest);
  }

  public boolean collide_plane(btVector4 plane) {
    return CollisionJNI.btAABB_collide_plane(swigCPtr, this, btVector4.getCPtr(plane), plane);
  }

  public boolean collide_triangle_exact(Vector3f p1, Vector3f p2, Vector3f p3, btVector4 triangle_plane) {
    return CollisionJNI.btAABB_collide_triangle_exact(swigCPtr, this, p1, p2, p3, btVector4.getCPtr(triangle_plane), triangle_plane);
  }

}
