package com.JavaProjects.TestProjects;

public class ExceptionHandlingUsingThrows1 
{
	public void exceptionHandlingCNFE(String className) throws ClassNotFoundException
	{
		System.out.println("inside ExceptionHandlingUsingThrows2");
		//not handling the exception here, throw using throws
		Class.forName(className);
	}
}
