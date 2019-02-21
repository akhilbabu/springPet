package com.SpringPet.clinic.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginServiceImpl implements LoginService {

	public static Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Override
	public String loginToHome() {
		LOGGER.info("logging into home >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>#######");
		return "login";
	}

}
