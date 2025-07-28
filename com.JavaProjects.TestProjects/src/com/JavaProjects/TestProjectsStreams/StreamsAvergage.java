package com.JavaProjects.TestProjectsStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Write a Java program to calculate the average of a list of integers using streams.
public class StreamsAvergage
{
	public void streamsAvergageSample1()
	{
		List<Integer> nums = Arrays.asList(2,5,10,20);
		Double average = nums.stream()
							 .mapToDouble(Integer :: doubleValue)//convert integer to double value
							 .average()// Calculates average
							 .orElse(0);//return default value if list is empty
		System.out.println("average is:"+average);
		
		//optional double is used to handle the o/p if the average is empty
		OptionalDouble avg = nums.stream()
				 .mapToDouble(Integer :: doubleValue)
				 .average();
		System.out.println("average using OptionalDouble is:"+avg);
		
		System.out.print("printing average immidiatly:");
		List<Double> doubleNums = Arrays.asList(2.5d,10d,20.5d,30d);
		//print the avg immediatly
		doubleNums.stream()
			.mapToDouble(Double::doubleValue)
			.average()
			.ifPresent(System.out::println);//print immidiatly
	}
	
	public void streamsAvergageSample2()
	{
		List<Long> longNums = Arrays.asList(3l,4l,9l,10l);
		
		Double average = longNums.stream()
				.mapToLong(Long :: longValue)//convert to long value
				.average()
				.orElse(0);
		System.out.print("printing average for long list:"+average);
	}
}
