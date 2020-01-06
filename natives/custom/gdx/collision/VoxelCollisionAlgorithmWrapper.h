//
// Created by michaelpollind on 12/29/19.
//

#ifndef NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H
#define NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H

#include "LinearMath/btAlignedObjectArray.h"
#include <Bullet3Common/b3HashMap.h>
#include <BulletCollision/CollisionDispatch/btVoxelCollisionAlgorithm.h>
#include <BulletCollision/CollisionShapes/btVoxelShape.h>

class VoxelCollisionAlgorithmWrapper: public btVoxelContentProvider{
private:

  int m_x;
  int m_y;
  int m_z;

  int m_px;
  int m_py;
  int m_pz;

  b3HashMap<b3HashInt,btVoxelInfo> m_block_cache;
  b3HashMap<btVector3i,short* > m_blocks;

  SIMD_FORCE_INLINE int chunkSize() const {  return m_x * m_y * m_z; }
  SIMD_FORCE_INLINE int calculateChunkX(int x) const { return x >> m_px; }
  SIMD_FORCE_INLINE int calculateChunkY(int y) const { return y >> m_py; }
  SIMD_FORCE_INLINE int calculateChunkZ(int z) const { return z >> m_pz; }

  SIMD_FORCE_INLINE int calcBlockPosX(int x) const { return x & (m_x - 1); }
  SIMD_FORCE_INLINE int calcBlockPosY(int y) const{ return y & (m_y - 1); }
  SIMD_FORCE_INLINE int calcBlockPosZ(int z) const{ return z & (m_z - 1); }

  static int sizeOfPower(int value) {
    int power = 0;
    int val = value;
    while (val > 1) {
      val = val >> 1;
      power++;
    }
    return power;
  }
public:

  VoxelCollisionAlgorithmWrapper(int x,int y,int z): m_blocks(), m_block_cache(), m_x(x), m_y(y), m_z(z) {
    m_px = sizeOfPower(m_x);
    m_py = sizeOfPower(m_y);
    m_pz = sizeOfPower(m_z);
  }
  void setRegion(int x, int y, int z, const short* input);
  void freeRegion(int x, int y, int z);
  void setBlock(int x, int y, int z, short key);

  void setVoxelInfo(const btVoxelInfo& voxelInfo);
  void getVoxel(int x, int y, int z,btVoxelInfo&) const override;

};

#endif // NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H
