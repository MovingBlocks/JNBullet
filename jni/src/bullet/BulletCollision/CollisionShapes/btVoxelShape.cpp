/*
Bullet Continuous Collision Detection and Physics Library
Copyright (c) 2003-2009 Erwin Coumans  http://bulletphysics.org

This software is provided 'as-is', without any express or implied warranty.
In no event will the authors be held liable for any damages arising from the use of this software.
Permission is granted to anyone to use this software for any purpose, 
including commercial applications, and to alter it and redistribute it freely, 
subject to the following restrictions:

1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment in the product documentation would be appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.
*/

#include "btVoxelShape.h"
#include "btCollisionShape.h"

btVoxelShape::btVoxelShape(btVoxelContentProvider* contentProvider,const btVector3& aabbMin,const btVector3& aabbMax)
: m_contentProvider(contentProvider), m_localAabbMin(aabbMin),
m_localAabbMax(aabbMax),
m_collisionMargin(btScalar(0.)),
m_localScaling(btScalar(1.),btScalar(1.),btScalar(1.))
{
	m_shapeType = VOXEL_SHAPE_PROXYTYPE;
}


btVoxelShape::~btVoxelShape()
{
}

///getAabb's default implementation is brute force, expected derived classes to implement a fast dedicated version
void btVoxelShape::getAabb(const btTransform& trans,btVector3& aabbMin,btVector3& aabbMax) const
{
	btVector3 localHalfExtents = btScalar(0.5)*(m_localAabbMax-m_localAabbMin);
	btVector3 localCenter = btScalar(0.5)*(m_localAabbMax+m_localAabbMin);
	
	localHalfExtents += btVector3(getMargin(),getMargin(),getMargin());
		

	btMatrix3x3 abs_b = trans.getBasis().absolute();  

	btVector3 center = trans(localCenter);

    btVector3 extent = localHalfExtents.dot3(abs_b[0], abs_b[1], abs_b[2]);
	aabbMin = center-extent;
	aabbMax = center+extent;
	
}

void	btVoxelShape::calculateLocalInertia(btScalar mass,btVector3& inertia) const
{
	//approximation: take the inertia from the aabb for now
	btTransform ident;
	ident.setIdentity();
	btVector3 aabbMin,aabbMax;
	getAabb(ident,aabbMin,aabbMax);

	btVector3 halfExtents = (aabbMax-aabbMin)*btScalar(0.5);

	btScalar lx=btScalar(2.)*(halfExtents.x());
	btScalar ly=btScalar(2.)*(halfExtents.y());
	btScalar lz=btScalar(2.)*(halfExtents.z());

	inertia[0] = mass/(btScalar(12.0)) * (ly*ly + lz*lz);
	inertia[1] = mass/(btScalar(12.0)) * (lx*lx + lz*lz);
	inertia[2] = mass/(btScalar(12.0)) * (lx*lx + ly*ly);
}

void btVoxelShape::setLocalScaling(const btVector3& scaling)
{
	m_localScaling = scaling;
}

