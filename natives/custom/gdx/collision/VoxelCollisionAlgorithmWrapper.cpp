//
// Created by michaelpollind on 12/29/19.
//

#include "VoxelCollisionAlgorithmWrapper.h"
#include <string>
#if !defined(__CELLOS_LV2__) && !defined(__MWERKS__)
#include <memory.h>
#endif
#include <string.h>

void VoxelCollisionAlgorithmWrapper::getVoxel(int x, int y, int z, btVoxelInfo& voxel) const{

  btVector3i chunk =
      btVector3i(calculateChunkX(x), calculateChunkY(y), calculateChunkZ(z));
  auto ids = m_blocks.find(chunk);
  short id = 0;
  if (ids != NULL) {
    int lx = calcBlockPosX(x);
    int ly = calcBlockPosY(y);
    int lz = calcBlockPosZ(z);
    int index = (lz * m_x * m_y) + (lx * m_y) + ly;
    if (index >= 0 && index < chunkSize()) {
      id = (*ids)[index];
    } else {
      voxel = btVoxelInfo();
      return;
    }
  }
  const btVoxelInfo *info = m_block_cache.find(b3HashInt(id));
  if (info == nullptr) {
    voxel = btVoxelInfo();
  } else {
    voxel = (*info);
  }

}

void VoxelCollisionAlgorithmWrapper::setVoxelInfo(const btVoxelInfo& voxelInfo){
  btVoxelInfo info = voxelInfo;
  m_block_cache.insert(b3HashInt(voxelInfo.m_voxelTypeId),info);
}


void VoxelCollisionAlgorithmWrapper::setRegion(int x, int y, int z, const short* input){
  btVector3i chunk = btVector3i(x,y,z);

  short** blockIds = m_blocks.find(chunk);
  if(blockIds == NULL){
    short* newIds = new short[chunkSize()];
    memcpy(newIds,input,chunkSize()* sizeof(short));
    m_blocks.insert(chunk,newIds);
  } else {
    memcpy((*blockIds),input,chunkSize()* sizeof(short));
  }
}

void VoxelCollisionAlgorithmWrapper::freeRegion(int x, int y, int z) {
  btVector3i chunk = btVector3i(x,y,z);
  short** blockIds = m_blocks.find(chunk);
  if(blockIds != NULL){
    delete [] (*blockIds);
    m_blocks.remove(chunk);
  }
}

void VoxelCollisionAlgorithmWrapper::setBlock(int x, int y, int z, short key) {
  btVector3i chunk = btVector3i(calculateChunkX(x),calculateChunkY(y),calculateChunkZ(z));
  short** blockIds = m_blocks.find(chunk);
  if(blockIds != NULL){
    int lx = calcBlockPosX(x);
    int ly = calcBlockPosY(y);
    int lz = calcBlockPosZ(z);

    int index = (lz * m_x * m_y) + (lx * m_y) + ly;
    if(index >= 0 && index < chunkSize()) {
      (*blockIds)[index] = key;
    }
  }
}
