package com.JavaProjects.TestProjects;

public class ThisKeywordTest
{
	private Long age;//local variable
	private String name;
	
	public Long getAge()
	{
		return age;
	}
	//set value to the local variable aget from instance variable age, this is normal setter method
	public void setAge(Long age)
	{
		this.age = age;
		System.out.println("Inside setAge local variable value age:"+age);
	}
	
	//set value to the local variable aget from instance variable value
	public void setAgeWithoutThisDiffNameOfInstanceVariable(Long value)
	{
		age = value;
		System.out.println("Inside setAgeWithoutThisDiffNameOfInstanceVariable local variable value age:"+age);
	}
	
	//passing value and object
	public void setAgeByPassingObj(Long age, ThisKeywordTest obj)
	{
		obj.age = age;
		System.out.println("Inside setAgeByPassingObj local variable value age:"+age);
	}
	
	//passing value and object
	public void setAgeByCreaingObj(Long age)
	{
		ThisKeywordTest obj = new ThisKeywordTest();
		obj.age = age;//the value set to a new obj but we are using different obj in the main method calls class
		System.out.println("Inside setAgeByCreaingObj local variable value obj.age:" + obj.age);
	}
	
	//setting value to age without this keyword
	public void setAgeWithoutThis(Long age)
	{
		age = age;//more preference is to local variable age inside the method
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
		System.out.println("Inside setName local variable value name:"+age);
	}
	
}
