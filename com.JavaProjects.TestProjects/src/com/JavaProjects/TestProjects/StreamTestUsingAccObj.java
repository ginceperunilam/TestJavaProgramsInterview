package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.JavaProjects.TestProjectsFiles.TestAccountObject;

public class StreamTestUsingAccObj
{
	List<TestAccountObject> testAccountObjects = new ArrayList<>();
	public StreamTestUsingAccObj()
	{
		testAccountObjects.add(new TestAccountObject("1003G2512", "Gince", 1200d,"INR", "Active"));
		testAccountObjects.add(new TestAccountObject("1003F2504", "Feivel", 412d,"INR", "Active"));
		testAccountObjects.add(new TestAccountObject("1003C1702", "Chinnu", 1300d,"INR", "Active"));
		testAccountObjects.add(new TestAccountObject("1003F1701", "Freyan", 12d,"INR", "Active"));
		testAccountObjects.add(new TestAccountObject("1003A0811", "Amala", 889d,"INR", "Suspend"));
		testAccountObjects.add(new TestAccountObject("1003T3103", "Thomas", 455d,"INR", "Active"));
		testAccountObjects.add(new TestAccountObject("1003A1309", "Shahid", 2300d,"INR", "Suspend"));
	}
	
	public void accBalGreater(Double minaccBalance)
	{
		List<TestAccountObject> filter = testAccountObjects.stream()
															 .filter(testAccountObject -> testAccountObject.getBalance() > minaccBalance)
															 .collect(Collectors.toList());
		System.out.println("Acc bal greater than "+minaccBalance +":"+filter);
		filter.forEach(System.out :: println);
		 
		System.out.println("------");
		filter.forEach(accObjs -> System.out.println(accObjs));
		
		 System.out.println("Filter and print acc number same line");
		testAccountObjects.stream()
					      .filter(accObj -> accObj.getBalance() > minaccBalance)
					      .forEach(accObj -> System.out.println(accObj.getAccountNumber()));
	}
	
	//Account balance and acc status 
	public void accBalGreaterAndActiveAcc(Double minaccBalance, String accStatus)
	{
		System.out.println("Account balance and acc status ");
		testAccountObjects.stream()
						  .filter(acc -> acc.getAccStatus() == accStatus)
						  .filter(accObj -> accObj.getBalance() > minaccBalance)
						  .forEach(accObject -> System.out.println(accObject));
		
		System.out.println("Account balance and acc status print as list");
		List<TestAccountObject> testAccountObjects1 = 
				 testAccountObjects.stream().filter(acc -> acc.getAccStatus() == accStatus)
								   .filter(acc -> acc.getBalance() > minaccBalance)
								   .collect(Collectors.toList());
		testAccountObjects1.forEach(System.out :: println);
	}
}
