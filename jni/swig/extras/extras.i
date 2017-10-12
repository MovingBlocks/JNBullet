%module Extras

%include "arrays_java.i"

%import "../linearmath/linearmath.i"
%import "../collision/collision.i"
%import "../dynamics/dynamics.i"
%import "../softbody/softbody.i"

%include "../common/gdxCommon.i"

%include "../../swig-src/linearmath/classes.i"
%include "../../swig-src/collision/classes.i"
%include "../../swig-src/dynamics/classes.i"
%include "../../swig-src/softbody/classes.i"

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

%include "./serialize/gdxBulletSerialize.i"
