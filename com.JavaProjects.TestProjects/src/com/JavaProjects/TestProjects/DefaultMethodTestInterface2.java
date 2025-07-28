package com.JavaProjects.TestProjects;

public interface DefaultMethodTestInterface2
{
	default void showLoggerInsmall(String message)//not implement/override to any other class class
	{
		System.out.println(message.toLowerCase().concat(" From Interface : DefaultMethodTestInterface2.."));
	}
	default void showLoggerWithClassName(String message)
	{
		System.out.println(message.concat(" From Interface : DefaultMethodTestInterface2"));
	}
}
