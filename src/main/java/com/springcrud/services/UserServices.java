package com.springcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.dao.UserDao;
import com.springcrud.model.UserSignUp;

@Service
public class UserServices {

	@Autowired
	UserDao dao;
	
	public void createUser(UserSignUp u) {
		this.dao.insert(u);
	}
	
	public boolean isUsernameAlreadyExists(String username) {
		
		boolean result= false ;
		List<UserSignUp> allData = dao.getAllData();
		
		for (UserSignUp users : allData) {
			if (users.getUsername().equals(username)) {
				result= true;
			}
			
		}	
		return result;	
	}
	public boolean isFieldsEmpty(UserSignUp u) {
		
		boolean result=(u.getName().isEmpty() || u.getPassword().isEmpty() || u.getRepeatpassword().isEmpty() || u.getUsername().isEmpty());
		return result;
	}
}
