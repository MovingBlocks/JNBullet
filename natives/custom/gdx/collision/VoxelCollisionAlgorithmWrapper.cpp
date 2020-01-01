//
// Created by michaelpollind on 12/29/19.
//

#include "VoxelCollisionAlgorithmWrapper.h"

void VoxelCollisionAlgorithmWrapper::setRegion(int x, int y, int z,const VoxelRegion& voxels) {
    btVector3i chunkLoc = btVector3i(calculateChunkX(x),calculateChunkY(y),calculateChunkZ(z));
    m_voxels.insert(chunkLoc,VoxelRegion(voxels));
}

void VoxelCollisionAlgorithmWrapper::getVoxel(int x, int y, int z, btVoxelInfo& voxel) const {
  btVector3i v = btVector3i(calculateChunkX(x),calculateChunkY(y),calculateChunkZ(z));
  const VoxelRegion* value = m_voxels.find(v);
  if(value != nullptr){
    int posX = calcBlockPosX(x);
    int posY = calcBlockPosY(y);
    int posZ = calcBlockPosZ(z);
    value->getBlock(posX,posY,posZ,voxel);
  } else {
    voxel = btVoxelInfo();
  }
}

int VoxelCollisionAlgorithmWrapper::sizeOfPower(int value) {
    int power = 0;
    int val = value;
    while (val > 1) {
      val = val >> 1;
      power++;
    }
    return power;
}

int VoxelCollisionAlgorithmWrapper::ceilPowerOfTwo(int value) {
  int result = value - 1;
  result = (result >> 1) | result;
  result = (result >> 2) | result;
  result = (result >> 4) | result;
  result = (result >> 8) | result;
  result = (result >> 16) | result;
  result++;
  return result;
}

bool VoxelCollisionAlgorithmWrapper::setVoxelInfo(int x, int y, int z, const btVoxelInfo &voxelInfo) {
  btVector3i v = btVector3i(calculateChunkX(x),calculateChunkY(y),calculateChunkZ(z));
  VoxelRegion* value = m_voxels.find(v);
  if(value != nullptr){
    int posX = calcBlockPosX(x);
    int posY = calcBlockPosY(y);
    int posZ = calcBlockPosZ(z);
    value->setBlock(posX,posY,posZ,voxelInfo);
    return true;
  }
  return false;
}

void VoxelCollisionAlgorithmWrapper::removeRegion(int x, int y, int z) {
  btVector3i chunkLoc = btVector3i(calculateChunkX(x),calculateChunkY(y),calculateChunkZ(z));
  m_voxels.remove(chunkLoc);
}
