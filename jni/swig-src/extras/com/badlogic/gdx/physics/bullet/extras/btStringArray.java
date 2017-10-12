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

public class btStringArray extends BulletBase {
	private long swigCPtr;
	
	protected btStringArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btStringArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btStringArray(long cPtr, boolean cMemoryOwn) {
		this("btStringArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btStringArray obj) {
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
				ExtrasJNI.delete_btStringArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btStringArray() {
    this(ExtrasJNI.new_btStringArray__SWIG_0(), true);
  }

  public btStringArray(btStringArray otherArray) {
    this(ExtrasJNI.new_btStringArray__SWIG_1(btStringArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return ExtrasJNI.btStringArray_size(swigCPtr, this);
  }

  public String at(int n) {
    return ExtrasJNI.btStringArray_at__SWIG_0(swigCPtr, this, n);
  }

  public void clear() {
    ExtrasJNI.btStringArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    ExtrasJNI.btStringArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    ExtrasJNI.btStringArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, String fillData) {
    ExtrasJNI.btStringArray_resize__SWIG_0(swigCPtr, this, newsize, fillData);
  }

  public void resize(int newsize) {
    ExtrasJNI.btStringArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public String expandNonInitializing() {
    return ExtrasJNI.btStringArray_expandNonInitializing(swigCPtr, this);
  }

  public String expand(String fillValue) {
    return ExtrasJNI.btStringArray_expand__SWIG_0(swigCPtr, this, fillValue);
  }

  public String expand() {
    return ExtrasJNI.btStringArray_expand__SWIG_1(swigCPtr, this);
  }

  public void push_back(String _Val) {
    ExtrasJNI.btStringArray_push_back(swigCPtr, this, _Val);
  }

  public int capacity() {
    return ExtrasJNI.btStringArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    ExtrasJNI.btStringArray_reserve(swigCPtr, this, _Count);
  }

  static public class less extends BulletBase {
  	private long swigCPtr;
  	
  	protected less(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new less, normally you should not need this constructor it's intended for low-level usage. */ 
  	public less(long cPtr, boolean cMemoryOwn) {
  		this("less", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(less obj) {
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
  				ExtrasJNI.delete_btStringArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public less() {
      this(ExtrasJNI.new_btStringArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    ExtrasJNI.btStringArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(String key) {
    return ExtrasJNI.btStringArray_findBinarySearch(swigCPtr, this, key);
  }

  public int findLinearSearch(String key) {
    return ExtrasJNI.btStringArray_findLinearSearch(swigCPtr, this, key);
  }

  public void remove(String key) {
    ExtrasJNI.btStringArray_remove(swigCPtr, this, key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    ExtrasJNI.btStringArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btStringArray otherArray) {
    ExtrasJNI.btStringArray_copyFromArray(swigCPtr, this, btStringArray.getCPtr(otherArray), otherArray);
  }

}
