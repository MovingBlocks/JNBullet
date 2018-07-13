#include "mathtypes.h"
#include <stdio.h>
#include <string.h>
#include <stdio.h>

////////////////////////////////
//////// btVector3      ////////
////////////////////////////////
static jfieldID vector3_x = NULL, vector3_y = NULL, vector3_z = NULL;

void vector3_getFields(JNIEnv * const &jenv, jobject &v3) {
	jclass cls = jenv->GetObjectClass(v3);
	vector3_x = jenv->GetFieldID(cls, "x", "F");
	vector3_y = jenv->GetFieldID(cls, "y", "F");
	vector3_z = jenv->GetFieldID(cls, "z", "F");
	jenv->DeleteLocalRef(cls);
}

inline void vector3_ensurefields(JNIEnv * const &jenv, jobject &v3) {
	if (!vector3_x) vector3_getFields(jenv, v3);
}

void Vector3f_to_btVector3(JNIEnv * const &jenv, btVector3 &target, jobject &source)
{
	vector3_ensurefields(jenv, source);
	target.setValue(jenv->GetFloatField(source, vector3_x), jenv->GetFloatField(source, vector3_y), jenv->GetFloatField(source, vector3_z));
}
	
void btVector3_to_Vector3f(JNIEnv * const &jenv, jobject &target, const btVector3 &source)
{
	vector3_ensurefields(jenv, target);
	jenv->SetFloatField(target, vector3_x, source.getX());
	jenv->SetFloatField(target, vector3_y, source.getY());
	jenv->SetFloatField(target, vector3_z, source.getZ());
}



////////////////////////////////
//////// btQuaternion   ////////
////////////////////////////////
static jfieldID quaternion_x = NULL, quaternion_y = NULL, quaternion_z = NULL, quaternion_w = NULL;

void quaternion_getFields(JNIEnv * const &jenv, jobject &q) {
	jclass cls = jenv->GetObjectClass(q);
	quaternion_x = jenv->GetFieldID(cls, "x", "F");
	quaternion_y = jenv->GetFieldID(cls, "y", "F");
	quaternion_z = jenv->GetFieldID(cls, "z", "F");
	quaternion_w = jenv->GetFieldID(cls, "w", "F");
	jenv->DeleteLocalRef(cls);
}

inline void quaternion_ensurefields(JNIEnv * const &jenv, jobject &q) {
	if (!quaternion_x) quaternion_getFields(jenv, q);
}

void Quat4f_to_btQuaternion(JNIEnv * const &jenv, btQuaternion &target, jobject &source)
{
	quaternion_ensurefields(jenv, source);
	target.setValue(
			jenv->GetFloatField(source, quaternion_x),
			jenv->GetFloatField(source, quaternion_y),
			jenv->GetFloatField(source, quaternion_z),
			jenv->GetFloatField(source, quaternion_w));
}

void btQuaternion_to_Quat4f(JNIEnv * const &jenv, jobject &target, const btQuaternion & source)
{
	quaternion_ensurefields(jenv, target);
	jenv->SetFloatField(target, quaternion_x, source.getX());
	jenv->SetFloatField(target, quaternion_y, source.getY());
	jenv->SetFloatField(target, quaternion_z, source.getZ());
	jenv->SetFloatField(target, quaternion_w, source.getW());
}

////////////////////////////////
//////// btMatrix3x3    ////////
////////////////////////////////
static jfieldID matrix3_m00 = NULL,
        matrix3_m01 = NULL,
        matrix3_m02 = NULL,
        matrix3_m10 = NULL,
        matrix3_m11 = NULL,
        matrix3_m12 = NULL,
        matrix3_m20 = NULL,
        matrix3_m21 = NULL,
        matrix3_m22 = NULL;


void matrix3_getFields(JNIEnv * const &jenv, jobject &m3) {
	jclass cls = jenv->GetObjectClass(m3);
	matrix3_m00 = jenv->GetFieldID(cls, "m00", "F");
    matrix3_m01 = jenv->GetFieldID(cls, "m01", "F");
    matrix3_m02 = jenv->GetFieldID(cls, "m02", "F");
    matrix3_m10 = jenv->GetFieldID(cls, "m10", "F");
    matrix3_m11 = jenv->GetFieldID(cls, "m11", "F");
    matrix3_m12 = jenv->GetFieldID(cls, "m12", "F");
    matrix3_m20 = jenv->GetFieldID(cls, "m20", "F");
    matrix3_m21 = jenv->GetFieldID(cls, "m21", "F");
    matrix3_m22 = jenv->GetFieldID(cls, "m22", "F");

	jenv->DeleteLocalRef(cls);
}

inline void matrix3_ensurefields(JNIEnv * const &jenv, jobject &m3) {
	if (!matrix3_m00) matrix3_getFields(jenv, m3);
}

void Matrix3f_to_btMatrix3(JNIEnv * const &jenv, btMatrix3x3 &target, jobject &source)
{
	matrix3_ensurefields(jenv, source);

	// Convert to column-major
	target.setValue(
	jenv->GetFloatField(source, matrix3_m00), jenv->GetFloatField(source, matrix3_m10), jenv->GetFloatField(source, matrix3_m20),
	jenv->GetFloatField(source, matrix3_m01), jenv->GetFloatField(source, matrix3_m11), jenv->GetFloatField(source, matrix3_m21),
	jenv->GetFloatField(source, matrix3_m02), jenv->GetFloatField(source, matrix3_m12), jenv->GetFloatField(source, matrix3_m22));

}

