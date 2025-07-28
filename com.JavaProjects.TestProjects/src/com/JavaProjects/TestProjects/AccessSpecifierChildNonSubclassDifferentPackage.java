package com.JavaProjects.TestProjects;

import com.JavaProjects.TestProjectsAccessSpecifier.AccessSpecifierParent;

public class AccessSpecifierChildNonSubclassDifferentPackage
{
	AccessSpecifierParent accessSpecifierParent = null;

	public AccessSpecifierChildNonSubclassDifferentPackage()
	{
		accessSpecifierParent = new AccessSpecifierParent();
	}

	public void accessMethods()
	{
		System.out
				.println("$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage non sub class diff pak Starts $$$$$$");
		accessToDefault();
		accessToPrivate();
		accessToPublic();
		accessToProtected();
		System.out.println("$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage non sub class diff pak End $$$$$$");
	}

	public void accessToDefault()
	{
		System.out.println(
				"$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage accessToDefault, not able to access $$$$$$");
//	accessSpecifierParent.callToDefault();//not able to access default method of another non sub class in an another package 
	}

	public void accessToPrivate()
	{
		System.out.println(
				"$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage accessToPrivate, not able to access $$$$$$");
//	accessSpecifierParent.callToPrivate();//not able access private method of another class
	}

	public void accessToPublic()
	{
		System.out.println("$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage accessToPublic $$$$$$");
		accessSpecifierParent.callToPublic();
	}

	public void accessToProtected()
	{
		System.out.println(
				"$$$$$$ AccessSpecifierChildNonSubclassDifferentPackage accessToProtected, not able to access $$$$$$");
//	accessSpecifierParent.callToProtected();//not able to access protected method of another non sub class in an another package
	}
}
