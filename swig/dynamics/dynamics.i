%module(directors="1") Dynamics

%include "arrays_java.i"

%import "../collision/collision.i"

%include "../common/gdxCommon.i"

%include "../linearmath/classes.i"
%include "../collision/classes.i"

%ignore btSolverBody::getWorldTransform;
%ignore btSolverBody::setWorldTransform;
%ignore btSolverBody::getDeltaLinearVelocity;
%ignore btSolverBody::getDeltaAngularVelocity;
%ignore btSolverBody::getPushVelocity;
%ignore btSolverBody::getTurnVelocity;

%ignore btSequentialImpulseConstraintSolver::getSSE2ConstraintRowSolverGeneric();
%ignore btSequentialImpulseConstraintSolver::getSSE2ConstraintRowSolverLowerLimit();
%ignore btSequentialImpulseConstraintSolver::getSSE4_1ConstraintRowSolverGeneric();
%ignore btSequentialImpulseConstraintSolver::getSSE4_1ConstraintRowSolverLowerLimit();


%typemap(javaimports) SWIGTYPE	%{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.collision.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}
%pragma(java) jniclassimports=%{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.collision.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
import org.terasology.bullet.utils.Pool;
%}
%pragma(java) moduleimports=%{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.collision.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}

%feature("director") InternalTickCallback;
%feature("director") CustomActionInterface;
%ignore CustomActionInterface::updateAction(btCollisionWorld*, btScalar);
%ignore CustomActionInterface::debugDraw(btIDebugDraw*);

%include "./btRigidBody.i"

%include "./btTypedConstraint.i"

%{
#include <BulletDynamics/Dynamics/btDynamicsWorld.h>
%}
%include "BulletDynamics/Dynamics/btDynamicsWorld.h"

%{
#include <gdx/dynamics/InternalTickCallback.h>
%}
%include "gdx/dynamics/InternalTickCallback.h"

%{
#include <BulletDynamics/Dynamics/btSimpleDynamicsWorld.h>
%}
%include "BulletDynamics/Dynamics/btSimpleDynamicsWorld.h"

%{
#include <BulletDynamics/Dynamics/btActionInterface.h>
%}
%include "BulletDynamics/Dynamics/btActionInterface.h"

%{
#include <gdx/dynamics/CustomActionInterface.h>
%}
%include "gdx/dynamics/CustomActionInterface.h"

%{
#include <BulletDynamics/Dynamics/btDiscreteDynamicsWorld.h>
%}
%include "BulletDynamics/Dynamics/btDiscreteDynamicsWorld.h"

%{
#include <BulletDynamics/Character/btCharacterControllerInterface.h>
%}
%include "BulletDynamics/Character/btCharacterControllerInterface.h"

%{
#include <BulletDynamics/Character/btKinematicCharacterController.h>
%}
%include "BulletDynamics/Character/btKinematicCharacterController.h"

%{
#include <BulletDynamics/ConstraintSolver/btContactSolverInfo.h>
%}
%include "BulletDynamics/ConstraintSolver/btContactSolverInfo.h"

%{
#include <BulletDynamics/ConstraintSolver/btConstraintSolver.h>
%}
%include "BulletDynamics/ConstraintSolver/btConstraintSolver.h"

%{
#include <BulletDynamics/ConstraintSolver/btSequentialImpulseConstraintSolver.h>
%}
%include "BulletDynamics/ConstraintSolver/btSequentialImpulseConstraintSolver.h"


%{
#include <BulletDynamics/ConstraintSolver/btSolverBody.h>
%}
%include "BulletDynamics/ConstraintSolver/btSolverBody.h"

%{
#include <BulletDynamics/ConstraintSolver/btSliderConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btSliderConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btPoint2PointConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btPoint2PointConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btJacobianEntry.h>
%}
%include "BulletDynamics/ConstraintSolver/btJacobianEntry.h"

%{
#include <BulletDynamics/ConstraintSolver/btSolve2LinearConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btSolve2LinearConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btGeneric6DofConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btGeneric6DofConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btUniversalConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btUniversalConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btContactConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btContactConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btConeTwistConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btConeTwistConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btGeneric6DofSpringConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btGeneric6DofSpringConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btGeneric6DofSpring2Constraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btGeneric6DofSpring2Constraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btHingeConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btHingeConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btSolverConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btSolverConstraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btHinge2Constraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btHinge2Constraint.h"

%{
#include <BulletDynamics/ConstraintSolver/btFixedConstraint.h>
%}
%include "BulletDynamics/ConstraintSolver/btFixedConstraint.h"

%{
#include <BulletDynamics/Vehicle/btVehicleRaycaster.h>
%}
%include "BulletDynamics/Vehicle/btVehicleRaycaster.h"

// NOTE: btWheelInfo doesnt have a ctor but is required, this must be manually added.
%{
#include <BulletDynamics/Vehicle/btWheelInfo.h>
%}
%include "BulletDynamics/Vehicle/btWheelInfo.h"

%include "./btRaycastVehicle.i"

%{
#include <gdx/dynamics/FilterableVehicleRaycaster.h>
%}
%include "gdx/dynamics/FilterableVehicleRaycaster.h"
