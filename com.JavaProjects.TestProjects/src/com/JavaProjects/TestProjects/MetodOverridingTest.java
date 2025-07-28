package com.JavaProjects.TestProjects;

public class MetodOverridingTest
{
	public void metodOverridingTest()
	{
		Son son = new Son();
		String phoneNumber = son.phoneNumber();
		System.out.println("Phone umber :"+phoneNumber);
		String houseName = son.houseName();
		System.out.println("House Name:"+houseName);
	}
}

class Father
{
	public String phoneNumber()
	{
		return "Phone number is 9497291149";
	}
	
	public String houseName()
	{
		return "House Name is Perunilam..";
	}
}

class Son extends Father
{
	@Override
	public String phoneNumber()
	{
		return "Child Phone number is 9961728693";
	}
}
