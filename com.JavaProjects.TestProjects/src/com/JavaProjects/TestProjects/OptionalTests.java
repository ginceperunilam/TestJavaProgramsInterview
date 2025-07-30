package com.JavaProjects.TestProjects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.JavaProjects.TestProjectsFiles.Student;

public class OptionalTests
{
	private ArrayList<Student> getStudentdetails()
	{
		ArrayList<Student> studs = new ArrayList<>();
		try 
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

			studs.add(new Student(1l, 112l, "Gince", "George", sdf.parse("12-01-1992")));
			studs.add(new Student(1l, 118l, "Chinnu", "Gince", sdf.parse("12-01-1994")));
			studs.add(new Student(1l, 121l, "Feivel", null, sdf.parse("12-01-2010")));
			studs.add(new Student(1l, 115l, "Freyan", "Chinnu", null));
			studs.add(new Student(1l, null, "Akshima", null, sdf.parse("12-01-2008")));
			studs.add(new Student(1l, 119l, "Linta", "Sunitha", null));
		}
		catch(Exception e)
		{
			System.out.println("OptionalTests Exception:"+e);
		}
		return studs;
	}
	
	public void getStudentsByRollNo(String namePart)
	{
		ArrayList<Student> studentdetails = getStudentdetails();
		/**got null pointer exception as we have records containing father name as as null values**/
//		List<Student> list = studentdetails.stream().filter(stud -> stud.getFatherName().contains(namePart))
//						       .collect(Collectors.toList());
//		System.out.println("Names Contain "+studentdetails+" :"+list);
		/**end**/
		//use optional to avoid null pointer exceptions
		System.out.println("----way 1");
		List<Student> list = studentdetails.stream().filter(stud -> Optional.ofNullable(stud.getFatherName())
								.filter(fatherName-> fatherName.contains(namePart))
								.isPresent()).collect(Collectors.toList());
		System.out.println("Father Names Contain "+namePart+" :"+list);
		
		System.out.println("----way 2");
		studentdetails.stream().filter(stud -> Optional.ofNullable(stud.getFatherName())
								.map(name -> name.contains(namePart))
								.orElse(false))
								.collect(Collectors.toList());
		System.out.println("Father Names Contain "+namePart+" :"+list);
	}
}
