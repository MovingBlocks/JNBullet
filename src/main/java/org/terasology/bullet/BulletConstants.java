/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.bullet;

public interface BulletConstants {
  public final static int BT_BULLET_VERSION = 285;
  public final static double BT_LARGE_FLOAT = 1e18;
  public final static double BT_ONE = 1.0;
  public final static double BT_ZERO = 0.0;
  public final static double BT_TWO = 2.0;
  public final static double BT_HALF = 0.5;
  public final static String btVector3DataName = "btVector3FloatData";
  public final static String btQuaternionDataName = "btQuaternionFloatData";
  public final static int USE_BANCHLESS = 1;
  public final static int USE_BT_CLOCK = 1;
  public final static int BT_USE_PLACEMENT_NEW = 1;
}