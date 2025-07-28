package com.JavaProjects.TestProjects;

public class ExceptionHandlingUsingThrow
{
	public void exceptionTests(Long factor, int index, String name) 
	{
		try
		{
			if(factor == 0l)
				throw new ArithmeticException("Division by zero not allowed");
			Long age = 20l/factor;
			System.out.println("Printing age: "+age);
			
			if(index<6)
				throw new ArrayIndexOutOfBoundsException();
			int arr[] = new int[index];
			System.out.println("arr value in index 0:"+arr[0]);
			System.out.println("arr value in index 10:"+arr[5]);
			
			if(name == null || name== "")
				throw new NullPointerException("Entered name value is null");
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
			System.out.println("IUnknown exception e: "+e);
		}
		System.out.println(".........ending.........");
	}
}
