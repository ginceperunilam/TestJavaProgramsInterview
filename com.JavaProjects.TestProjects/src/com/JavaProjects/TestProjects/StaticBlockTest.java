package com.JavaProjects.TestProjects;

public class StaticBlockTest 
{
	static String category = "";
	public String modelName = "";
	public String modelNo;
	public Double price;

	//constructor
	public StaticBlockTest() 
	{
		category ="My Ph";
		System.out.println("Constructor StaticBlockTest called.......");
	}
	
	//static block can only access static variables
	static 
	{
		category ="My mobile phone";
		System.out.println("Static Method called.....@@");
	}
	
	public void setNonStaticVariableValues(String modelName, String modelNo, Double price) 
	{
		this.modelName = modelName;
		this.modelNo = modelNo;
		this.price = price;
	}

	public void getNonStaticVariableValues() {
		System.out
				.println("Non-Stsic variables-> modelName:" + modelName + " ,modelNo:" + modelNo + " ,price:" + price);
		System.out.println("Stsic variable inside non-static method category:" + category);
	}

	// static methods can use only static variable
	public static void getStaticVariableValues() 
	{
		System.out.println("Stsic variable inside static method category:" + category);
	}
	
}
