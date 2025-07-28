package com.JavaProjects.TestProjects;

public class StringBufferTest 
{
	public void stringBufferCapacit()
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("String buffer initialisation sb capacity:" + sb.capacity());
		System.out.println("String buffer with Gince sb length:" + sb.length());
		
		StringBuffer sb1 = new StringBuffer("Gince");
		System.out.println("String buffer with Gince sb1 capacity:" + sb1.capacity());
		System.out.println("String buffer with Gince sb1 length:" + sb1.length());
	}
	
	public void stringBufferOperations()
	{
		StringBuffer sb = new StringBuffer("Gince");
		System.out.println("String buffer with Gince sb:" + sb);
		sb.append(" George");
		System.out.println("String buffer with append George sb:" + sb);
		String str = sb.toString();
		System.out.println("Cast string bufer to string str:" + str);
	}
}
