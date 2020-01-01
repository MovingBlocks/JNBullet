//
// Created by michaelpollind on 12/29/19.
//

#ifndef NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H
#define NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H

#include "LinearMath/btAlignedObjectArray.h"
#include <BulletCollision/CollisionDispatch/btVoxelCollisionAlgorithm.h>
#include <BulletCollision/CollisionShapes/btVoxelShape.h>
#include <Bullet3Common/b3HashMap.h>

struct VoxelRegion {
  short m_x;
  short m_y;
  short m_z;
  btAlignedObjectArray<btVoxelInfo> m_voxels;
public:
  VoxelRegion(int x, int y, int z) : m_x(x), m_y(y), m_z(z), m_voxels(){
    m_voxels.resize(getSize(),btVoxelInfo());
  }
  VoxelRegion(const VoxelRegion &region): m_x(region.m_x),m_y(region.m_y),m_z(region.m_z){
    m_voxels.copyFromArray(region.m_voxels);
  }

  SIMD_FORCE_INLINE bool getBlock(int x, int y, int z,btVoxelInfo& info) const {
    int index = (z * m_x * m_y) + (m_y * y) + x;
    if (index >= 0 && index < getSize()) {
      info = m_voxels[(z * m_x * m_y) + (m_y * y) + x];
      return true;
    }
    return false;
  }

  SIMD_FORCE_INLINE bool setBlock(int x, int y, int z, const btVoxelInfo& voxelInfo) {
    int index = (z * m_x * m_y) + (m_y * y) + x;
    if (index >= 0 && index < getSize()) {
      m_voxels[index] = btVoxelInfo(voxelInfo);
      return  true;
    }
    return false;
  }

  SIMD_FORCE_INLINE int getSize() const{ return m_x * m_y * m_z;}
};

class VoxelCollisionAlgorithmWrapper: public btVoxelContentProvider{
private:
  short m_powerX;
  short m_powerY;
  short m_powerZ;

  short m_x;
  short m_y;
  short m_z;

  b3HashMap<btVector3i,VoxelRegion> m_voxels;
public:

  VoxelCollisionAlgorithmWrapper(int chunkX, int chunkY, int chunkZ): m_voxels(){
    m_powerX = sizeOfPower(chunkX);
    m_powerY = sizeOfPower(chunkY);
    m_powerZ = sizeOfPower(chunkZ);
    m_x = ceilPowerOfTwo(chunkX);
    m_y = ceilPowerOfTwo(chunkY);
    m_z = ceilPowerOfTwo(chunkZ);

  }

//  void getVoxel(int x, int y, int z, btVoxelInfo &) const override;

  static int sizeOfPower(int value);
  static int ceilPowerOfTwo(int value);

  void setRegion(int x, int y, int z,const VoxelRegion& voxels);
  void removeRegion(int x, int y, int z);
  bool setVoxelInfo(int x, int y, int z,const btVoxelInfo& voxelInfo);
  void getVoxel(int x, int y, int z,btVoxelInfo&) const override;

  SIMD_FORCE_INLINE int chunkSize(){  return m_x * m_y * m_z; }
  SIMD_FORCE_INLINE int calculateChunkX(int x) const { return x >> m_powerX; }
  SIMD_FORCE_INLINE int calculateChunkY(int y) const { return y >> m_powerY; }
  SIMD_FORCE_INLINE int calculateChunkZ(int z) const { return z >> m_powerZ; }

  SIMD_FORCE_INLINE int calcBlockPosX(int x) const { return x & (m_x - 1); }
  SIMD_FORCE_INLINE int calcBlockPosY(int y) const{ return y & (m_y - 1); }
  SIMD_FORCE_INLINE int calcBlockPosZ(int z) const{ return z & (m_z - 1); }

};

#endif // NATIVE_BULLET_VOXELCOLLISIONALGORITHMWRAPPER_H
