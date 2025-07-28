package com.JavaProjects.TestProjects;

public class StaticVariableTest 
{
	//Static key word make something as class member not an object member
	static String category = "";
	public String modelName = "";
	public String modelNo;
	public Double price;
	
	//non static methods can use static variables
	public void getStaticVariableValues()
	{
		System.out.println("Stsic variable category:"+category);
	}
	
	public void getNonStaticVariableValues()
	{
		System.out.println("Non-Stsic variables-> modelName:"+modelName+" ,modelNo:"+modelNo+" ,price:"+price);
	}
	
}
