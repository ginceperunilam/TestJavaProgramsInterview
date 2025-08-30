package com.JavaProjects.TestStreamPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.JavaProjects.TestProjectsFiles.Employee;

public class SecHHighestSalariedEmployee
{

	public ArrayList<Employee> getEmployees()
	{
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1l,1001l,"Gince","Dev",20000d));
		employees.add(new Employee(2l,1002l,"Chinnu","Dev",10000d));
		employees.add(new Employee(3l,1003l,"Feivel","Dev",15000d));
		employees.add(new Employee(4l,1004l,"Freyan","Test",18000d));
		employees.add(new Employee(5l,1005l,"Don","Dev",22000d));
		employees.add(new Employee(6l,1006l,"Malu","Dev",22000d));
		employees.add(new Employee(7l,1007l,"Akku","Ctrl",18000d));
		employees.add(new Employee(8l,1008l,"Ritha",null,13500d));
		employees.add(new Employee(9l,1009l,null,"Ctrl",18000d));
		employees.add(new Employee(10l,1010l,"Kukku","Test",null));
		employees.add(new Employee(11l,1011l,"Adon","Ctrl",18400d));
		employees.add(new Employee(12l,1012l,"Ponnu","HR",19200d));
		
		return employees;
	}
	
	public void getLargestSalariedEmployee()
	{
		System.out.println("---Largest salaried employee, only one--");
		ArrayList<Employee> emps = getEmployees();
		List<Employee> highestSalaryEmp = emps.stream().filter(emp -> emp.getSalary() != null).
				sorted(Comparator.comparing(Employee :: getSalary).reversed()).limit(1).collect(Collectors.toList());
		for(Employee emp : highestSalaryEmp)
		{
			System.out.println(emp);
		}
	}
	
	public void getLargestSalariedEmployees()
	{
		System.out.println("---Largest salaried employees--");
		ArrayList<Employee> emps = getEmployees();
		List<Employee> highestSalaryEmp = emps.stream()
											.filter(obj -> obj.getSalary() != null)
											.collect(Collectors.groupingBy(Employee :: getSalary))
											.entrySet()
											.stream()
											.max(Comparator.comparing(e -> e.getKey()))//Map.Entry :: getKey
											.map(e -> e.getValue())//Map.Entry :: getValue
											.orElse(List.of());
		for(Employee emp : highestSalaryEmp)
		{
			System.out.println(emp);
		}
	}
	
	//this will not print the correct result if there is more than one record exist with same highest salary
	public void getSecondHighestSalariedEmployee()
	{
		System.out.println("---Second Largest salaried employee, only one--");
		ArrayList<Employee> emps = getEmployees();
		
		//way :1
		Employee employee = emps.stream().filter(emp -> emp.getSalary() !=null)
									   .sorted(Comparator.comparing(Employee :: getSalary).reversed())
									   .skip(1).findFirst().orElse(null);
		System.out.println(employee);
		
		//way :2
		List<Employee> employees = emps.stream().filter(emp -> emp.getSalary() !=null)
								 .sorted(Comparator.comparing(Employee :: getSalary).reversed())
								 .skip(1).limit(1)
								 .collect(Collectors.toList());
		for(Employee emp : employees)
		{
			System.out.println(emp);
		}
	}
	
	public void getSecHighestSalariesEmployees()
	{
		System.out.println("---Second Largest salaried employees--");
		ArrayList<Employee> emps = getEmployees();
		
		List<Employee> employees = emps.stream().filter(e -> e.getSalary() != null)
											.collect(Collectors.groupingBy(Employee :: getSalary))
											.entrySet()
											.stream()
											.sorted(Comparator.comparing(e -> e.getKey(), Comparator.reverseOrder()))
											.skip(1).findFirst()
											.map(e -> e.getValue())
											.orElse(List.of());
		for(Employee emp : employees)
		{
			System.out.println(emp);
		}
	}
}
