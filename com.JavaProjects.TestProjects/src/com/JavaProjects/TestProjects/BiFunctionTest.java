package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest
{
	public void biFunctionTest()
	{
		//input list and string. output is an array list
		BiFunction<List<String>, String, ArrayList<String>> biFunction = (t, u)->
		{
			ArrayList<String> newBiList = new ArrayList<String>();//new list to return
			t.forEach(e->newBiList.add(e.toString()));//Add each element from t to the new list
			newBiList.add(u);
			return newBiList;
		};
		
		List biInputList = List.of("My","Name","Gince");
		String biInputString = "George";
		ArrayList biReturnList = biFunction.apply(biInputList, biInputString);
		System.out.println("Resultant list is:"+biReturnList);
	}
}
