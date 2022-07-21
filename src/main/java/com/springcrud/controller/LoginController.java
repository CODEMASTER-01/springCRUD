package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.model.User;
import com.springcrud.services.LoginServices;

@Controller
public class LoginController {
	
	@Autowired
	LoginServices service;
	
	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(path="verify",method = RequestMethod.POST)
	public String loginVerify(@ModelAttribute ("user") User user,Model m) {
		
		if(this.service.isCredentialsCorrect(user.getUsername(), user.getPassword())) {
			return "redirect:/show";
		}else {
			
			return "login";
		}
				
		
	}

}
