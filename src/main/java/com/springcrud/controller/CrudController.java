package com.springcrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.model.Employee;
import com.springcrud.services.EmpServices;

@Controller
public class CrudController {
	
	@Autowired
	EmpServices services;
	
	@RequestMapping("/show")
	public String showRecord(Model m) {
		m.addAttribute("title","Employee Record");
		List<Employee> allEmployee = services.getAllEmployee();
		m.addAttribute("allEmployee",allEmployee);
		System.out.println(allEmployee);
		
		return "show_entries";
	}
	
	@RequestMapping(path="/makenewrecord",method = RequestMethod.POST)
	public String makeNewRecord(Model m) {
		
		m.addAttribute("title", "New Entry");
		m.addAttribute("heading", "Add Employee Record");
		return "make_a_new_entry";
	}
	
	@RequestMapping(path="/addrecord",method = RequestMethod.POST)
	public String addRecord(@ModelAttribute("emp") Employee emp,Model m) {
		
		
		if(emp.getAdditionalDetails().isEmpty() || emp.getAddress().isEmpty() ||
				emp.getCompName().isEmpty() || emp.getEmail().isEmpty() ||
				emp.getfName().isEmpty() || emp.getlName().isEmpty() || emp.getPhone()==null) {
			
			m.addAttribute("title", "New Entry");
			m.addAttribute("heading", "Add Employee Record");
			return "make_a_new_entry";
		}
		
		this.services.createAndInsert(emp);
		return "redirect:/show";
	}
	
	@RequestMapping(path="/delete/{id}")
	public String deleteRecord(@ModelAttribute("emp") Employee emp,@PathVariable("id") int id,Model m) {
		
		this.services.deleteEmployee(id);
		return "redirect:/show";
	}
	
	@RequestMapping(path="/update/{id}")
	public String showUpdateRecord(@PathVariable("id") int id,Model m) {
		
		Employee emp =this.services.getAEmployeeRecord(id);
		
		m.addAttribute("emp", emp);
		m.addAttribute("title", "Update Form");
		m.addAttribute("heading", "Update Record");
		
		return "update_form";
	}
	
	
}
