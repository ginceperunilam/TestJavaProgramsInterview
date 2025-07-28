package com.JavaProjects.TestProjectsFiles;

public class TestObject2
{
	private int id;
	private String name;
	private Long rollNo;
	private String department;
	
	public TestObject2()
	{
	}

	//constructor	
	public TestObject2(int id, String name, Long rollNo, String department)
	{
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Long getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(Long rollNo)
	{
		this.rollNo = rollNo;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}

	// Overriding toString method for better output formatting
		@Override
		public String toString()
		{
			return "Student{id   =" + id + 
						 ", name =" + name + 
				         ", R_No =" + rollNo +
				         ", Dept =" + department +
				   "}";
		}
}
