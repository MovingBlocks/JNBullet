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
CREATE_POOLED_TYPEMAP(btVector3, Vector3f, "Lorg/terasology/math/geom/Vector3f;", Vector3_to_btVector3, btVector3_to_Vector3);
ENABLE_POOLED_TYPEMAP(btVector3, Vector3f, "Lorg/terasology/math/geom/Vector3f;");

CREATE_POOLED_METHODS(Quat4f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btQuaternion, Quat4f, "Lorg/terasology/math/geom/Quat4f;", Quaternion_to_btQuaternion, btQuaternion_to_Quaternion);
ENABLE_POOLED_TYPEMAP(btQuaternion, Quat4f, "Lorg/terasology/math/geom/Quat4f;");

CREATE_POOLED_METHODS(Matrix3f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btMatrix3x3, Matrix3f, "Lorg/terasology/math/geom/Matrix3f;", Matrix3_to_btMatrix3, btMatrix3_to_Matrix3);
ENABLE_POOLED_TYPEMAP(btMatrix3x3, Matrix3f, "Lorg/terasology/math/geom/Matrix3f;");

CREATE_POOLED_METHODS(Matrix4f, "com/badlogic/gdx/physics/bullet/linearmath/LinearMath");
CREATE_POOLED_TYPEMAP(btTransform, Matrix4f, "Lorg/terasology/math/geom/Matrix4f;", Matrix4_to_btTransform, btTransform_to_Matrix4);
ENABLE_POOLED_TYPEMAP(btTransform, Matrix4f, "Lorg/terasology/math/geom/Matrix4f;");

