package com.JavaProjects.TestStreamPrograms;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountCharactersInString
{
	public void countCharacters(String str)
	{
		System.out.println("countCharacters Starts...");
		str.chars();//convert string into stream
		System.out.println("str.chars();"+str.chars());
		
		Map<Character, Long> map = str.chars()
					.mapToObj(eachCharacter -> (char)eachCharacter)
					.collect(Collectors.groupingBy(eachCharacter -> eachCharacter, Collectors.counting()));
		
		for(Map.Entry<Character, Long> entry : map.entrySet())
		{
			System.out.println("Character:"+entry.getKey()+" ,Count:"+entry.getValue());
		}
		System.out.println("countCharacters Ends...");
		
	}
	
	//this is case sensitive, the capital letter words sort first and then small letters
	public void countCharactersInSorted(String str)
	{
		System.out.println("countCharactersInSorted Starts...");
		Map<Character, Long> map = str.chars()
									  .mapToObj(charact -> (char)charact)
//									  .sorted()//will not get sorted order
									  .collect(Collectors.groupingBy
											  (charct -> charct, TreeMap :: new, Collectors.counting()));
		for(Character key: map.keySet())
		{
			System.out.println("Character:"+key+" ,Count:"+map.get(key));
		}
		System.out.println("countCharactersInSorted End...");
	}
}
