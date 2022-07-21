package com.springcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.dao.UserDao;
import com.springcrud.model.User;
import com.springcrud.model.UserSignUp;

@Service
public class LoginServices {
	
	@Autowired
	UserDao dao;
	
	public boolean isCredentialsCorrect(String username,String password) {
		
		boolean result = false;
		List<UserSignUp> allData = dao.getAllData();
		
		for (UserSignUp userSignUp : allData) {
			
			if(userSignUp.getUsername().equals(username) && userSignUp.getPassword().equals(password) ) {
				result=true;
			}
			
		}
		
		return result;
		
	}

}
