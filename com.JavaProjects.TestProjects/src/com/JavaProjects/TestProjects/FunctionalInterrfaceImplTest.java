package com.JavaProjects.TestProjects;

public class FunctionalInterrfaceImplTest implements FunctionalInterfaceTest
{

	/***normal implementation of the method**/
	@Override
	public void printValue()
	{
		System.out.println("Printed in functional interface implementation");
	}
}
