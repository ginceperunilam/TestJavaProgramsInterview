package com.JavaProjects.TestProjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTests 
{
	public void comparatorTests()
	{
		List<Long> unSortedNums = Arrays.asList(14l,23l,65l,60l,27l,99l,51l,88l,46l);
		Collections.sort(unSortedNums);
		System.out.println("Natural sorting its ascending by default:"+unSortedNums);
		
		
		//Implement custom sort by the second digit
		Comparator<Long> cmp = new Comparator<Long>()
		{
			@Override
			public int compare(Long value1, Long value2)
			{
				if(value1 %10 < value2 %10)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(unSortedNums,cmp);
		System.out.println("After sort by second digit descending order:"+unSortedNums);
		
	}
}
