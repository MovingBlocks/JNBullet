/*
Bullet Continuous Collision Detection and Physics Library
Copyright (c) 2003-2006 Erwin Coumans  http://continuousphysics.com/Bullet/

This software is provided 'as-is', without any express or implied warranty.
In no event will the authors be held liable for any damages arising from the use of this software.
Permission is granted to anyone to use this software for any purpose, 
including commercial applications, and to alter it and redistribute it freely, 
subject to the following restrictions:

1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment in the product documentation would be appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.

*/

#include <limits.h>
#include "BulletCollision/CollisionDispatch/btVoxelCollisionAlgorithm.h"
#include "BulletCollision/CollisionDispatch/btCollisionObject.h"
#include "BulletCollision/CollisionShapes/btVoxelShape.h"
#include "BulletCollision/BroadphaseCollision/btDbvt.h"
#include "LinearMath/btIDebugDraw.h"
#include "LinearMath/btAabbUtil2.h"
#include "btManifoldResult.h"
#include "BulletCollision/CollisionDispatch/btCollisionObjectWrapper.h"

btVoxelCollisionAlgorithm::btVoxelCollisionAlgorithm( const btCollisionAlgorithmConstructionInfo& ci,const btCollisionObjectWrapper* body0Wrap,const btCollisionObjectWrapper* body1Wrap,bool isSwapped)
:btCollisionAlgorithm(ci),
m_isSwapped(isSwapped),
m_lastMin(INT_MAX, INT_MAX, INT_MAX),
m_lastMax(INT_MIN, INT_MIN, INT_MIN),
m_sharedManifold(ci.m_manifold)
{

	const btCollisionObjectWrapper* colObjWrap = m_isSwapped? body1Wrap : body0Wrap;
	btAssert (colObjWrap->getCollisionShape()->isVoxel());
	
//	const btVoxelShape* voxelShape = static_cast<const btVoxelShape*>(colObjWrap->getCollisionShape());
}

btVoxelCollisionAlgorithm::~btVoxelCollisionAlgorithm()
{
	int numChildren = m_voxelCollisionInfo.size();
	for (int i = 0; i<numChildren; i++)
	{
		if (m_voxelCollisionInfo[i].algorithm) {
			m_voxelCollisionInfo[i].algorithm->~btCollisionAlgorithm();
			m_dispatcher->freeCollisionAlgorithm(m_voxelCollisionInfo[i].algorithm);
		}
	}
}

