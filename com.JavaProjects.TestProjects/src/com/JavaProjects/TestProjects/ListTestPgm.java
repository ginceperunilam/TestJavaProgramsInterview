package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.List;

public class ListTestPgm
{
	List<String> list = Arrays.asList("doGs", "Over", "gooD","min");
	public void test1()
	{
		System.out.println("-------test1");
		System.out.println(list.stream().reduce(new String(), (x1, x2) -> 
						   {if (x1.equals("dog")) return x1; return x2; }));
	}
	
	public void test2()
	{
		System.out.println("-------test2");
		list.stream().reduce((x1, x2) -> x1.length() == 3 ? x1 : x2).ifPresent(System.out::println);
	}
	
	public void test3()
	{
		System.out.println("-------test3 original is wrong");
//		System.out.println(list.stream().reduce(new Character(), (s1, s2) ->
//							s1 + s2.charAt(0), (c1, c2) -> c1 += c2));
		System.out.println(list.stream().reduce("", (s1, s2) -> s1 + s2.charAt(0), (s1, s2) -> s1 + s2));

	}
	
	public void test4()
	{
		System.out.println("-------test4");
		list.stream().reduce((x1, x2) -> x1.length() > x2.length() ? x1 : x2).ifPresent(System.out::println);
	}
	
	public void test5()
	{
		System.out.println("-------test5");
		System.out.println(list.stream().reduce(new String(), (s1, s2) -> s1 + s2.charAt(0), (c1, c2) -> c1 += c2));

	}
	public void test6()
	{
		System.out.println("-------test6");
		System.out.println(list.stream());
		list.stream().reduce((x1, x2) -> x1.length() == 3 ? x1 : x2).ifPresent(System.out::println);
		System.out.println(list.stream().reduce(new String(), (s1, s2) -> s1 + s2.charAt(1), (c1, c2) -> c1 += c2));
	}
}
