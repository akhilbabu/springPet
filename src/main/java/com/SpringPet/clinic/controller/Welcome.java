package com.SpringPet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {
	
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "hello";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}

}
