package com.JavaProjects.TestProjects;

import com.JavaProjects.TestProjectsFiles.TestObject2;

public class StaticMethodTest 
{
	// Static key word make something as class member not an object member
	static String category = "";
	public String modelName = "";
	public String modelNo;
	public Double price;

	//constructor
	public StaticMethodTest() 
	{
		category = "Mobile Phones..";
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
	
	// Non static variable in static method by passing an object
		public static void getNonStaticVariableValues(TestObject2 obj) 
		{
			System.out.println("Check use of non static variable in static method:" + obj.getDepartment());
			obj.setDepartment("New");
			Long rollNo = obj.getRollNo();
			Double calc = rollNo*-10d;
			System.out.println("Check use of non static variable in static method after:" + obj.getDepartment());
			System.out.println("Check use of non static variable in static method calc:" + calc);
		}

}
