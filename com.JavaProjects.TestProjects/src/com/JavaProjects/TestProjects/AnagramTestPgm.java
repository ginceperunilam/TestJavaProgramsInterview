package com.JavaProjects.TestProjects;

import java.util.Arrays;

public class AnagramTestPgm
{
	private String string1 = "";
	private String string2 ="";
	
	public void getInputStringManually()
	{
//		Scanner input = new Scanner(System.in);
//		System.out.println("String 1:");
//		setString1(input.nextLine());
//		System.out.println("String 2:");
//		setString2(input.nextLine());
		
		setString1("Listen");
		setString1("Silent");
	}

	public String getString1()
	{
		return string1;
	}

	public void setString1(String string1)
	{
		this.string1 = string1;
	}

	public String getString2()
	{
		return string2;
	}

	public void setString2(String string2)
	{
		this.string2 = string2;
	}
	
	public Boolean checkAnagram()
	{
		Boolean isAnagram = false;
		
		if(string1.length() != string2.length())
		{
			isAnagram = false;
		}
		else
		{
			char[] string1s = string1.toCharArray();
			char[] string2s = string2.toCharArray();
			
			Arrays.sort(string1s);
			Arrays.sort(string2s);
			
			if(Arrays.equals(string1s, string2s))
			{
				isAnagram = true;
			}
		}
		
		return isAnagram;
	}
	
}
