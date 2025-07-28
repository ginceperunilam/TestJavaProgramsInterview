package com.JavaProjects.TestProjects;

public class FinalKeywordWithMethodParent
{
	Double radius =0d;
	final Double pi = 3.14122d;
	
	public void calcRadius(Double r)
	{
		radius = pi*r*r;
		System.out.println("FinalKeywordWithMethodParent radius:"+radius);
//		pi = 3.14d;//we cannot change the value of final variable. used to make a variable as constant
		System.out.println("FinalKeywordWithMethodParent final variable pi:"+pi);
	}
	
	public final void printRadius()
	{
		System.out.println("FinalKeywordWithMethodParent radius:"+radius);
	}
}
