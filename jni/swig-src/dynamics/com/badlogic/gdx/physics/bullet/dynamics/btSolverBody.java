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

public class btSolverBody extends BulletBase {
	private long swigCPtr;
	
	protected btSolverBody(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSolverBody, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSolverBody(long cPtr, boolean cMemoryOwn) {
		this("btSolverBody", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSolverBody obj) {
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
				DynamicsJNI.delete_btSolverBody(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setWorldTransform(btTransform value) {
    DynamicsJNI.btSolverBody_worldTransform_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getWorldTransform() {
    long cPtr = DynamicsJNI.btSolverBody_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setDeltaLinearVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_deltaLinearVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getDeltaLinearVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_deltaLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setDeltaAngularVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_deltaAngularVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getDeltaAngularVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_deltaAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAngularFactor(btVector3 value) {
    DynamicsJNI.btSolverBody_angularFactor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAngularFactor() {
    long cPtr = DynamicsJNI.btSolverBody_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLinearFactor(btVector3 value) {
    DynamicsJNI.btSolverBody_linearFactor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLinearFactor() {
    long cPtr = DynamicsJNI.btSolverBody_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setInvMass(btVector3 value) {
    DynamicsJNI.btSolverBody_invMass_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getInvMass() {
    long cPtr = DynamicsJNI.btSolverBody_invMass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setPushVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_pushVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getPushVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_pushVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setTurnVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_turnVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getTurnVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_turnVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLinearVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_linearVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLinearVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAngularVelocity(btVector3 value) {
    DynamicsJNI.btSolverBody_angularVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAngularVelocity() {
    long cPtr = DynamicsJNI.btSolverBody_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setExternalForceImpulse(btVector3 value) {
    DynamicsJNI.btSolverBody_externalForceImpulse_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getExternalForceImpulse() {
    long cPtr = DynamicsJNI.btSolverBody_externalForceImpulse_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setExternalTorqueImpulse(btVector3 value) {
    DynamicsJNI.btSolverBody_externalTorqueImpulse_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getExternalTorqueImpulse() {
    long cPtr = DynamicsJNI.btSolverBody_externalTorqueImpulse_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setOriginalBody(btRigidBody value) {
    DynamicsJNI.btSolverBody_originalBody_set(swigCPtr, this, btRigidBody.getCPtr(value), value);
  }

  public btRigidBody getOriginalBody() {
	return btRigidBody.getInstance(DynamicsJNI.btSolverBody_originalBody_get(swigCPtr, this), false);
}

  public void getVelocityInLocalPointNoDelta(Vector3f rel_pos, Vector3f velocity) {
    DynamicsJNI.btSolverBody_getVelocityInLocalPointNoDelta(swigCPtr, this, rel_pos, velocity);
  }

  public void getVelocityInLocalPointObsolete(Vector3f rel_pos, Vector3f velocity) {
    DynamicsJNI.btSolverBody_getVelocityInLocalPointObsolete(swigCPtr, this, rel_pos, velocity);
  }

  public void getAngularVelocity(Vector3f angVel) {
    DynamicsJNI.btSolverBody_getAngularVelocity(swigCPtr, this, angVel);
  }

  public void applyImpulse(Vector3f linearComponent, Vector3f angularComponent, float impulseMagnitude) {
    DynamicsJNI.btSolverBody_applyImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void internalApplyPushImpulse(Vector3f linearComponent, Vector3f angularComponent, float impulseMagnitude) {
    DynamicsJNI.btSolverBody_internalApplyPushImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public Vector3f internalGetDeltaLinearVelocity() {
	return DynamicsJNI.btSolverBody_internalGetDeltaLinearVelocity(swigCPtr, this);
}

  public Vector3f internalGetDeltaAngularVelocity() {
	return DynamicsJNI.btSolverBody_internalGetDeltaAngularVelocity(swigCPtr, this);
}

  public Vector3f internalGetAngularFactor() {
	return DynamicsJNI.btSolverBody_internalGetAngularFactor(swigCPtr, this);
}

  public Vector3f internalGetInvMass() {
	return DynamicsJNI.btSolverBody_internalGetInvMass(swigCPtr, this);
}

  public void internalSetInvMass(Vector3f invMass) {
    DynamicsJNI.btSolverBody_internalSetInvMass(swigCPtr, this, invMass);
  }

  public Vector3f internalGetPushVelocity() {
	return DynamicsJNI.btSolverBody_internalGetPushVelocity(swigCPtr, this);
}

  public Vector3f internalGetTurnVelocity() {
	return DynamicsJNI.btSolverBody_internalGetTurnVelocity(swigCPtr, this);
}

  public void internalGetVelocityInLocalPointObsolete(Vector3f rel_pos, Vector3f velocity) {
    DynamicsJNI.btSolverBody_internalGetVelocityInLocalPointObsolete(swigCPtr, this, rel_pos, velocity);
  }

  public void internalGetAngularVelocity(Vector3f angVel) {
    DynamicsJNI.btSolverBody_internalGetAngularVelocity(swigCPtr, this, angVel);
  }

  public void internalApplyImpulse(Vector3f linearComponent, Vector3f angularComponent, float impulseMagnitude) {
    DynamicsJNI.btSolverBody_internalApplyImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void writebackVelocity() {
    DynamicsJNI.btSolverBody_writebackVelocity(swigCPtr, this);
  }

  public void writebackVelocityAndTransform(float timeStep, float splitImpulseTurnErp) {
    DynamicsJNI.btSolverBody_writebackVelocityAndTransform(swigCPtr, this, timeStep, splitImpulseTurnErp);
  }

  public btSolverBody() {
    this(DynamicsJNI.new_btSolverBody(), true);
  }

}
