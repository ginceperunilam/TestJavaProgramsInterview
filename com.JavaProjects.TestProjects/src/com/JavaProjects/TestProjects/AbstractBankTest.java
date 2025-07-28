package com.JavaProjects.TestProjects;

public class AbstractBankTest
{
	public void bankTransactions()
	{
		AbstractDepositTest abstractDepositTest = new AbstractTransferTest();
		abstractDepositTest.deposit(400l);
		
		Boolean withdrawal = abstractDepositTest.withdrawal(550l);
		abstractDepositTest.printSlip(withdrawal);
		
		Boolean transfer = abstractDepositTest.transfer(100l);
		abstractDepositTest.printSlip(transfer);
		
	}
}
