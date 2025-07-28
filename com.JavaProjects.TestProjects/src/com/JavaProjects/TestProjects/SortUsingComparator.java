package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.JavaProjects.TestProjectsFiles.TestObject2;

public class SortUsingComparator
{

	public List<TestObject2> getValuesintoList()
	{
		List<TestObject2> testObject2 = new ArrayList<>();
		testObject2.add(new TestObject2(1, "Gince", 105l, "Comp"));
		testObject2.add(new TestObject2(5, "Tom", 101l, "Medical"));
		testObject2.add(new TestObject2(2, "Jerry", 104l, "Comp"));
		testObject2.add(new TestObject2(4, "Jerica", 102l, "Comp"));
		testObject2.add(new TestObject2(3, "Chinnu", 103l, "Medical"));
		
		return testObject2;
	}
	
	public void sortUsingComparator()
	{
		List<TestObject2> valuesintoList = getValuesintoList();
		
		Collections.sort(valuesintoList, rollNoComprator);
		System.out.println("Sort by roll no");
		for(TestObject2 TestObject2 : valuesintoList)
		{
			System.out.println(TestObject2);
		}
		
		Collections.sort(valuesintoList, deptThenRollNoComprator);
		System.out.println("Sort by department then roll no");
		for(TestObject2 TestObject2 : valuesintoList)
		{
			System.out.println(TestObject2);
		}
		
		Collections.sort(valuesintoList, deptThenNameThenRollNoCompratorUsingJava8);
		System.out.println("Sort by department then name then roll no using java 8+");
		for(TestObject2 TestObject2 : valuesintoList)
		{
			System.out.println(TestObject2);
		}
	}
	
	//Implementing comparator and compare method; to sort by roll no
	Comparator<TestObject2> rollNoComprator = new Comparator<TestObject2>()
	{
		@Override
		public int compare(TestObject2 testObject2_1, TestObject2 testObject2_2)
		{
			if(testObject2_1.getRollNo() > testObject2_2.getRollNo())
				return 1;
			else
				return -1;
//			or
//			return testObject2_1.getRollNo().compareTo(testObject2_2.getRollNo());
		}
	};
	
	//Implementing comparator and compare method; to sort by department and rollno
	Comparator<TestObject2> deptThenRollNoComprator = new Comparator<TestObject2>()
	{
		@Override
		public int compare(TestObject2 testObject2_1, TestObject2 testObject2_2)
		{
			int deptCompare = testObject2_1.getDepartment().compareTo(testObject2_2.getDepartment());
			if(deptCompare != 0)
			{
				return deptCompare;
			}
			else
			{
				return testObject2_1.getRollNo().compareTo(testObject2_2.getRollNo());
			}
		}
	};
	
	
	//Implementing comparator and compare method; to sort by roll dept and name using java 8+
		Comparator<TestObject2> deptThenNameThenRollNoCompratorUsingJava8 =
				Comparator.comparing(TestObject2 :: getDepartment)
						  .thenComparing(TestObject2 :: getName)
						  .thenComparing(TestObject2 :: getRollNo);

		//Implementing comparator and compare method; to sort by id using lambda expression
		Comparator<TestObject2> idComprator = (testObject2_1, testObject2_2) 
										   -> testObject2_1.getId() > testObject2_2.getId() ? 1 : -1;
}
