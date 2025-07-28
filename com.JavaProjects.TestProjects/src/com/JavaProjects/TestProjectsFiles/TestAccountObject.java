package com.JavaProjects.TestProjectsFiles;

public class TestAccountObject
{
	private String accountNumber;
	private String name;
	private Double balance;
	private String ccy;
	private String accStatus;
	
	public TestAccountObject(String accountNumber, String name, Double balance, String ccy, String accStatus)
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.ccy = ccy;
		this.accStatus = accStatus;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public Double getBalance()
	{
		return balance;
	}
	public void setBalance(Double balance)
	{
		this.balance = balance;
	}
	public String getCcy()
	{
		return ccy;
	}
	public void setCcy(String ccy)
	{
		this.ccy = ccy;
	}
	public String getAccStatus()
	{
		return accStatus;
	}
	public void setAccStatus(String accStatus)
	{
		this.accStatus = accStatus;
	}
	
	@Override
	public String toString()
	{
		return "Student{Acc No   =" + accountNumber + 
					 ", Name =" + name + 
			         ", Bal =" + balance +
			         ", Ccy =" + ccy +
			   "}";
	}
}
