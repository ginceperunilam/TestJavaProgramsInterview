package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.JavaProjects.TestProjectsFiles.TestObject3;

public class SortUsingComparable
{
	public List<TestObject3> getValuesintoList()
	{
		List<TestObject3> testObject3 = new ArrayList<>();
		testObject3.add(new TestObject3(1, "Gince", 105l, "Comp"));
		testObject3.add(new TestObject3(5, "Tom", 101l, "Medical"));
		testObject3.add(new TestObject3(2, "Feivel", 104l, "Comp"));
		testObject3.add(new TestObject3(4, "Freyan", 102l, "Comp"));
		testObject3.add(new TestObject3(3, "Chinnu", 103l, "Medical"));
		
		return testObject3;
	}
	
	public void sortUsingComparable()
	{
		List<TestObject3> valuesintoList = getValuesintoList();
		Collections.sort(valuesintoList);
		
		System.out.println("Sort by id");
		for(TestObject3 testObject3 : valuesintoList)
		{
			System.out.println(testObject3);
		}
	}
}
