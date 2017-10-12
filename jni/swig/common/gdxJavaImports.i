/* 
 * Defines all the imports for all Java proxies, the JNI class, and the 
 * module class.
 */ 
 
%typemap(javaimports) SWIGTYPE	%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}
%pragma(java) jniclassimports=%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
import com.badlogic.gdx.utils.Pool;
%}
%pragma(java) moduleimports=%{
import com.badlogic.gdx.physics.bullet.BulletBase;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}
