
%feature("director") btBulletWorldImporter;
%feature("nodirector") btBulletWorldImporter::createMultiSphereShape;

%{
#include <BulletWorldImporter/btWorldImporter.h>
#include <BulletWorldImporter/btBulletWorldImporter.h>
%}

%template(btStringArray) btAlignedObjectArray<char*>;

%ignore btWorldImporter::getNameForPointer(const void* ptr);
%extend btWorldImporter {
	const char*	getNameForPointer(unsigned long cPtr) {
		return $self->getNameForPointer((void*)cPtr);
	}
};

%ignore btBulletWorldImporter::loadFileFromMemory(char *memoryBuffer, int len);
%extend btBulletWorldImporter {
	bool loadFileFromMemory(unsigned char *memoryBuffer, int len) {
		return $self->loadFileFromMemory((char *)memoryBuffer, len);
	}
};

%typemap(javacode) btBulletWorldImporter %{
%}

%include "BulletWorldImporter/btWorldImporter.h"
%include "BulletWorldImporter/btBulletWorldImporter.h"
