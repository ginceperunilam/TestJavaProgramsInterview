package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterInJavaTest
{
	List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	public void printUsingFilter()
	{
		//filter and print each even values
		lists.stream().filter(x -> x%2 == 0).forEach(x -> System.out.print(x + " "));
		//filter and print each odd values
		System.out.println();
		lists.stream().filter(x -> x%2 != 0).forEach(x -> System.out.print(x + " "));
	}
	
	public void printUsingFilterAndPredicate()
	{
		System.out.println();
		System.out.println("printUsingFilterAndPredicate-------");
		Predicate<Integer> pre = new Predicate<Integer>()
		{
			@Override
			public boolean test(Integer t)
			{
				return t%2 == 0;
			}
		};
		
		//filter and print each even values
		lists.stream().filter(pre).forEach(x -> System.out.print(x + " "));
	}
	
	public void printUsingFilterAndPredicateLamda()
	{
		System.out.println();
		System.out.println("printUsingFilterAndPredicateLamda-------");
		//Predicate is a functional interface so that we can use lamda expression
		Predicate<Integer> p =  t -> t%2 != 0;
		
		//filter and Collect results into a List
		List<Integer> collect = lists.stream().filter(p).collect(Collectors.toList());
		System.out.println(collect);
	}
}
