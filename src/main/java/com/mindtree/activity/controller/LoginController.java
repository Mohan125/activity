package com.mindtree.activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping(value="/")
	public String loginMessage(ModelMap model) {
//	model.put("name", name);
	return "login";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showLoginPage(ModelMap model, @RequestParam String name,@RequestParam String gender ) {
	
	System.out.println("The username is : "+name);
	System.out.println("Gender is : "+gender);
	model.put("name", name);
	model.put("gender", gender);
	
	return "welcome";
}
	
}
