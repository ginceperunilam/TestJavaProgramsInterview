package com.JavaProjects.TestProjects;

public class ForLoopTest 
{
	public void forLoopTests()
	{
		System.out.println("ForLoopTest forLoopTests..");
		for(int i = 0; i<= 5; i++)//combine the initialisation, checking and increment in one line
		{
			System.out.println("Value of i is :" +i);
		}
	}
	
	public void forLoopTests1(int value)
	{
		System.out.println("ForLoopTest forLoopTests1..");
		int i = 0;
		for(;i<= value;i++)//we can do like this, semicolons are mandatory
		{
			System.out.println("Value of i is :" +i);
		}
	}
	
	public void forLoopTests2(Long value)
	{
		System.out.println("ForLoopTest forLoopTests2..");
		Long i = 0l;
		for(;i< value;)//we can do like this, semicolons are mandatory
		{
			System.out.println("Value of i is :" +i);
			i++;
		}
	}

}
