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

public class btConvexPlaneCollisionAlgorithm extends btCollisionAlgorithm {
	private long swigCPtr;
	
	protected btConvexPlaneCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexPlaneCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexPlaneCollisionAlgorithm, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexPlaneCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btConvexPlaneCollisionAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexPlaneCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexPlaneCollisionAlgorithm obj) {
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
				CollisionJNI.delete_btConvexPlaneCollisionAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConvexPlaneCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, boolean isSwapped, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
    this(CollisionJNI.new_btConvexPlaneCollisionAlgorithm(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, isSwapped, numPerturbationIterations, minimumPointsPerturbationThreshold), true);
  }

  public void collideSingleContact(Quat4f perturbeRot, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btDispatcherInfo dispatchInfo, btManifoldResult resultOut) {
    CollisionJNI.btConvexPlaneCollisionAlgorithm_collideSingleContact(swigCPtr, this, perturbeRot, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btManifoldResult.getCPtr(resultOut), resultOut);
  }

  static public class CreateFunc extends BulletBase {
  	private long swigCPtr;
  	
  	protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CreateFunc, normally you should not need this constructor it's intended for low-level usage. */ 
  	public CreateFunc(long cPtr, boolean cMemoryOwn) {
  		this("CreateFunc", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(CreateFunc obj) {
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
  				CollisionJNI.delete_btConvexPlaneCollisionAlgorithm_CreateFunc(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setNumPerturbationIterations(int value) {
      CollisionJNI.btConvexPlaneCollisionAlgorithm_CreateFunc_numPerturbationIterations_set(swigCPtr, this, value);
    }
  
    public int getNumPerturbationIterations() {
      return CollisionJNI.btConvexPlaneCollisionAlgorithm_CreateFunc_numPerturbationIterations_get(swigCPtr, this);
    }
  
    public void setMinimumPointsPerturbationThreshold(int value) {
      CollisionJNI.btConvexPlaneCollisionAlgorithm_CreateFunc_minimumPointsPerturbationThreshold_set(swigCPtr, this, value);
    }
  
    public int getMinimumPointsPerturbationThreshold() {
      return CollisionJNI.btConvexPlaneCollisionAlgorithm_CreateFunc_minimumPointsPerturbationThreshold_get(swigCPtr, this);
    }
  
    public CreateFunc() {
      this(CollisionJNI.new_btConvexPlaneCollisionAlgorithm_CreateFunc(), true);
    }
  
    public btCollisionAlgorithm CreateCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
      long cPtr = CollisionJNI.btConvexPlaneCollisionAlgorithm_CreateFunc_CreateCollisionAlgorithm(swigCPtr, this, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap);
      return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
    }
  
  }

}
