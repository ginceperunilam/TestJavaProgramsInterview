package com.JavaProjects.TestProjects;

public class WrapperClassesTest
{
	public void wrapperClassessBoxingTests()
	{
		int num = 10;
		Integer num1 = new Integer(num);//boxing, convert primitive type to integer(object) type
		Integer num2 = num;//autoboxing, here the conversion happens automatically
		System.out.println("boxing result num1:"+num1);
		System.out.println("autoboxing result num2:"+num2);
	}
	
	public void wrapperClassessUnBoxingTests()
	{
		Integer num = 20;
		int num1 = num.intValue();//unboxing, convert integer(object) type to primitive type
		int num2 = num;//autounboxing, here the conversion/fetching frim object type to primitive type happens automatically
		System.out.println("unboxing result num1:"+num1);
		System.out.println("autounboxing result num2:"+num2);
	}
}
