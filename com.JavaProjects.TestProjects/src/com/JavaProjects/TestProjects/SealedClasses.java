package com.JavaProjects.TestProjects;

public sealed class SealedClasses permits SealedClass1, SealedClass2
{

}

final class  SealedClass1 extends SealedClasses//not able to extend anyone else
{
	
}

sealed class  SealedClass2 extends SealedClasses permits SealedClass3//can extend SealedClass3
{
	
}

non-sealed class SealedClass3 extends SealedClass2 // any one can extend non-sealed class
{
	
}

class SealedClass4 extends SealedClass3
{
	
}