package com.SpringPet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringPet.clinic.model.UserDTO;

@Controller
public class LoginController {

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "hello";
	}

	@GetMapping("/login")
	public String home(Model model) {
		UserDTO userdto = new UserDTO("", "");
		model.addAttribute("userdto", userdto);

		return "login";
	}

	@PostMapping("/login")
	public ModelAndView checkLogin(@ModelAttribute UserDTO userdto) {
		System.out.println(userdto.getUsername());
		System.out.println(userdto.getPassword());
		ModelAndView mAndV = new ModelAndView();
		mAndV.setViewName("home");
		mAndV.addObject("username", userdto.getUsername());
		return mAndV;

	}

}
