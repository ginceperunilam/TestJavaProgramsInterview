package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//The comparator interface must use a type parameter
public class ComparatorInterfaceImplementation implements Comparator<String>
{

	public void comparatorInterfaceImplementationTest()
	{
		ArrayList<String> unsortednums = new ArrayList(Arrays.asList(
										 "Gince","Chinnu","Hi","Bad","Good","Economical"));
		
		Collections.sort(unsortednums);
		System.out.println("Natural sorting its ascending by default:"+unsortednums);
		
		Collections.sort(unsortednums, new ComparatorInterfaceImplementation());
		System.out.println("Sort by string length ascending:"+unsortednums);
	}
	
	@Override
	public int compare(String str1, String str2)
	{
		if(str1.length() > str2.length())
			return 1;
		else
			return -1;
	}

	
}
