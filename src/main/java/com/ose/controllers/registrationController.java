package com.ose.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ose.hibernate.entity.user;
import com.ose.hibernate.dao.UserDao;

@Controller
@RequestMapping(value = "/register")
public class registrationController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String register(@ModelAttribute("aNewUser") user user) {
		UserDao userDao=new UserDao();
		userDao.saveUser(user);
		
		return "register";
	}
	
	
}
		
		



	
	
	
	
