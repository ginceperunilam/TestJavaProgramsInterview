package com.JavaProjects.TestProjects;

public class LambdaExpressionTest
{
	public void implementFunctionalInterface()
	{
		functionalInterfaceTest.printValue();
		functionalInterfaceTest1.printValue();
		functionalInterfaceTest2.printValue();
	}
	
	//Implementing functional interface normally
	FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest()
	{
		@Override
		public void printValue()
		{
			System.out.println("Implement FunctionalInterfaceTest Normally..");
		}
	};
	
	//in case of single statement in while implementnig the functional interface
	FunctionalInterfaceTest functionalInterfaceTest1 = ()->System.out.println("Implement LambdaExpressionTest using lambda expression..");

	//Functional interface implementation with multiple statements
	FunctionalInterfaceTest functionalInterfaceTest2 = ()->
	{
		System.out.println("Implement LambdaExpressionTest using lambda expression..Statement 1");
		System.out.println("Implement LambdaExpressionTest using lambda expression..Statement 2");
	};

}
