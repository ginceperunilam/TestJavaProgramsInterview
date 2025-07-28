package com.JavaProjects.TestProjects;

public class ArrayTests 
{
	public void arraySample()
	{
		int numArrays[] = {10,11,12,13,11};
		
		for(int i=0 ; i < numArrays.length ; i++)
		{
			System.out.println("Value at index "+i + " :"+numArrays[i]);
		}
		
//		List<String> names = Arrays.asList("John", "Jane", "Tom");
//		names.forEach(System.out::println);//using Method References. 
											//ie shortand of lambda expression to cal methods directly
	}
	
	public Integer[] getArraySample()
	{
		Integer numArrays[] = {10,11,12,13,11};
		
		return numArrays;
	}
}
