%module btCompoundShape

%{
#include <BulletCollision/CollisionShapes/btCompoundShape.h>
%}

%typemap(javaimports) btCompoundShape %{
import com.badlogic.gdx.utils.Array;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
%}

%rename(internalAddChildShape) btCompoundShape::addChildShape;
%javamethodmodifiers btCompoundShape::addChildShape "private";
%rename(internalRemoveChildShape) btCompoundShape::removeChildShape;
%javamethodmodifiers btCompoundShape::removeChildShape "private";
%rename(internalRemoveChildShapeByIndex) btCompoundShape::removeChildShapeByIndex;
%javamethodmodifiers btCompoundShape::removeChildShapeByIndex "private";
%ignore btCompoundShape::getChildShape;

%typemap(javacode) btCompoundShape %{
	protected Array<btCollisionShape> children = new Array<btCollisionShape>();
	
	public void addChildShape(Matrix4f localTransform, btCollisionShape shape) {
		internalAddChildShape(localTransform, shape);
		children.add(shape);
		shape.obtain();
	}
	
	public void removeChildShape(btCollisionShape shape) {
		internalRemoveChildShape(shape);
		final int idx = children.indexOf(shape, false);
		if (idx >= 0)
			children.removeIndex(idx).release();
	}
	
	public void removeChildShapeByIndex(int index) {
		internalRemoveChildShapeByIndex(index);
		children.removeIndex(index).release();
	}
	
	public btCollisionShape getChildShape(int index) {
		return children.get(index);
	}
	
	@Override
	public void dispose() {
		for (btCollisionShape child : children)
			child.release();
		children.clear();
		super.dispose();
	}
%}

%include "BulletCollision/CollisionShapes/btCompoundShape.h"