package com.JavaProjects.TestProjects;

public class MethodOverloadingTest 
{
	//same method having differnt number of arguments
	public int add(int a, int b)
	{
		System.out.println("add with 2 arguments:"+(a+b));
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		System.out.println("add with 3 arguments:"+(a+b+c));
		return a+b+c;
	}
	
	//same method name different type, same number of argument
	public long sub(int a, int b)
	{
		System.out.println("sub with 2 arguments with same type:"+(a-b));
		return a-b;
	}
	
	public long sub(int a, long b)
	{
		System.out.println("sub with 2 arguments with different type:"+(a-b));
		return a-b;
	}
	
	//same method with different return type will not support
//	public long sub(int a, int b)
//	{
//		return a-b;
//	}
//	
//	public int sub(int a, int b)
//	{
//		return a-b;
//	}
}
