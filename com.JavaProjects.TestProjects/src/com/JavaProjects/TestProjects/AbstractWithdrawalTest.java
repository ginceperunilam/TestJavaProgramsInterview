package com.JavaProjects.TestProjects;

public abstract class AbstractWithdrawalTest extends  AbstractDepositTest
{
	@Override
	public Boolean withdrawal(Long amount)
	{
		if(amount<500l)
			return true;
		else
			return false;
	}
}
