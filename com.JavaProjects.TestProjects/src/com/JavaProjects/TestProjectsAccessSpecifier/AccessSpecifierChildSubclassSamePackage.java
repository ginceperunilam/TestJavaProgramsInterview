package com.JavaProjects.TestProjectsAccessSpecifier;

public class AccessSpecifierChildSubclassSamePackage extends AccessSpecifierParent
{

	public void accessMethods()
	{
		System.out.println("####### AccessSpecifierParent Same Class Starts #######");
		accessToDefault();
		accessToPrivate();
		accessToPublic();
		accessToProtected();
		System.out.println("####### AccessSpecifierParent Same Class End #######");
	}

	public void accessToDefault()
	{
		System.out.println("####### AccessSpecifierChildSubclassSamePackage accessToDefault #######");
		callToDefault();
	}

	public void accessToPrivate()
	{
		System.out
				.println("####### AccessSpecifierChildSubclassSamePackage accessToPrivate not able to access #######");
//	callToPrivate();//not able access private method of another class
	}

	public void accessToPublic()
	{
		System.out.println("####### AccessSpecifierChildSubclassSamePackage accessToPublic #######");
		callToPublic();
	}

	public void accessToProtected()
	{
		System.out.println("####### AccessSpecifierChildSubclassSamePackage accessToProtected #######");
		callToProtected();
	}
}
