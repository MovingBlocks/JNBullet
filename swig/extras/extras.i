%module Extras

%include "arrays_java.i"

%import "../linearmath/linearmath.i"
%import "../collision/collision.i"
%import "../dynamics/dynamics.i"
%import "../softbody/softbody.i"

%include "../common/gdxCommon.i"

%include "../linearmath/classes.i"
%include "../collision/classes.i"
%include "../dynamics/classes.i"
%include "../softbody/classes.i"

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

%include "./serialize/gdxBulletSerialize.i"
