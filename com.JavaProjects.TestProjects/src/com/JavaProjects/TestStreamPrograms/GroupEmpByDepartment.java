package com.JavaProjects.TestStreamPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.JavaProjects.TestProjectsFiles.Employee;

public class GroupEmpByDepartment
{
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public GroupEmpByDepartment()
	{
		SecHHighestSalariedEmployee secHHighestSalariedEmployee = new SecHHighestSalariedEmployee();
		employees = secHHighestSalariedEmployee.getEmployees();
	}

	public void groupEmployeesByDep()
	{
		System.out.println("Group employees by department");
		Map<String, List<Employee>> mapBydep = employees.stream()
				.collect(Collectors.groupingBy(e -> Optional.ofNullable( e.getDepartment()).orElse("NULL Dep")));
		
		for(Map.Entry<String, List<Employee>> map : mapBydep.entrySet())
		{
			System.out.println("Department:"+map.getKey()+", \nEmployees: "+map.getValue());
		}
	}
	
	public void highestSalaryInEachDep()
	{
		System.out.println("Max Salary in each dep");
		Map<String, Optional<Employee>> salMap = employees.stream()
									 .collect(Collectors.groupingBy(e -> Optional.ofNullable(e.getDepartment()).orElse("Empty"),
											 Collectors.maxBy(Comparator.comparing(e -> Optional.ofNullable(e.getSalary())
													 .orElse(0d)))));
									
		for(Map.Entry<String, Optional<Employee>> map : salMap.entrySet())
		{
			System.out.println("Department:"+map.getKey()+", \nEmployees: "+map.getValue());
		}					 
	}
}
