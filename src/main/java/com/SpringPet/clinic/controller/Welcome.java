package com.SpringPet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Welcome {
	
	
	@RequestMapping("/welcome")
	public String welcomeController()
	{
		return "hello";
	}

}
