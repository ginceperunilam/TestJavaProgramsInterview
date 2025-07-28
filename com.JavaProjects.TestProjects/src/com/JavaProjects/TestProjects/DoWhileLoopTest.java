package com.JavaProjects.TestProjects;

public class DoWhileLoopTest 
{
	public void doWhileLoopTest(int value)
	{
		System.out.println("DoWhileLoopTest");
		int i =0;//declaration
		do
		{
			//Execute the statements once even if the condition is true/false
			System.out.println("Value of i is :" +i);
			i++;//increment
		}
		while (i <= value);//Checking
	}
}
