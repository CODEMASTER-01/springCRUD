package com.springcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springcrud.model.Employee;

@Repository
public class EmpDao {
	
	@Autowired
	private HibernateTemplate hybTemp;

	public HibernateTemplate getHybTemp() {
		return hybTemp;
	}

	public void setHybTemp(HibernateTemplate hybTemp) {
		this.hybTemp = hybTemp;
	}
	
	
	@Transactional
	public void insert(Employee emp) {
	//create and insert	
		this.hybTemp.saveOrUpdate(emp);
	}
	
	public List<Employee> getEmployee(){
		//select all
		List<Employee> empList = this.hybTemp.loadAll(Employee.class);
		return empList;
	}
	
	@Transactional
	public void deleteRecord(int id) {
		//delete
		Employee emp=this.hybTemp.load(Employee.class, id);
		System.out.println(emp);
		this.hybTemp.delete(emp);
	}
	
	public Employee getRecord(int id) {
		//get one employee record
			
		return this.hybTemp.get(Employee.class, id);
	}

}
