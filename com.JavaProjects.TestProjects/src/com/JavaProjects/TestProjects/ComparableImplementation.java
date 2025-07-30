package com.JavaProjects.TestProjects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.JavaProjects.TestProjectsFiles.Student;

public class ComparableImplementation 
{
	
	private ArrayList<Student> getStudentdetails() throws Exception
	{
		ArrayList<Student> studs = new ArrayList<>();
		try 
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

			studs.add(new Student(1l, 112l, "Gince", "George", sdf.parse("12-01-1992")));
			studs.add(new Student(1l, 118l, "Chinnu", "Gince", sdf.parse("12-01-1994")));
			studs.add(new Student(1l, 121l, "Feivel", "Gince", sdf.parse("12-01-2010")));
			studs.add(new Student(1l, 115l, "Freyan", "Chinnu", sdf.parse("12-01-2002")));
			studs.add(new Student(1l, 111l, "Akshima", "Sabu", sdf.parse("12-01-2008")));
			studs.add(new Student(1l, 119l, "Linta", "Sunitha", sdf.parse("12-01-2000")));
		}
		catch(Exception e)
		{
			throw e;
		}
		return studs;
	}
	
	public void comparableImplementation() throws Exception
	{
		try
		{
			ArrayList<Student> studentdetails = getStudentdetails();

			//This we can do without implement the comparable interface
			studentdetails.sort(Comparator.comparing(Student::getRollNo));
			System.out.println("Student sorted list using Comparator by roll no:"+studentdetails);
		} 
		catch (Exception e)
		{
			System.out.println("ComparableImplementation Exception :"+e);
		}
	}
	
	public void comparableImplementationUsingSort() throws Exception
	{
		try
		{
			ArrayList<Student> studentdetails = getStudentdetails();
			//We cannot call the sort method if the student slacc not implemented the comparable interface
//			Collections.sort(studentdetails);
			
			//We implemented the comparable interface in student objct so we can call sort. 
			//We write code to sort it by name, we can change it if needed
			Collections.sort(studentdetails);
			System.out.println("Student sorted using Comparable:"+studentdetails);
		} 
		catch (Exception e)
		{
			System.out.println("Exception :"+e);
		}
	}

}
