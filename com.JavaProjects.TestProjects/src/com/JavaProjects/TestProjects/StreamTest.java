package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest
{
	List<Long> list = (List<Long>)Arrays.asList(4l,2l,3l,9l,1l,3l,8l,2l);
	public void streamOperations()
	{
		// sorte, avoid duplication and print
		list.stream()
				.distinct()//get distinct values (intermediary)
				.sorted(Comparator.reverseOrder())//get sorted values in descending order (intermediary)
				.forEach(x -> System.out.println(x));//output (terminal)
		
		Stream<Long> newStream = list.stream();
		System.out.println("newStream:"+newStream);// this will print the stream o/p 
//		System.out.println("newStream:"+newStream);// this will not print the stream o/p as it is consumed in the above statement
		
		Stream<Long> newStream1 = newStream.sorted();//after apply intermediary operation
		System.out.println("newStream after1:"+newStream);// this will print exception as the stream newStream is consumed
		
	}
}
