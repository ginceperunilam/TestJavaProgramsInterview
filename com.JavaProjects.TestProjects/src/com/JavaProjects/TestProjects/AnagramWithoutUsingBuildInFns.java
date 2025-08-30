package com.JavaProjects.TestProjects;

public class AnagramWithoutUsingBuildInFns
{
	char[] str2s;
	private Long lenStr1=0l;
	private Long lenStr2=0l;
	
	public AnagramWithoutUsingBuildInFns(String str1, String str2) 
	{
		str2s = str2.toCharArray();
		checkForAnagram(str1, str2);
	}
	
	private void checkForAnagram(String str1, String str2)
	{
		Boolean isAnagram = true;
		for(char charact : str1.toCharArray())
		{
			lenStr1++;
			if(!checkForTheCharacter(charact))
			{
				isAnagram = false;
				break;
			}
		}
		if(!lenStr1.equals(lenStr2) || !isAnagram)
		{
			System.out.println("Not Anagram...");
		}
		else
		{
			System.out.println("...Anagram...");
		}
	}

	private Boolean checkForTheCharacter(char charact)
	{
		int count =0;
		for(char charStr2 : str2s)
		{
			if(charact == charStr2)
			{
				lenStr2++;
				str2s[count] = ' ';
				return true;
			}
			count++;
		}
		return false;
	}
}
