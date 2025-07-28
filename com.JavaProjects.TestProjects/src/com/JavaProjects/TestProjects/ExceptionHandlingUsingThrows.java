package com.JavaProjects.TestProjects;

public class ExceptionHandlingUsingThrows
{
	public void exceptionHandlingCNFEx(String className) throws ClassNotFoundException
	{
		System.out.println("inside ExceptionHandlingUsingThrows1");
		ExceptionHandlingUsingThrows1 exceptionHandlingUsingThrows1 = new ExceptionHandlingUsingThrows1();
		exceptionHandlingUsingThrows1.exceptionHandlingCNFE(className);
	}
}
