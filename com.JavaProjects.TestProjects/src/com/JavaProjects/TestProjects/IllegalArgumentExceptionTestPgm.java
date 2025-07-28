package com.JavaProjects.TestProjects;

import java.util.stream.Stream;

public class IllegalArgumentExceptionTestPgm
{
	public void m1() 
	{
        throw new IllegalArgumentException();
    }
	
	public void callToMethod()
	{
		Stream<IllegalArgumentExceptionTestPgm> s = Stream.of(new IllegalArgumentExceptionTestPgm(), new IllegalArgumentExceptionTestPgm());
		s.forEach(x -> {
		    try
		    {
		        x.m1();
		    } 
		    catch (IllegalArgumentException e) 
		    {
		        System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		    }
		});
    }
}
