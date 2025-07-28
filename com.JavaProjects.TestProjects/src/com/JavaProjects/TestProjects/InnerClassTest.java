package com.JavaProjects.TestProjects;

public class InnerClassTest
{
	public void getMainInnerClass()
	{
		System.out.println("Inside first class");
	}
	
	public class InnerClass
	{
		public void getInnerClassDetails()
		{
			System.out.println("Inside inner class");
		}
	}
	
	public static class StaticInnerClass
	{
		public void getStaticInnerClassDetails()
		{
			System.out.println("Inside static inner class");
		}
	}
}
