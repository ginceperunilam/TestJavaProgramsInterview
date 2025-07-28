package com.JavaProjects.TestProjectsFiles;

import java.util.Objects;

public class HashMapTestObject
{
	private String name;
	private int id;

	// Constructor
	public HashMapTestObject(String name, int id) 
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
		return "HashMapTestObject {id=" + id + ", name='" + name + "'}";
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapTestObject other = (HashMapTestObject) obj;
		return id == other.id;
	}
	
	
}