void btMatrix3_to_Matrix3f(JNIEnv * const &jenv, jobject &target, const btMatrix3x3 &source)
{
	matrix3_ensurefields(jenv, target);

	jenv->SetFloatField(target, matrix3_m00, (jfloat) source.getColumn(0).getX());
    jenv->SetFloatField(target, matrix3_m10, (jfloat) source.getColumn(0).getY());
    jenv->SetFloatField(target, matrix3_m20, (jfloat) source.getColumn(0).getZ());

	jenv->SetFloatField(target, matrix3_m01, (jfloat) source.getColumn(1).getX());
    jenv->SetFloatField(target, matrix3_m11, (jfloat) source.getColumn(1).getY());
    jenv->SetFloatField(target, matrix3_m21, (jfloat) source.getColumn(1).getZ());

    jenv->SetFloatField(target, matrix3_m02, (jfloat) source.getColumn(2).getX());
    jenv->SetFloatField(target, matrix3_m12, (jfloat) source.getColumn(2).getY());
    jenv->SetFloatField(target, matrix3_m22, (jfloat) source.getColumn(2).getZ());

}

////////////////////////////////
//////// btTransform    ////////
////////////////////////////////
static jfieldID matrix4_m00 = NULL,
                matrix4_m01 = NULL,
                matrix4_m02 = NULL,
                matrix4_m03 = NULL,

                matrix4_m10 = NULL,
                matrix4_m11 = NULL,
                matrix4_m12 = NULL,
                matrix4_m13 = NULL,

                matrix4_m20 = NULL,
                matrix4_m21 = NULL,
                matrix4_m22 = NULL,
                matrix4_m23 = NULL,

                matrix4_m30 = NULL,
                matrix4_m31 = NULL,
                matrix4_m32 = NULL,
                matrix4_m33 = NULL;

void matrix4_getFields(JNIEnv * const &jenv, jobject &m4) {
	jclass cls = jenv->GetObjectClass(m4);
	matrix4_m00 = jenv->GetFieldID(cls, "m00", "F");
	matrix4_m01 = jenv->GetFieldID(cls, "m01", "F");
    matrix4_m02 = jenv->GetFieldID(cls, "m02", "F");
    matrix4_m03 = jenv->GetFieldID(cls, "m03", "F");
    matrix4_m10 = jenv->GetFieldID(cls, "m10", "F");
    matrix4_m11 = jenv->GetFieldID(cls, "m11", "F");
    matrix4_m12 = jenv->GetFieldID(cls, "m12", "F");
    matrix4_m13 = jenv->GetFieldID(cls, "m13", "F");
    matrix4_m20 = jenv->GetFieldID(cls, "m20", "F");
    matrix4_m21 = jenv->GetFieldID(cls, "m21", "F");
    matrix4_m22 = jenv->GetFieldID(cls, "m22", "F");
    matrix4_m23 = jenv->GetFieldID(cls, "m23", "F");
    matrix4_m30 = jenv->GetFieldID(cls, "m30", "F");
    matrix4_m31 = jenv->GetFieldID(cls, "m31", "F");
    matrix4_m32 = jenv->GetFieldID(cls, "m32", "F");
    matrix4_m33 = jenv->GetFieldID(cls, "m33", "F");

	jenv->DeleteLocalRef(cls);
}

inline void matrix4_ensurefields(JNIEnv * const &jenv, jobject &m4) {
	if (!matrix4_m00) matrix4_getFields(jenv, m4);
}

void Matrix4f_to_btTransform(JNIEnv * const &jenv, btTransform &target, jobject &source)
{
	matrix4_ensurefields(jenv, source);
	jfloat elements[16] = {
	    jenv->GetFloatField(source, matrix4_m00), jenv->GetFloatField(source, matrix4_m10), jenv->GetFloatField(source, matrix4_m20), jenv->GetFloatField(source, matrix4_m30),
    	jenv->GetFloatField(source, matrix4_m01), jenv->GetFloatField(source, matrix4_m11), jenv->GetFloatField(source, matrix4_m21), jenv->GetFloatField(source, matrix4_m31),
    	jenv->GetFloatField(source, matrix4_m02), jenv->GetFloatField(source, matrix4_m12), jenv->GetFloatField(source, matrix4_m22), jenv->GetFloatField(source, matrix4_m32),
	    jenv->GetFloatField(source, matrix4_m03), jenv->GetFloatField(source, matrix4_m13), jenv->GetFloatField(source, matrix4_m23), jenv->GetFloatField(source, matrix4_m33)
    };
    target.setFromOpenGLMatrix(elements);

}

void btTransform_to_Matrix4f(JNIEnv * const &jenv, jobject &target, const btTransform &source)
{
	matrix4_ensurefields(jenv, target);

    ATTRIBUTE_ALIGNED16(btScalar dst[16]);
	source.getOpenGLMatrix(dst);

	jenv->SetFloatField(target, matrix4_m00, dst[0]);
	jenv->SetFloatField(target, matrix4_m10, dst[1]);
	jenv->SetFloatField(target, matrix4_m20, dst[2]);
	jenv->SetFloatField(target, matrix4_m30, dst[3]);

	jenv->SetFloatField(target, matrix4_m01, dst[4]);
	jenv->SetFloatField(target, matrix4_m11, dst[5]);
	jenv->SetFloatField(target, matrix4_m21, dst[6]);
	jenv->SetFloatField(target, matrix4_m31, dst[7]);

	jenv->SetFloatField(target, matrix4_m02, dst[8]);
	jenv->SetFloatField(target, matrix4_m12, dst[9]);
	jenv->SetFloatField(target, matrix4_m22, dst[10]);
	jenv->SetFloatField(target, matrix4_m32, dst[11]);

	jenv->SetFloatField(target, matrix4_m03, dst[12]);
	jenv->SetFloatField(target, matrix4_m13, dst[13]);
	jenv->SetFloatField(target, matrix4_m23, dst[14]);
	jenv->SetFloatField(target, matrix4_m33, dst[15]);
}
