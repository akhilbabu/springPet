package com.SpringPet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	
	
	@RequestMapping("/welcome")
	public String welcomeController()
	{
		return "hello";
	}

}
