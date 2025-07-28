package com.JavaProjects.TestProjectsFiles;

public class TestObject
{
	private String name;
	private int id;

	// Constructor
	public TestObject(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}

	// Getter methods
	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	// Overriding toString method for better output formatting
	@Override
	public String toString()
	{
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}
