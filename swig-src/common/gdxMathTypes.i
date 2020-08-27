/*
 * Use some libgdx types instead of Bullet types.
 */

// Vector3:
%{
#include <gdx/linearmath/mathtypes.h>
#include <LinearMath/btVector3.h>
#include <LinearMath/btQuaternion.h>
#include <LinearMath/btMatrix3x3.h>
#include <LinearMath/btTransform.h>
%}

CREATE_POOLED_METHODS(Vector3f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btVector3, Vector3f, "Lorg/joml/Vector3f;", Vector3f_to_btVector3, btVector3_to_Vector3f);
ENABLE_POOLED_TYPEMAP(btVector3, Vector3f, "Lorg/joml/Vector3f;");

CREATE_POOLED_METHODS(Quaternionf, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btQuaternion, Quaternionf, "Lcorg/joml/Quaternionf;", Quat4f_to_btQuaternion, btQuaternion_to_Quat4f);
ENABLE_POOLED_TYPEMAP(btQuaternion, Quaternionf, "Lorg/joml/Quaternionf;");

CREATE_POOLED_METHODS(Matrix3f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btMatrix3x3, Matrix3f, "Lorg/joml/Matrix3f;", Matrix3f_to_btMatrix3, btMatrix3_to_Matrix3f);
ENABLE_POOLED_TYPEMAP(btMatrix3x3, Matrix3f, "Lorg/joml/Matrix3f;");

CREATE_POOLED_METHODS(Matrix4f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btTransform, Matrix4f, "Lorg/joml/Matrix4f;", Matrix4f_to_btTransform, btTransform_to_Matrix4f);
ENABLE_POOLED_TYPEMAP(btTransform, Matrix4f, "Lorg/joml/Matrix4f;");
