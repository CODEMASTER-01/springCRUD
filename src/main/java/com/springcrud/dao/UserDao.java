package com.springcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springcrud.model.UserSignUp;

@Repository
public class UserDao {
	
	@Autowired
	HibernateTemplate hybTemp;
	
	@Transactional
	public void insert(UserSignUp u) {
		
		this.hybTemp.save(u);
	}
	
	public List<UserSignUp> getAllData () {
		
		return this.hybTemp.loadAll(UserSignUp.class);
		
	}

}
