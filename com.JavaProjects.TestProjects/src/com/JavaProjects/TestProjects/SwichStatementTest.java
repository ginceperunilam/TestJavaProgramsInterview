package com.JavaProjects.TestProjects;

public class SwichStatementTest
{
	//switch with out break
	public void switchWithoutBreak(int value)
	{
		switch(value)
		{
			case 1:
				System.out.println("Your value is one:"+value);
			case 2:
				System.out.println("Your value is two:"+value);
			case 3:
				System.out.println("Your value is three:"+value);
			case 4:
				System.out.println("Your value is four:"+value);
			default:
				System.out.println("Your value is invalid:"+value);
		};
	}
	
	//switch with break
	public void switchWithBreak(Long value)
	{
		switch(value.intValue())
		{
			case 1:
				System.out.println("Your Long value is one:"+value);
				break;
			case 2:
				System.out.println("Your Long value is two:"+value);
				break;
			case 3:
				System.out.println("Your Long value is three:"+value);
				break;
			case 4:
				System.out.println("Your Long value is four:"+value);
				break;
			default:
				System.out.println("Your Long value is invalid:"+value);
				break;
		};
	}
	
	//switch with arrow break, we can use -> instead of : and can avoid the break statement
	public void switchWithArrowBreak(String value)
	{
		switch(value == null ? "" : value)
		{
			case "a"->
				System.out.println("Your entered value is a:"+value.toUpperCase());
			case "b"->
				System.out.println("Your entered value is b:"+value.toUpperCase());
			case "c"->
				System.out.println("Your entered value is c:"+value.toUpperCase());
			case "d"->
				System.out.println("Your entered value is d:"+value.toUpperCase());
			default->
				System.out.println("Your entered value is invalid:"+value);
		};
	}
	
	//switch returning a value
	public void switchWithReturnValue(String value)
	{
		String result ="";
		result = switch(value == null ? "" : value)
		{
			case "a"->"Monday";
			case "b"->"Tuesday";
			case "c"->"Wednesday";
			case "d"->"Thursday";
			case "e"->"Friday";
			default->"Invalid";
		};
		System.out.println("Return value is:"+result);
	}
	
	//switch with :and yield key word instead of ->
	public void switchWithoutWithColonAndYield(String value)
	{
		String result ="";
		result = switch(value)
		{
			case "Saturday","Sunday" : yield "Your Time is 9AM, "+value;
			case "Monday" : yield "Your Time is 7AM, "+value;
			case "Tuesday" : yield "Your Time is 8AM, "+value;
			case "Wednesday" : yield "Your Time is 6AM, "+value;
			case "Thursday" : yield "Your Time is 2PM, "+value;
			case "Friday" : yield "Your Time is 4PM, "+value;
			default : yield "Invalid Time Allocated";
		};
		System.out.println("Return value is:"+result);
	}
}
