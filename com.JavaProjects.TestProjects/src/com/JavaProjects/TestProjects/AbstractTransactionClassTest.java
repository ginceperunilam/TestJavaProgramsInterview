package com.JavaProjects.TestProjects;

public abstract class AbstractTransactionClassTest
{
	public abstract void deposit(Long amount);
	//by default the access specifier is public for abstract classes and methods
	abstract Boolean withdrawal(Long amount);
	abstract Boolean transfer(Long amount);
	
	public void printSlip(Boolean success)//concrete method
	{
		if(success)
			System.out.println("completed transaction successful");
		else
			System.out.println("transaction failed pls check");
	}
}
