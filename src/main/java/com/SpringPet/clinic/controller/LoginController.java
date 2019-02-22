package com.SpringPet.clinic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringPet.clinic.model.UserDTO;
import com.SpringPet.clinic.repository.ProductRepository;
import com.SpringPet.clinic.services.LoginService;

@Controller
public class LoginController {
	public static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	public LoginService service;
	
	
	public ProductRepository repo;

	public LoginController(@Qualifier("login") LoginService service,ProductRepository repo) {
		super();
		this.service = service;
		this.repo=repo;
	}

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "hello";
	}

	@GetMapping("/")
	public String home(Model model) {
		UserDTO userdto = new UserDTO("", "");
		model.addAttribute("userdto", userdto);
		LOGGER.info("log in page >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return service.loginToHome();
	}

	@PostMapping("/login")
	public ModelAndView checkLogin(@ModelAttribute UserDTO userdto) {
		System.out.println(userdto.getUsername());
		System.out.println(userdto.getPassword());
		ModelAndView mAndV = new ModelAndView();
		mAndV.setViewName("home");
		mAndV.addObject("prods",repo.findAll() );
		return mAndV;

	}

}
