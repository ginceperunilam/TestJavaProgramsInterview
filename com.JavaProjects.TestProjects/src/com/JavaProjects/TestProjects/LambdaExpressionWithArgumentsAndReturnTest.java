package com.JavaProjects.TestProjects;

public class LambdaExpressionWithArgumentsAndReturnTest
{
	public void implementFunctionalInterface(int i, int j)
	{
		double calculateValue = functionalInterfaceTest.calculateValue(i, j);
		System.out.println("Adding values Normally..:"+calculateValue);
		calculateValue = functionalInterfaceTest1.calculateValue(i, j);
		System.out.println("Multiply using lambda expression..:"+calculateValue);
		calculateValue = functionalInterfaceTest2.calculateValue(i, j);
		System.out.println("Subtrct values labmda expression..:"+calculateValue);
	}
	
	//Implementing functional interface normally
	FunctionalInterfaceWithArgumentsAndReturnTest functionalInterfaceTest = new FunctionalInterfaceWithArgumentsAndReturnTest()
	{
		@Override
		public double calculateValue(long i, long j)
		{
			return i+j;
		}
	};
	
	//in case of single statement in while implementnig the functional interface
	FunctionalInterfaceWithArgumentsAndReturnTest functionalInterfaceTest1 = (i,j)->i*j;

	//Functional interface implementation with multiple statements
	FunctionalInterfaceWithArgumentsAndReturnTest functionalInterfaceTest2 = (i,j)->
	{
		double result = i-j;
		return result;
	};

}
