%module btCompoundShape

%{
#include <BulletCollision/CollisionShapes/btCompoundShape.h>
%}

%typemap(javaimports) btCompoundShape %{
import org.joml.Vector3f;
import org.joml.Quaternionf;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import java.util.ArrayList;
%}

%rename(internalAddChildShape) btCompoundShape::addChildShape;
%javamethodmodifiers btCompoundShape::addChildShape "private";
%rename(internalRemoveChildShape) btCompoundShape::removeChildShape;
%javamethodmodifiers btCompoundShape::removeChildShape "private";
%rename(internalRemoveChildShapeByIndex) btCompoundShape::removeChildShapeByIndex;
%javamethodmodifiers btCompoundShape::removeChildShapeByIndex "private";
%ignore btCompoundShape::getChildShape;

%rename(getChildTransformConst) btCompoundShape::getChildTransform(int) const;
%rename(getDynamicAabbTreeConst) btCompoundShape::getDynamicAabbTree() const;

%typemap(javacode) btCompoundShape %{
	protected ArrayList<btCollisionShape> children = new ArrayList<btCollisionShape>();

	public void addChildShape(Matrix4f localTransform, btCollisionShape shape) {
		internalAddChildShape(localTransform, shape);
		children.add(shape);
		shape.obtain();
	}

	public void removeChildShape(btCollisionShape shape) {
		internalRemoveChildShape(shape);
		final int idx = children.indexOf(shape);
		if (idx >= 0)
			children.remove(idx).release();
	}

	public void removeChildShapeByIndex(int index) {
		internalRemoveChildShapeByIndex(index);
		children.remove(index).release();
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
