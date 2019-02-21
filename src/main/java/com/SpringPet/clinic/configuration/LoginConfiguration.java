package com.SpringPet.clinic.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.SpringPet.clinic.services.LoginService;
import com.SpringPet.clinic.services.LoginServiceImpl;
import com.SpringPet.clinic.services.TestLoginServiceImpl;
@Configuration
public class LoginConfiguration {
	
	
	@Bean
	@Qualifier("login")
	public LoginService loginServiceimpl()
	{
		return new LoginServiceImpl();
	}
	@Bean
	@Qualifier("testlogin")
	public LoginService testLoginServiceimpl()
	{
		return new TestLoginServiceImpl();
	}

}
