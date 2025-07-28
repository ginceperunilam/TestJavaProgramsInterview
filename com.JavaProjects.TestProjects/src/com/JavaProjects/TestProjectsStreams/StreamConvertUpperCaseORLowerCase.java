package com.JavaProjects.TestProjectsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class StreamConvertUpperCaseORLowerCase
{
	public StreamConvertUpperCaseORLowerCase()
	{
		List<String> myString = Arrays.asList("Gince","Shahid","thomas","computeR");
		List<String> tUpperCase = myString.stream()
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		System.out.println("tUpperCase:"+tUpperCase);
		
		System.out.print("print immidiatly toLowerCase:");
		myString.stream()
				.map(String :: toLowerCase)
				.forEach(System.out :: println);
	}

}
