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
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ContactListener extends BulletBase {
	private long swigCPtr;
	
	protected ContactListener(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ContactListener, normally you should not need this constructor it's intended for low-level usage. */ 
	public ContactListener(long cPtr, boolean cMemoryOwn) {
		this("ContactListener", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(ContactListener obj) {
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
				CollisionJNI.delete_ContactListener(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.ContactListener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.ContactListener_change_ownership(this, swigCPtr, true);
  }

	public ContactListener() {
		this(false);
		if (!setEvents())
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Only one method per callback event can be overridden.");
		enable();
	}

  private ContactListener(boolean dummy) {
    this(CollisionJNI.new_ContactListener(dummy), true);
    CollisionJNI.ContactListener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void enable() {
    CollisionJNI.ContactListener_enable(swigCPtr, this);
  }

  public void disable() {
    CollisionJNI.ContactListener_disable(swigCPtr, this);
  }

  public void enableOnAdded() {
    CollisionJNI.ContactListener_enableOnAdded(swigCPtr, this);
  }

  public void disableOnAdded() {
    CollisionJNI.ContactListener_disableOnAdded(swigCPtr, this);
  }

  public boolean isOnAddedEnabled() {
    return CollisionJNI.ContactListener_isOnAddedEnabled(swigCPtr, this);
  }

  public boolean onContactAdded(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_0(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(colObj0Wrap), colObj0Wrap, partId0, index0, btCollisionObjectWrapper.getCPtr(colObj1Wrap), colObj1Wrap, partId1, index1);
  }

  public boolean onContactAdded(btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_1(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObject.getCPtr(colObj0), colObj0, partId0, index0, btCollisionObject.getCPtr(colObj1), colObj1, partId1, index1);
  }

  public boolean onContactAdded(btManifoldPoint cp, int userValue0, int partId0, int index0, int userValue1, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_2(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, userValue0, partId0, index0, userValue1, partId1, index1);
  }

  public boolean onContactAdded(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_3(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(colObj0Wrap), colObj0Wrap, partId0, index0, match0, btCollisionObjectWrapper.getCPtr(colObj1Wrap), colObj1Wrap, partId1, index1, match1);
  }

  public boolean onContactAdded(btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_4(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObject.getCPtr(colObj0), colObj0, partId0, index0, match0, btCollisionObject.getCPtr(colObj1), colObj1, partId1, index1, match1);
  }

  public boolean onContactAdded(btManifoldPoint cp, int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_5(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, userValue0, partId0, index0, match0, userValue1, partId1, index1, match1);
  }

  public boolean onContactAdded(btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_6(swigCPtr, this, btCollisionObjectWrapper.getCPtr(colObj0Wrap), colObj0Wrap, partId0, index0, btCollisionObjectWrapper.getCPtr(colObj1Wrap), colObj1Wrap, partId1, index1);
  }

  public boolean onContactAdded(btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_7(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, partId0, index0, btCollisionObject.getCPtr(colObj1), colObj1, partId1, index1);
  }

  public boolean onContactAdded(int userValue0, int partId0, int index0, int userValue1, int partId1, int index1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_8(swigCPtr, this, userValue0, partId0, index0, userValue1, partId1, index1);
  }

  public boolean onContactAdded(btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_9(swigCPtr, this, btCollisionObjectWrapper.getCPtr(colObj0Wrap), colObj0Wrap, partId0, index0, match0, btCollisionObjectWrapper.getCPtr(colObj1Wrap), colObj1Wrap, partId1, index1, match1);
  }

  public boolean onContactAdded(btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_10(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, partId0, index0, match0, btCollisionObject.getCPtr(colObj1), colObj1, partId1, index1, match1);
  }

  public boolean onContactAdded(int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1) {
    return CollisionJNI.ContactListener_onContactAdded__SWIG_11(swigCPtr, this, userValue0, partId0, index0, match0, userValue1, partId1, index1, match1);
  }

  public void enableOnProcessed() {
    CollisionJNI.ContactListener_enableOnProcessed(swigCPtr, this);
  }

  public void disableOnProcessed() {
    CollisionJNI.ContactListener_disableOnProcessed(swigCPtr, this);
  }

  public boolean isOnProcessedEnabled() {
    return CollisionJNI.ContactListener_isOnProcessedEnabled(swigCPtr, this);
  }

  public void onContactProcessed(btManifoldPoint cp, btCollisionObject colObj0, btCollisionObject colObj1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_0(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public void onContactProcessed(btManifoldPoint cp, int userValue0, int userValue1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_1(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, userValue0, userValue1);
  }

  public void onContactProcessed(btManifoldPoint cp, btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_2(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObject.getCPtr(colObj0), colObj0, match0, btCollisionObject.getCPtr(colObj1), colObj1, match1);
  }

  public void onContactProcessed(btManifoldPoint cp, int userValue0, boolean match0, int userValue1, boolean match1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_3(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, userValue0, match0, userValue1, match1);
  }

  public void onContactProcessed(btCollisionObject colObj0, btCollisionObject colObj1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_4(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public void onContactProcessed(int userValue0, int userValue1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_5(swigCPtr, this, userValue0, userValue1);
  }

  public void onContactProcessed(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_6(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, match0, btCollisionObject.getCPtr(colObj1), colObj1, match1);
  }

  public void onContactProcessed(int userValue0, boolean match0, int userValue1, boolean match1) {
    CollisionJNI.ContactListener_onContactProcessed__SWIG_7(swigCPtr, this, userValue0, match0, userValue1, match1);
  }

  public void enableOnDestroyed() {
    CollisionJNI.ContactListener_enableOnDestroyed(swigCPtr, this);
  }

  public void disableOnDestroyed() {
    CollisionJNI.ContactListener_disableOnDestroyed(swigCPtr, this);
  }

  public boolean isOnDestroyedEnabled() {
    return CollisionJNI.ContactListener_isOnDestroyedEnabled(swigCPtr, this);
  }

  public void onContactDestroyed(int manifoldPointUserValue) {
    CollisionJNI.ContactListener_onContactDestroyed(swigCPtr, this, manifoldPointUserValue);
  }

  public void enableOnStarted() {
    CollisionJNI.ContactListener_enableOnStarted(swigCPtr, this);
  }

  public void disableOnStarted() {
    CollisionJNI.ContactListener_disableOnStarted(swigCPtr, this);
  }

  public boolean isOnStartedEnabled() {
    return CollisionJNI.ContactListener_isOnStartedEnabled(swigCPtr, this);
  }

  public void onContactStarted(btPersistentManifold manifold) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_0(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public void onContactStarted(btCollisionObject colObj0, btCollisionObject colObj1) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_1(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public void onContactStarted(int userValue0, int userValue1) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_2(swigCPtr, this, userValue0, userValue1);
  }

  public void onContactStarted(btPersistentManifold manifold, boolean match0, boolean match1) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_3(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold, match0, match1);
  }

  public void onContactStarted(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_4(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, match0, btCollisionObject.getCPtr(colObj1), colObj1, match1);
  }

  public void onContactStarted(int userValue0, boolean match0, int userValue1, boolean match1) {
    CollisionJNI.ContactListener_onContactStarted__SWIG_5(swigCPtr, this, userValue0, match0, userValue1, match1);
  }

  public void enableOnEnded() {
    CollisionJNI.ContactListener_enableOnEnded(swigCPtr, this);
  }

  public void disableOnEnded() {
    CollisionJNI.ContactListener_disableOnEnded(swigCPtr, this);
  }

  public boolean isOnEndedEnabled() {
    return CollisionJNI.ContactListener_isOnEndedEnabled(swigCPtr, this);
  }

  public void onContactEnded(btPersistentManifold manifold) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_0(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public void onContactEnded(btCollisionObject colObj0, btCollisionObject colObj1) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_1(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public void onContactEnded(int userValue0, int userValue1) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_2(swigCPtr, this, userValue0, userValue1);
  }

  public void onContactEnded(btPersistentManifold manifold, boolean match0, boolean match1) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_3(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold, match0, match1);
  }

  public void onContactEnded(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_4(swigCPtr, this, btCollisionObject.getCPtr(colObj0), colObj0, match0, btCollisionObject.getCPtr(colObj1), colObj1, match1);
  }

  public void onContactEnded(int userValue0, boolean match0, int userValue1, boolean match1) {
    CollisionJNI.ContactListener_onContactEnded__SWIG_5(swigCPtr, this, userValue0, match0, userValue1, match1);
  }

  private boolean setEvents() {
    return CollisionJNI.ContactListener_setEvents(swigCPtr, this);
  }

}
