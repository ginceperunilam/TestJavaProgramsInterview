package com.JavaProjects.TestProjects;

import com.JavaProjects.TestProjectsAccessSpecifier.AccessSpecifierParent;

public class AccessSpecifierChildSubclassDifferentPackage extends AccessSpecifierParent
{
	public void accessMethods()
	{
		System.out.println("!!!!!- !AccessSpecifierChildNonSubclassDifferentPackage non sub class diff pak Starts -!!!!!!");
		accessToDefault();
		accessToPrivate();
		accessToPublic();
		accessToProtected();
		System.out.println("!!!!!!- AccessSpecifierChildNonSubclassDifferentPackage non sub class diff pak End -!!!!!!");
	}

	public void accessToDefault()
	{
		System.out.println("!!!!!!- AccessSpecifierChildSubclassDifferentPackage accessToDefault, not able to access as it is in an another package -!!!!!!");
//	accessSpecifierParent.callToDefault();//not able access default method of another class which in another package
	}

	public void accessToPrivate()
	{
		System.out.println("!!!!!!- AccessSpecifierChildSubclassDifferentPackage accessToPrivate not able to access -!!!!!!");
//	accessSpecifierParent.callToPrivate();//not able access private method of another class
	}

	public void accessToPublic()
	{
		System.out.println("!!!!!!- AccessSpecifierChildSubclassDifferentPackage accessToPublic -!!!!!!");
		callToPublic();
	}

	public void accessToProtected()
	{
		System.out.println("!!!!!!- AccessSpecifierChildSubclassDifferentPackage accessToProtected -!!!!!!");
		callToProtected();
	}
}
