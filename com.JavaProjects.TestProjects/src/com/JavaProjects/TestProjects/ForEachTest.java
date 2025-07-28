package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.List;

public class ForEachTest
{
	public void forEachLoop()
	{
		List<Long> list = (List<Long>) Arrays.asList(1l,9l,2l,8l,3l,7l,4l,5l);
		
		/**for each using lambda expression**/
		list.forEach(x -> System.out.println("the number is :"+x));
	}
}
