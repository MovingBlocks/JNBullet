#ifndef ClosestNotMeRayResultCallback_H
#define ClosestNotMeRayResultCallback_H

#include <BulletCollision/CollisionDispatch/btCollisionObject.h>
#include <BulletCollision/CollisionDispatch/btCollisionWorld.h>

class ClosestNotMeRayResultCallback : public btCollisionWorld::ClosestRayResultCallback
{
public:
	ClosestNotMeRayResultCallback (btCollisionObject* me);
	virtual btScalar addSingleResult(btCollisionWorld::LocalRayResult& rayResult,bool normalInWorldSpace);
protected:
	btCollisionObject* m_me;
};

#endif // ClosestNotMeRayResultCallback_H
