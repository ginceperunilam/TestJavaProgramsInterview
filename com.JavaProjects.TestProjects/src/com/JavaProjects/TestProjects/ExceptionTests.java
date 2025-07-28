package com.JavaProjects.TestProjects;

public class ExceptionTests
{

	public void exceptionTests(Long factor, int index, String name) 
	{
		try
		{
			Long age = 20l/factor;
			System.out.println("Printing age: "+age);
			
			int arr[] = new int[index];
			System.out.println("arr value in index 0:"+arr[0]);
			System.out.println("arr value in index 10:"+arr[5]);
			
			String str = name;
			System.out.println("Printing string length:"+str.length());
		}
		catch(ArithmeticException obj)//we can put any name instead of obj
		{
			System.out.println("Division Error found obj: "+obj);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is not reachable e: "+e);
		}
		catch(Exception e)
		{
			System.out.println("Unknown exception e: "+e);
		}
		System.out.println("end.....");
	}
}
