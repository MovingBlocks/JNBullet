%module(directors="1") Softbody

%include "arrays_java.i"

%import "../dynamics/dynamics.i"

%include "../common/gdxCommon.i"

%include "../../swig-src/linearmath/classes.i"
%include "../../swig-src/collision/classes.i"
%include "../../swig-src/dynamics/classes.i"

%typemap(javaimports) SWIGTYPE	%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}
%pragma(java) jniclassimports=%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
import com.badlogic.gdx.utils.Pool;
%}
%pragma(java) moduleimports=%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
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

%rename(EnumFlagType) fDrawFlags::_;
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

%rename(getWorldInfoConst) btSoftRigidDynamicsWorld::getWorldInfo() const;
%rename(getSoftBodyArrayConst) btSoftRigidDynamicsWorld::getSoftBodyArray() const;
%{
#include <BulletSoftBody/btSoftRigidDynamicsWorld.h>
%}
%include "BulletSoftBody/btSoftRigidDynamicsWorld.h"

%{
#include <BulletSoftBody/btSoftSoftCollisionAlgorithm.h>
%}
%include "BulletSoftBody/btSoftSoftCollisionAlgorithm.h"

%rename(getWorldInfoConst) btSoftMultiBodyDynamicsWorld::getWorldInfo() const;
%rename(getSoftBodyArrayConst) btSoftMultiBodyDynamicsWorld::getSoftBodyArray() const;
%{
#include <BulletSoftBody/btSoftMultiBodyDynamicsWorld.h>
%}
%include "BulletSoftBody/btSoftMultiBodyDynamicsWorld.h"