void btVoxelCollisionAlgorithm::processCollision (const btCollisionObjectWrapper* body0Wrap,const btCollisionObjectWrapper* body1Wrap,const btDispatcherInfo& dispatchInfo,btManifoldResult* resultOut)
{
	const btCollisionObjectWrapper* colObjWrap = m_isSwapped? body1Wrap : body0Wrap;
	const btCollisionObjectWrapper* otherObjWrap = m_isSwapped? body0Wrap : body1Wrap;

	btAssert (colObjWrap->getCollisionShape()->isVoxel());
	const btVoxelShape* voxelShape = static_cast<const btVoxelShape*>(colObjWrap->getCollisionShape());

	btTransform	otherTransform = otherObjWrap->getWorldTransform();
	btVector3 aabbMin;
	btVector3 aabbMax;
	otherObjWrap->getCollisionShape()->getAabb(otherTransform, aabbMin, aabbMax);

	btVector3 scale = voxelShape->getLocalScaling();
	btVector3i regionMin(static_cast <int> (floor(aabbMin.x() / scale.x() + .5)), static_cast <int> (floor(aabbMin.y() / scale.y() + .5)), static_cast <int> (floor(aabbMin.z() / scale.z() + .5)));
	btVector3i regionMax(static_cast <int> (floor(aabbMax.x() / scale.x() + .5)), static_cast <int> (floor(aabbMax.y() / scale.y() + .5)), static_cast <int> (floor(aabbMax.z() / scale.z() + .5)));

	// Remove out of bounds collision info
	int numChildren = m_voxelCollisionInfo.size();
	int i = 0;
	while (i < numChildren) 
	{
		if (m_voxelCollisionInfo[i].position.x < regionMin.x || m_voxelCollisionInfo[i].position.x > regionMax.x ||
			m_voxelCollisionInfo[i].position.y < regionMin.y || m_voxelCollisionInfo[i].position.y > regionMax.y ||
			m_voxelCollisionInfo[i].position.z < regionMin.z || m_voxelCollisionInfo[i].position.z > regionMax.z)
		{
			if (m_voxelCollisionInfo[i].algorithm) {
				m_voxelCollisionInfo[i].algorithm->~btCollisionAlgorithm();
				m_dispatcher->freeCollisionAlgorithm(m_voxelCollisionInfo[i].algorithm);
			}
			if (numChildren > 1) {
				m_voxelCollisionInfo[i] = m_voxelCollisionInfo[numChildren - 1];
			}
			--numChildren;
		}
		else 
		{
			++i;
		}
	}
	if (numChildren < m_voxelCollisionInfo.size()) {
		m_voxelCollisionInfo.resize(numChildren);
	}

	// Add new in-bounds collision info
	for (int x = regionMin.x; x <= regionMax.x; ++x) {
		for (int y = regionMin.y; y <= regionMax.y; ++y) {
			for (int z = regionMin.z; z <= regionMax.z; ++z) {
				if ((x < m_lastMin.x || x > m_lastMax.x)
					|| (y < m_lastMin.y || y > m_lastMax.y)
					|| (z < m_lastMin.z || z > m_lastMax.z))
				{
					int newIndex = m_voxelCollisionInfo.size();
					m_voxelCollisionInfo.resize(newIndex + 1);
					m_voxelCollisionInfo[newIndex].position.x = x;
					m_voxelCollisionInfo[newIndex].position.y = y;
					m_voxelCollisionInfo[newIndex].position.z = z;
					m_voxelCollisionInfo[newIndex].algorithm = 0;
				}
			}
		}
	}

	{
		btManifoldArray manifoldArray;
		for (i = 0; i < m_voxelCollisionInfo.size(); i++)
		{
			if (m_voxelCollisionInfo[i].algorithm)
			{
				m_voxelCollisionInfo[i].algorithm->getAllContactManifolds(manifoldArray);
				for (int m = 0; m<manifoldArray.size(); m++)
				{
					if (manifoldArray[m]->getNumContacts())
					{
						resultOut->setPersistentManifold(manifoldArray[m]);
						resultOut->refreshContactPoints();
					}
				}
				manifoldArray.resize(0);
			}
		}
	}

	// Process collisions
	numChildren = m_voxelCollisionInfo.size();
	btVoxelContentProvider*  contentProvider = voxelShape->getContentProvider();
	for (i = 0; i < numChildren; ++i) {
		btVoxelCollisionInfo& collisionInfo = m_voxelCollisionInfo[i];
		btVoxelInfo info;
		contentProvider->getVoxel(collisionInfo.position.x, collisionInfo.position.y, collisionInfo.position.z, info);
		if (collisionInfo.algorithm) {
			// Remove old algorithm if necessary
			if (!info.m_blocking || info.m_voxelTypeId != collisionInfo.voxelTypeId || info.m_collisionShape->getShapeType() != collisionInfo.shapeType) {
				collisionInfo.algorithm->~btCollisionAlgorithm();
				m_dispatcher->freeCollisionAlgorithm(collisionInfo.algorithm);
				collisionInfo.algorithm = 0;
			}
		}		
		if (info.m_blocking) {
			btTransform voxelTransform;
			voxelTransform.setIdentity();
			voxelTransform.setOrigin(btVector3(collisionInfo.position.x  * scale.x() + info.m_collisionOffset.x(), collisionInfo.position.y  * scale.y() + info.m_collisionOffset.y(), collisionInfo.position.z  * scale.z() + info.m_collisionOffset.z()));
			btCollisionObjectWrapper voxelWrap(colObjWrap, info.m_collisionShape, colObjWrap->getCollisionObject(), voxelTransform, -1, -1,info);

			// Add new algorithm if necessary
			if (!collisionInfo.algorithm) {
				collisionInfo.algorithm = m_dispatcher->findAlgorithm(&voxelWrap, otherObjWrap, m_sharedManifold);
				collisionInfo.shapeType = info.m_collisionShape->getShapeType();
				collisionInfo.voxelTypeId = info.m_voxelTypeId;
			}

			const btCollisionObjectWrapper* tmpWrap = 0;
			if (resultOut->getBody0Internal() == colObjWrap->getCollisionObject())
			{
				tmpWrap = resultOut->getBody0Wrap();
				resultOut->setBody0Wrap(&voxelWrap);
				resultOut->setShapeIdentifiersA(-1, i);
			}
			else
			{
				tmpWrap = resultOut->getBody1Wrap();
				resultOut->setBody1Wrap(&voxelWrap);
				resultOut->setShapeIdentifiersB(-1, i);
			}

			collisionInfo.algorithm->processCollision(&voxelWrap, otherObjWrap, dispatchInfo, resultOut);

			if (resultOut->getBody0Internal() == colObjWrap->getCollisionObject())
			{
				resultOut->setBody0Wrap(tmpWrap);
			}
			else
			{
				resultOut->setBody1Wrap(tmpWrap);
			}
		}		
	}
	m_lastMin = regionMin;
	m_lastMax = regionMax;
}


btScalar	btVoxelCollisionAlgorithm::calculateTimeOfImpact(btCollisionObject* body0,btCollisionObject* body1,const btDispatcherInfo& dispatchInfo,btManifoldResult* resultOut)
{
	return 0;
}



