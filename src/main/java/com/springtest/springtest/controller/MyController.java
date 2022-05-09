package com.springtest.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springtest.employee.Employee;
import com.springtest.springtest.services.EmployeeServices;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeServices employeeService;
 
	@GetMapping("/home")
	public String home() {
		return "This is home";
	}
	
	//get Employee details
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		return this.employeeService.getEmployee();
				
	}
	
	@GetMapping("/employee/{empid}")
	public Employee getEmp(@PathVariable String empid) {
		
		return this.employeeService.getEmp(Long.parseLong(empid));
	}
	
	@GetMapping("/employees")
	public Employee getEmpDetails(@RequestParam(name="empid") String empid , @RequestParam(name="empname") String empname)  {
		
		return this.employeeService.getEmpDetails(Long.parseLong(empid), empname);
	}
	
	@PostMapping("/employees")
	public Employee addEmp(@RequestBody Employee emp) {
	
		return this.employeeService.addEmp(emp);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestParam(name="empid") String empid, @RequestBody Employee emp ) {
		
		return this.employeeService.upateEmployee(Long.parseLong(empid), emp);
	}	
	
	@DeleteMapping("/employee")
	public Employee deleteEmolyee(@RequestParam(value="empid") String empid) {
		return this.employeeService.deleteEmployee(Long.parseLong(empid));
	
	}
}
