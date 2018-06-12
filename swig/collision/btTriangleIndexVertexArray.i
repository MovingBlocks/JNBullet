%module btIndexedMesh

%{
#include <BulletCollision/CollisionShapes/btTriangleIndexVertexArray.h>
%}

%extend btIndexedMesh {
	void setTriangleIndexBase(short *data) {
		$self->m_triangleIndexBase = (unsigned char*)data;
	}
	void setVertexBase(float *data) {
		$self->m_vertexBase = (unsigned char*)data;
	}
	void setVertices(float *vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes) {
		unsigned char *data = (unsigned char *)vertices;
		$self->m_vertexBase = &(data[positionOffsetInBytes]);
		$self->m_vertexStride = sizeInBytesOfEachVertex;
		$self->m_numVertices = vertexCount;
		$self->m_vertexType = PHY_FLOAT;
	}
	void setIndices(short *indices, int indexOffset, int indexCount) {
		$self->m_triangleIndexBase = (unsigned char*)&(indices[indexOffset]);
		$self->m_triangleIndexStride = 3 * sizeof(short);
		$self->m_numTriangles = indexCount / 3;
		$self->m_indexType = PHY_SHORT;
	}
};

%typemap(javaimports) btIndexedMesh %{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import org.terasology.bullet.utils.BulletRuntimeException;
import com.google.common.collect.Lists;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;
%}

%typemap(javacode) btIndexedMesh %{
	protected final static List<btIndexedMesh> instances =  Lists.newArrayList();

	protected static btIndexedMesh getInstance(final Object tag) {
		final int n = instances.size();
		for (int i = 0; i < n; i++) {
			final btIndexedMesh mesh = instances.get(i);
			if (tag.equals(mesh.tag))
				return mesh;
		}
		return null;
	}

	
	/** Create or reuse a btIndexedMesh instance based on the specified tag.
	 * Use {@link #release()} to release the mesh when it's no longer needed. */
	public static btIndexedMesh obtain(final Object tag,
			final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		if (tag == null)
			throw new BulletRuntimeException("tag cannot be null");
		
		btIndexedMesh result = getInstance(tag);
		if (result == null) {
			result = new btIndexedMesh(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
			result.tag = tag;
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	/** The tag to identify this btIndexedMesh, may be null. Typically this is the {@link Mesh} or {@link MeshPart} used to create or set
	 * this btIndexedMesh. Use by the static obtain(...) methods to avoid creating duplicate instances. */
	public Object tag;
	

	/** Construct a new btIndexedMesh based on the supplied vertex and index data.
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */	
	public btIndexedMesh(final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		this();
		set(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
	}


	/** Convenience method to set this btIndexedMesh to the specified vertex and index data. 
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh. */
	public void set(final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		set(null, vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
	}
	
	/** Convenience method to set this btIndexedMesh to the specified vertex and index data. 
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh. */
	public void set(final Object tag,
			final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		setVertices(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes);
		setIndices(indices, indexOffset, indexCount);
		this.tag = tag;
	}
%}

%rename(internalAddIndexedMesh) btTriangleIndexVertexArray::addIndexedMesh;
%javamethodmodifiers btTriangleIndexVertexArray::addIndexedMesh "private";
%ignore btTriangleIndexVertexArray::btTriangleIndexVertexArray(int numTriangles,int* triangleIndexBase,int triangleIndexStride,int numVertices,btScalar* vertexBase,int vertexStride);
%ignore btTriangleIndexVertexArray::getIndexedMeshArray();

%typemap(javaimports) btTriangleIndexVertexArray %{
import org.terasology.bullet.BulletBase;
import org.terasology.bullet.linearmath.*;
import com.google.common.collect.Lists;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;
import org.terasology.bullet.utils.BulletRuntimeException;
import java.util.Collection;
import java.util.List;
%}

%typemap(javacode) btTriangleIndexVertexArray %{

	protected final static List<btTriangleIndexVertexArray> instances = Lists.newArrayList();

	/** @return Whether the supplied array contains all specified tags. */
    public static <T extends Object> boolean compare(final btTriangleIndexVertexArray array, final Collection<T> tags) {
        if (array.meshes.size() != tags.size())
            return false;
        for (final btIndexedMesh mesh : array.meshes) {
            boolean found = false;
            final Object tag = mesh.tag;
            if (tag == null)
                return false;
            for (final T t : tags) {
                if (t.equals(tag)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

	protected static <T extends Object> btTriangleIndexVertexArray getInstance(final Collection<T> tags) {
		for (final btTriangleIndexVertexArray instance : instances) {
			if (compare(instance, tags))
				return instance;
		}
		return null;
	}

	
	protected final List<btIndexedMesh> meshes = Lists.newArrayList();

	/** The amount of meshes this array contains. */
	public int getIndexedMeshCount() {
		return meshes.size();
	}

	/** Return the {@link btIndexedMesh} at the specified index. */
	public btIndexedMesh getIndexedMesh(int index) {
		return meshes.get(index);
	}


	
	/** Add a {@link btIndexedMesh} to this array */
	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh, int indexType) {
		mesh.obtain();
		internalAddIndexedMesh(mesh, indexType);
		meshes.add(mesh);
		return this;
	}

	/** Add a {@link btIndexedMesh} to this array */
	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh) {
		return addIndexedMesh(mesh, PHY_ScalarType.PHY_SHORT);
	}
	
	@Override
	public void dispose() {
		for (final btIndexedMesh mesh : meshes)
			mesh.release();
		meshes.clear();
		super.dispose();
	}
%}

%include "BulletCollision/CollisionShapes/btTriangleIndexVertexArray.h"
