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

public class btGImpactCompoundShape extends btGImpactShapeInterface {
	private long swigCPtr;
	
	protected btGImpactCompoundShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGImpactCompoundShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGImpactCompoundShape, normally you should not need this constructor it's intended for low-level usage. */
	public btGImpactCompoundShape(long cPtr, boolean cMemoryOwn) {
		this("btGImpactCompoundShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGImpactCompoundShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGImpactCompoundShape obj) {
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
				CollisionJNI.delete_btGImpactCompoundShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class CompoundPrimitiveManager extends btPrimitiveManagerBase {
  	private long swigCPtr;
  	
  	protected CompoundPrimitiveManager(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btGImpactCompoundShape_CompoundPrimitiveManager_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CompoundPrimitiveManager, normally you should not need this constructor it's intended for low-level usage. */
  	public CompoundPrimitiveManager(long cPtr, boolean cMemoryOwn) {
  		this("CompoundPrimitiveManager", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btGImpactCompoundShape_CompoundPrimitiveManager_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CompoundPrimitiveManager obj) {
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
  				CollisionJNI.delete_btGImpactCompoundShape_CompoundPrimitiveManager(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setCompoundShape(btGImpactCompoundShape value) {
      CollisionJNI.btGImpactCompoundShape_CompoundPrimitiveManager_compoundShape_set(swigCPtr, this, btGImpactCompoundShape.getCPtr(value), value);
    }
  
    public btGImpactCompoundShape getCompoundShape() {
      long cPtr = CollisionJNI.btGImpactCompoundShape_CompoundPrimitiveManager_compoundShape_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btGImpactCompoundShape(cPtr, false);
    }
  
    public CompoundPrimitiveManager(btGImpactCompoundShape.CompoundPrimitiveManager compound) {
      this(CollisionJNI.new_btGImpactCompoundShape_CompoundPrimitiveManager__SWIG_0(btGImpactCompoundShape.CompoundPrimitiveManager.getCPtr(compound), compound), true);
    }
  
    public CompoundPrimitiveManager(btGImpactCompoundShape compoundShape) {
      this(CollisionJNI.new_btGImpactCompoundShape_CompoundPrimitiveManager__SWIG_1(btGImpactCompoundShape.getCPtr(compoundShape), compoundShape), true);
    }
  
    public CompoundPrimitiveManager() {
      this(CollisionJNI.new_btGImpactCompoundShape_CompoundPrimitiveManager__SWIG_2(), true);
    }
  
  }

  public btGImpactCompoundShape(boolean children_has_transform) {
    this(CollisionJNI.new_btGImpactCompoundShape__SWIG_0(children_has_transform), true);
  }

  public btGImpactCompoundShape() {
    this(CollisionJNI.new_btGImpactCompoundShape__SWIG_1(), true);
  }

  public btGImpactCompoundShape.CompoundPrimitiveManager getCompoundPrimitiveManager() {
    long cPtr = CollisionJNI.btGImpactCompoundShape_getCompoundPrimitiveManager(swigCPtr, this);
    return (cPtr == 0) ? null : new btGImpactCompoundShape.CompoundPrimitiveManager(cPtr, false);
  }

  public void addChildShape(Matrix4f localTransform, btCollisionShape shape) {
    CollisionJNI.btGImpactCompoundShape_addChildShape__SWIG_0(swigCPtr, this, localTransform, btCollisionShape.getCPtr(shape), shape);
  }

  public void addChildShape(btCollisionShape shape) {
    CollisionJNI.btGImpactCompoundShape_addChildShape__SWIG_1(swigCPtr, this, btCollisionShape.getCPtr(shape), shape);
  }

  public btCollisionShape getChildShape(int index) {
    long cPtr = CollisionJNI.btGImpactCompoundShape_getChildShape__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

}
