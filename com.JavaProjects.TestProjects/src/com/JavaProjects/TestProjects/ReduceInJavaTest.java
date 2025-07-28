package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceInJavaTest
{
	List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> lists1 = Arrays.asList(1,2,3);
	
	public void printUsingReduce()
	{
		//reduce the elements in a stream to a single value
		Optional<Integer> reduce = lists.stream().reduce((x1,x2) -> (x1 + x2));
		System.out.println("lists:"+reduce);
		
		//using accumulator/initial value
		System.out.println("lists1: "+lists1.stream().reduce(10, (x1,x2) -> (x1 + x2)));
	}
}
