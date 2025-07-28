package com.JavaProjects.TestProjects;

public class AbstractTransferTest extends AbstractWithdrawalTest
{
	@Override
	public Boolean transfer(Long amount)
	{
		if(amount<200l)
			return true;
		else
			return false;
	}
}
