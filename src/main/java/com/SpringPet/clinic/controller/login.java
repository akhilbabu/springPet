package com.SpringPet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class login {
	
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome()
	{
		return "hello";
	}
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "login";
	}

	
	
	@RequestMapping("/login")
	public void login(Model model)
	{
		System.out.println("user logged in");
	}
	
}
