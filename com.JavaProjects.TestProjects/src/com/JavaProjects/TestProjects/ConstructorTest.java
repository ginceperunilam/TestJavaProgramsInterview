package com.JavaProjects.TestProjects;

public class ConstructorTest
{
	private Long age;
	private String name;
	private Boolean isActive;
	
	/***default constructor**/
	public ConstructorTest()
	{
		this(30l);//we can use this() to call another constructor of the same class
	}
	
	/**constructor have one parameter**/
	public ConstructorTest(Long age)
	{
		/**we cannot use constructor name to call another constructor, use this()**/
//		ConstructorTest(age, true);
		this(age, true);
	}
	
	/**constructor have 2 parameters**/
	public ConstructorTest(Long age, Boolean isActive)
	{
		this.age = age;
		this.isActive = isActive;
		this.name = "Gince";
	}

	public Long getAge()
	{
		return age;
	}

	public void setAge(Long age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Boolean getIsActive()
	{
		return isActive;
	}

	public void setIsActive(Boolean isActive)
	{
		this.isActive = isActive;
	}
	
	public void showAllValues()
	{
		System.out.println("name:"+this.name+" ,age:"+this.age+" ,isActive:"+this.isActive);
	}
}
