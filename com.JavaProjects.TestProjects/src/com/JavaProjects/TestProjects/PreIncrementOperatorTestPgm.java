package com.JavaProjects.TestProjects;

public class PreIncrementOperatorTestPgm 
{
	public void preIncrmentOperatorTest()
	{
		int value = 25;
		Integer before = value;
		Long after = ++before == 26 ? 5 : new Long(10);
		System.out.println(after.intValue());
		System.out.println(before.intValue());
		System.out.println(after.intValue() - before.intValue());
	}
}
