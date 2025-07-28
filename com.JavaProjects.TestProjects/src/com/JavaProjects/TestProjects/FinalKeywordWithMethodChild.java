package com.JavaProjects.TestProjects;

public class FinalKeywordWithMethodChild extends FinalKeywordWithMethodParent
{
	@Override
	public void calcRadius(Double r)
	{
		radius = (pi*r*r)/100;
		System.out.println("FinalKeywordWithMethodChild radius:"+radius);
//		pi = 3.14d;//we cannot change the value of final variable. used to make a variable as constant
		System.out.println("FinalKeywordWithMethodChild final variable pi:"+pi);
	}
	
	//we cannot override a final method
//	@Override
//	public final void printRadius(Double r)
//	{
//		System.out.println("FinalKeywordWithVariable radius:"+radius);
//	}
}
