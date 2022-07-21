package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.model.UserSignUp;
import com.springcrud.services.UserServices;

@Controller
public class UserRegistrationController {
	
	@Autowired
	UserServices service;
	
	@RequestMapping("/gotoregistration")
	public String goToRegistration() {
		
		return "registration";
	}
	
	@RequestMapping(path="/signup",method = RequestMethod.POST)
	public String signup(@ModelAttribute("u") UserSignUp u,Model m) {
		
		if(this.service.isUsernameAlreadyExists(u.getUsername()) 
				|| !(u.getPassword().equals(u.getRepeatpassword())) || this.service.isFieldsEmpty(u)){
			return "redirect:/gotoregistration";
		}else {
			this.service.createUser(u);
			return "registrationsuccess";
		}
		
				
		
	}
	@RequestMapping("/registrationsuccess")
	public String go() {
		
		return "registrationsuccess";
	}	

}
