package com.JavaProjects.TestStreamPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberUsingStream
{
	public void evenNumbers(List<Long> numbers)
	{
		List<Long> evenNos = numbers.stream().filter(no -> no%2 == 0l).collect(Collectors.toList());
		System.out.println("1st. Even Nos:"+evenNos);
		
		System.out.println("2nd. Even Nos:");
		numbers.stream().filter(no -> no%2 == 0).forEach(System.out::println);
	}
}
