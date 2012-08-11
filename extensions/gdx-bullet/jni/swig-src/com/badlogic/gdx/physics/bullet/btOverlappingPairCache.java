/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btOverlappingPairCache extends btOverlappingPairCallback {
	private long swigCPtr;

	protected btOverlappingPairCache (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btOverlappingPairCache obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btOverlappingPairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public btBroadphasePair getOverlappingPairArrayPtr () {
		long cPtr = gdxBulletJNI.btOverlappingPairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this);
		return (cPtr == 0) ? null : new btBroadphasePair(cPtr, false);
	}

	public SWIGTYPE_p_btAlignedObjectArrayT_btBroadphasePair_t getOverlappingPairArray () {
		return new SWIGTYPE_p_btAlignedObjectArrayT_btBroadphasePair_t(gdxBulletJNI.btOverlappingPairCache_getOverlappingPairArray(
			swigCPtr, this), false);
	}

	public void cleanOverlappingPair (btBroadphasePair pair, btDispatcher dispatcher) {
		gdxBulletJNI.btOverlappingPairCache_cleanOverlappingPair(swigCPtr, this, btBroadphasePair.getCPtr(pair), pair,
			btDispatcher.getCPtr(dispatcher), dispatcher);
	}

	public int getNumOverlappingPairs () {
		return gdxBulletJNI.btOverlappingPairCache_getNumOverlappingPairs(swigCPtr, this);
	}

	public void cleanProxyFromPairs (btBroadphaseProxy proxy, btDispatcher dispatcher) {
		gdxBulletJNI.btOverlappingPairCache_cleanProxyFromPairs(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy,
			btDispatcher.getCPtr(dispatcher), dispatcher);
	}

	public void setOverlapFilterCallback (btOverlapFilterCallback callback) {
		gdxBulletJNI.btOverlappingPairCache_setOverlapFilterCallback(swigCPtr, this, btOverlapFilterCallback.getCPtr(callback),
			callback);
	}

	public void processAllOverlappingPairs (btOverlapCallback arg0, btDispatcher dispatcher) {
		gdxBulletJNI.btOverlappingPairCache_processAllOverlappingPairs(swigCPtr, this, btOverlapCallback.getCPtr(arg0), arg0,
			btDispatcher.getCPtr(dispatcher), dispatcher);
	}

	public btBroadphasePair findPair (btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
		long cPtr = gdxBulletJNI.btOverlappingPairCache_findPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0,
			btBroadphaseProxy.getCPtr(proxy1), proxy1);
		return (cPtr == 0) ? null : new btBroadphasePair(cPtr, false);
	}

	public boolean hasDeferredRemoval () {
		return gdxBulletJNI.btOverlappingPairCache_hasDeferredRemoval(swigCPtr, this);
	}

	public void setInternalGhostPairCallback (btOverlappingPairCallback ghostPairCallback) {
		gdxBulletJNI.btOverlappingPairCache_setInternalGhostPairCallback(swigCPtr, this,
			btOverlappingPairCallback.getCPtr(ghostPairCallback), ghostPairCallback);
	}

	public void sortOverlappingPairs (btDispatcher dispatcher) {
		gdxBulletJNI.btOverlappingPairCache_sortOverlappingPairs(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
	}

}
