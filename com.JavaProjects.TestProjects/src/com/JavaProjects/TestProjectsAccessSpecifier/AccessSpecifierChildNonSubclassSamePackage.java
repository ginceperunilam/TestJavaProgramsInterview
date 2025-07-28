package com.JavaProjects.TestProjectsAccessSpecifier;

public class AccessSpecifierChildNonSubclassSamePackage
{
	AccessSpecifierParent accessSpecifierParent = null;

	public AccessSpecifierChildNonSubclassSamePackage()
	{
		accessSpecifierParent = new AccessSpecifierParent();
		accessMethods();
	}

	public void accessMethods()
	{
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage same package Non-sub class Starts****");
		accessToDefault();
		accessToPrivate();
		accessToPublic();
		accessToProtected();
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage same package Non-sub class End****");
	}

	public void accessToDefault()
	{
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage accessToDefault****");
		accessSpecifierParent.callToDefault();
	}

	public void accessToPrivate()
	{
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage accessToPrivate not able to access****");
//	accessSpecifierParent.callToPrivate();//not able access private method of another class
	}

	public void accessToPublic()
	{
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage accessToPublic ****");
		accessSpecifierParent.callToPublic();
	}

	public void accessToProtected()
	{
		System.out.println("****AccessSpecifierChildNonSubclassSamePackage accessToProtected ****");
		accessSpecifierParent.callToProtected();
	}
}
