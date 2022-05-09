package com.springtest.springtest.services;

import java.util.List;

import com.springtest.springtest.employee.Employee;

public interface EmployeeServices {
	
	public List<Employee> getEmployee();
	
	public Employee getEmp(long empid);
	
	public Employee getEmpDetails(long empid, String name);

	public Employee addEmp(Employee emp);

	public Employee upateEmployee(long parseLong, Employee emp);

	public Employee deleteEmployee(long parseLong);

}
