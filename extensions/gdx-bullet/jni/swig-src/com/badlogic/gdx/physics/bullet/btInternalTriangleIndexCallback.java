/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btInternalTriangleIndexCallback {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btInternalTriangleIndexCallback (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btInternalTriangleIndexCallback obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btInternalTriangleIndexCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void internalProcessTriangleIndex (btVector3 triangle, int partId, int triangleIndex) {
		gdxBulletJNI.btInternalTriangleIndexCallback_internalProcessTriangleIndex(swigCPtr, this, btVector3.getCPtr(triangle),
			triangle, partId, triangleIndex);
	}

}
