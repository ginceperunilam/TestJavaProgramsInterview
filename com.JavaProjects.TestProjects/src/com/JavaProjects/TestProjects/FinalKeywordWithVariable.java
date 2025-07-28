package com.JavaProjects.TestProjects;

public class FinalKeywordWithVariable
{
	Double radius =0d;
	final Double pi = 3.14122d;
	
	public void calcRadius(Double r)
	{
		radius = pi*r*r;
		System.out.println("FinalKeywordWithVariable radius:"+radius);
//		pi = 3.14d;//we cannot change the value of final variable. used to make a variable as constant
		System.out.println("FinalKeywordWithVariable final variable pi:"+pi);
	}
}
