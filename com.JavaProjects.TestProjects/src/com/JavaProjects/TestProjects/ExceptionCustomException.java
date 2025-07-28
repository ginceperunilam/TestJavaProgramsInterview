package com.JavaProjects.TestProjects;

public class ExceptionCustomException
{
	public void exceptionTests(Long factor) 
	{
		try
		{
			if(factor == 0l)
				throw new ExceptionMyException("Throwing my own Exception ha ha ha..");
			Long age = 20l/factor;
			System.out.println("Printing age: "+age);
			
		}
		catch(ExceptionMyException e)
		{
			System.out.println("Found customised exception e: "+e);
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
