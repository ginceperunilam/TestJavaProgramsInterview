package com.JavaProjects.TestProjects;

public class DefaultMethodTestInterface implements DefaultMethodTestInterface1, DefaultMethodTestInterface2
{

	DefaultMethodTestInterface()
	{
		showLogMessage("In Class DefaultMethodTestInterface");
	}
	
	//must override ; normal method override from DefaultMethodTestInterface1
	@Override
	public void showLogMessage(String message)
	{
		System.out.println("Calling method to print Cap: ".concat(message));
		showLoggerInCaps(message);
		System.out.println("Calling method to print small: ".concat(message));
		showLoggerInsmall(message);
		showLoggerWithClassName(message);
	}
	
	//default method override from DefaultMethodTestInterface1
	@Override
	public void showLoggerInCaps(String message)
	{
		System.out.println(message.toUpperCase().concat(" :From class to upper: DefaultMethodTestInterface"));
	}

	//must override because the same method apear in bot the interfaces
	@Override
	public void showLoggerWithClassName(String message)
	{
		System.out.println(message.concat(" From calss : DefaultMethodTestInterface**"));
	}
}
