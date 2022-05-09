package com.springtest.springtest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.springtest.Dao.EmployeeDao;
import com.springtest.springtest.employee.Employee;

@Service
public class EmplopyeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeDao employeedao;
	
	@Autowired
	public Employee e;
	//List<Employee> list;
	
	public EmplopyeeServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Employee(01,"Sakshi","jr.Soft. Eng"));
//		list.add(new Employee(02,"Shivanand","jr.Soft. Eng"));
		
	}
	
	
	@Override
	public List<Employee> getEmployee() {
		
		return employeedao.findAll();
	}


	
	
	@Override
	public Employee getEmp(long empid) {
		
//		Employee emp = null;
//		
//		for(Employee employee:list)
//		{
//			if(employee.getId() == empid)
//			{
//				emp= employee;
//				break;
//			}
//		}
		
		return employeedao.findById(empid).get();
	}


	@Override
	public Employee getEmpDetails(long empid, String name) {
		
		
//		
//		for(Employee employ:list)
//		{
//			if(employ.getId() == empid && employ.getName().equals(name))
//			{
//				empl=employ;
//				break;
//			}
//		}
//		return employeedao.getById(empid);
		
		// database implementation
		
		
		
		if(e.getId()==empid && e.getName().equals(name))
		{
			 return employeedao.findById.get();
			 
			 
		}
		return null;
	
		
	}


	@Override
	public Employee addEmp(Employee emp) {
		//list.add(emp);
		employeedao.save(emp);
		return emp;
	}


	@Override
	public Employee upateEmployee(long empid, Employee emp) {
		
//		Employee emp1 = null; 
//		for(Employee employ:list) {
//			if(employ.getId()== empid) {
//				//employ.setId(emp.getId());
//				employ.setName(emp.getName());
//				employ.setDesignation(emp.getDesignation());
//				emp1=employ;
//			}
//		}
		employeedao.save(emp);	
		return emp;
			
	}


	@Override
	public Employee deleteEmployee(long empid) {
		
//		Employee employ=null;
//		for(Employee emp:list) {
//			if(emp.getId()==empid) {
//				list.remove(emp);
//				employ=emp;
//			} 
//		}
		Employee entity= employeedao.getById(empid);
		employeedao.delete(entity); 
		return entity;
	}

}
