package com.JavaProjects.TestProjects;

public class WhileLoopTest 
{
	public void whileLoopTest(int value)
	{
		System.out.println("WhileLoopTest");
		int i =0;//declaration
		while (i < value)//Checking
		{
			//Execute the statements until the condition is true
			System.out.println("Value of i is :" +i);
			i++;//increment
		}
	}
}
