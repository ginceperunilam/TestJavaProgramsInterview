package com.JavaProjects.TestProjects;

public abstract class AbstractDepositTest extends  AbstractTransactionClassTest
{
	@Override
	public void deposit(Long amount)
	{
		System.out.println("Deposited successfully:"+amount);
		printSlip(true);
	}
}
