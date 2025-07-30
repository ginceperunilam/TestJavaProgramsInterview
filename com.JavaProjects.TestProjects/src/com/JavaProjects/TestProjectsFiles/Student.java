package com.JavaProjects.TestProjectsFiles;

import java.util.Date;

public class Student implements Comparable<Student>
{
	private Long   id;
	private Long   rollNo;
	private String name;
	private String fatherName;
	private Date   dob;
	
	public Student()
	{
	}
	
	public Student(Long id, Long rollNo, String name, String fatherName, Date dob)
	{
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
	}
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(Long rollNo)
	{
		this.rollNo = rollNo;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getFatherName()
	{
		return fatherName;
	}
	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	@Override
	public int compareTo(Student that)
	{
		return this.getName().compareToIgnoreCase(that.getName());
	}
	
	@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
