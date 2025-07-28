package com.JavaProjects.TestProjects;

public class VarKeyWord
{
//	var total = 23;//can only use with local variables
	public void varKeyword()
	{
		var age = 10;//interfere as int at compile time
		var name = "Gince";//interfere as string at compile time
		var marks = 46.55;//interfere as double at compile time
//		var samples;//this will be show error, must initialise at time of declaration
		
		printAge(age);
		System.out.println("name :"+ name);
		System.out.println("marks :"+marks);
	}

	private void printAge(int age)//cannot use var age inside method parameter
	{
		System.out.println("age :"+age);		
	}
}
