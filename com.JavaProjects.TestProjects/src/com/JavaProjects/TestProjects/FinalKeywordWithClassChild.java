package com.JavaProjects.TestProjects;

//we cannot extend a final class, we are stopping the inheritance
public class FinalKeywordWithClassChild //extends FinalKeywordWithClassParent
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
	
	public void printRadius(Double r)
	{
		System.out.println("FinalKeywordWithVariable radius:"+radius);
	}
}
