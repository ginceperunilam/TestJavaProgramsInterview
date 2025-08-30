package com.JavaProjects.MainMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.JavaProjects.TestStreamPrograms.CountCharactersInString;
import com.JavaProjects.TestStreamPrograms.EvenNumberUsingStream;
import com.JavaProjects.TestStreamPrograms.GroupEmpByDepartment;
import com.JavaProjects.TestStreamPrograms.SecHHighestSalariedEmployee;

public class TestStreams
{

	public TestStreams()
	{
		sampleStreamPrograms();
	}

	private void sampleStreamPrograms()
	{
//		evenNumbersUsingStream();//find even numbers using stream
//		countCharactersInString("programmingLLang");//Count Frequency of Each Character in a String
//		secondHHighestSalariedEmployee();
		groupEmployeesByDepartment();
	}

	private void groupEmployeesByDepartment()
	{
		GroupEmpByDepartment groupEmpByDepartment = new GroupEmpByDepartment();
		groupEmpByDepartment.groupEmployeesByDep();
		groupEmpByDepartment.highestSalaryInEachDep();
	}

	//find highest salaried employees
	private void secondHHighestSalariedEmployee()
	{
		SecHHighestSalariedEmployee secHHighestSalariedEmployee = new SecHHighestSalariedEmployee();
		secHHighestSalariedEmployee.getLargestSalariedEmployee();
		secHHighestSalariedEmployee.getLargestSalariedEmployees();
		secHHighestSalariedEmployee.getSecondHighestSalariedEmployee();
		secHHighestSalariedEmployee.getSecHighestSalariesEmployees();
	}

	//Count Frequency of Each Character in a String
	private void countCharactersInString(String str)
	{
		CountCharactersInString countCharactersInString = new CountCharactersInString();
		countCharactersInString.countCharacters(str);
		countCharactersInString.countCharactersInSorted(str);
	}

	//find even numbers using stream
	private void evenNumbersUsingStream()
	{
		List<Long> nos = Arrays.asList(1l,2l,3l,4l,5l,6l,7l,8l,9l,10l);
//		ArrayList<Long> nos = new ArrayList<>(Arrays.asList(1l,2l,3l,4l,5l,6l,7l,8l,9l,10l));
		EvenNumberUsingStream evenNumberUsingStream = new EvenNumberUsingStream();
		evenNumberUsingStream.evenNumbers(nos);		
	}
}
