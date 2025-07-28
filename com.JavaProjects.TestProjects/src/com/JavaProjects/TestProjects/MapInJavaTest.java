package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.List;

public class MapInJavaTest
{
	List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public void printUsingMap()
	{
		// map used to transform eaach element in a stream. Here multiply each value with -1
		lists.stream().map(x -> x*-1).forEach(x -> System.out.print(x + ", "));;
	}
	
	public void printUsingMapAndFilter()
	{
		System.out.println();
		// multiply -1 only to the even numbers
		lists.stream().filter(x -> x%2 == 0)
		.map(x -> x*-1).forEach(x -> System.out.print(x + ", "));;
	}
}
