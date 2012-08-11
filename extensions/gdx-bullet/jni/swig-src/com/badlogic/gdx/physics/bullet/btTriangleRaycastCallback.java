/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;

public class btTriangleRaycastCallback extends btTriangleCallback {
	private long swigCPtr;

	protected btTriangleRaycastCallback (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btTriangleRaycastCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btTriangleRaycastCallback obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTriangleRaycastCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setM_from (btVector3 value) {
		gdxBulletJNI.btTriangleRaycastCallback_m_from_set(swigCPtr, this, btVector3.getCPtr(value), value);
	}

	public btVector3 getM_from () {
		long cPtr = gdxBulletJNI.btTriangleRaycastCallback_m_from_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3(cPtr, false);
	}

	public void setM_to (btVector3 value) {
		gdxBulletJNI.btTriangleRaycastCallback_m_to_set(swigCPtr, this, btVector3.getCPtr(value), value);
	}

	public btVector3 getM_to () {
		long cPtr = gdxBulletJNI.btTriangleRaycastCallback_m_to_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3(cPtr, false);
	}

	public void setM_flags (long value) {
		gdxBulletJNI.btTriangleRaycastCallback_m_flags_set(swigCPtr, this, value);
	}

	public long getM_flags () {
		return gdxBulletJNI.btTriangleRaycastCallback_m_flags_get(swigCPtr, this);
	}

	public void setM_hitFraction (float value) {
		gdxBulletJNI.btTriangleRaycastCallback_m_hitFraction_set(swigCPtr, this, value);
	}

	public float getM_hitFraction () {
		return gdxBulletJNI.btTriangleRaycastCallback_m_hitFraction_get(swigCPtr, this);
	}

	public float reportHit (Vector3 hitNormalLocal, float hitFraction, int partId, int triangleIndex) {
		return gdxBulletJNI.btTriangleRaycastCallback_reportHit(swigCPtr, this, hitNormalLocal, hitFraction, partId, triangleIndex);
	}

	public final static class EFlags {
		public final static int kF_None = 0;
		public final static int kF_FilterBackfaces = 1 << 0;
		public final static int kF_KeepUnflippedNormal = 1 << 1;
		public final static int kF_Terminator = 0xFFFFFFFF;
	}

}
