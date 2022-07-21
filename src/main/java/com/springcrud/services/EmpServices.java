package com.springcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.dao.EmpDao;
import com.springcrud.model.Employee;

@Service
public class EmpServices {
	
	
	@Autowired
	EmpDao dao;
	
	//inserting a record	
	public void createAndInsert(Employee emp) {
		
		this.dao.insert(emp);
	}
	
	//getting existing record
	public List<Employee> getAllEmployee(){
		
		List<Employee> empList=this.dao.getEmployee();
		return empList;
		
	}
	
	//deleting existing record
	public void deleteEmployee(int id) {
		
		this.dao.deleteRecord(id);
	}
	
	
	//gets an employee record
	public Employee getAEmployeeRecord(int id) {
		
		return this.dao.getRecord(id);
				
	}
	
	

}
