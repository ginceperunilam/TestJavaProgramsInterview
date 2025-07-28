package com.JavaProjects.TestProjects;

public interface DefaultMethodTestInterface1
{
	void showLogMessage(String message);
	default void showLoggerInCaps(String message){}//override to the class where the interface is implemented
	default void showLoggerWithClassName(String message)// must override to child as the same method present in both interfaces used for testing
	{
		System.out.println(message.concat(" From Interface : DefaultMethodTestInterface1"));
	}
}
