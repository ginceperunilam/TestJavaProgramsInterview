package com.JavaProjects.TestProjectsFiles;

public class Employee
{
	private Long empId;
	private Long empcode;
	private String empName;
	private String department;
	private Double salary;
	
	public Employee()
	{
		System.out.println("DefaultConstructor in Employee");
	}
	
	public Employee(Long empId, Long empcode, String empName, String department, Double salary)
	{
		this.empId = empId;
		this.empcode = empcode;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	public Long getEmpId()
	{
		return empId;
	}
	public void setEmpId(Long empId)
	{
		this.empId = empId;
	}
	public Long getEmpcode()
	{
		return empcode;
	}
	public void setEmpcode(Long empcode)
	{
		this.empcode = empcode;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public Double getSalary()
	{
		return salary;
	}
	public void setSalary(Double salary)
	{
		this.salary = salary;
	}
	
	@Override
	public String toString() {
	    return "Employee {" +
	            "empId=" + empId +
	            ", empcode=" + empcode +
	            ", empName='" + empName + '\'' +
	            ", department='" + department + '\'' +
	            ", salary=" + salary +
	            '}';
	}
	
}
