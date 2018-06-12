%module Softbody

%include "arrays_java.i"

%import "../linearmath/linearmath.i"
%import "../collision/collision.i"
%import "../dynamics/dynamics.i"

%include "../common/gdxCommon.i"

%include "../linearmath/classes.i"
%include "../collision/classes.i"
%include "../dynamics/classes.i"

%typemap(javaimports) SWIGTYPE	%{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.collision.*;
import org.terasology.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}
%pragma(java) jniclassimports=%{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.collision.*;
import org.terasology.bullet.dynamics.*;
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
import org.terasology.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}

%{
#include <BulletCollision/CollisionDispatch/btCollisionWorld.h>
typedef btCollisionWorld::RayResultCallback RayResultCallback;
%}

%{
#include <BulletSoftBody/btSoftBodySolvers.h>
%}
%include "BulletSoftBody/btSoftBodySolvers.h"

%{
#include <BulletSoftBody/btDefaultSoftBodySolver.h>
%}
%include "BulletSoftBody/btDefaultSoftBodySolver.h"

%{
#include <BulletSoftBody/btSparseSDF.h>
%}
%include "BulletSoftBody/btSparseSDF.h"

%include "./btSoftBody.i"

%{
#include <BulletSoftBody/btSoftBodyConcaveCollisionAlgorithm.h>
%}
%include "BulletSoftBody/btSoftBodyConcaveCollisionAlgorithm.h"

%{
#include <BulletSoftBody/btSoftBodyData.h>
%}
%include "BulletSoftBody/btSoftBodyData.h"

%{
#include <BulletSoftBody/btSoftBodyHelpers.h>
%}
%include "BulletSoftBody/btSoftBodyHelpers.h"

%{
#include <BulletSoftBody/btSoftBodyInternals.h>
%}
%include "BulletSoftBody/btSoftBodyInternals.h"

%{
#include <BulletSoftBody/btSoftBodyRigidBodyCollisionConfiguration.h>
%}
%include "BulletSoftBody/btSoftBodyRigidBodyCollisionConfiguration.h"

%{
#include <BulletSoftBody/btSoftBodySolverVertexBuffer.h>
%}
%include "BulletSoftBody/btSoftBodySolverVertexBuffer.h"

%{
#include <BulletSoftBody/btSoftRigidCollisionAlgorithm.h>
%}
%include "BulletSoftBody/btSoftRigidCollisionAlgorithm.h"

%{
#include <BulletSoftBody/btSoftRigidDynamicsWorld.h>
%}
%include "BulletSoftBody/btSoftRigidDynamicsWorld.h"

%{
#include <BulletSoftBody/btSoftSoftCollisionAlgorithm.h>
%}
%include "BulletSoftBody/btSoftSoftCollisionAlgorithm.h"
