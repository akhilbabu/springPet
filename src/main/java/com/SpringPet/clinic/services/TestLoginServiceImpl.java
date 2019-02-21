package com.SpringPet.clinic.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLoginServiceImpl implements LoginService 
{
	public static Logger LOGGER = LoggerFactory.getLogger(TestLoginServiceImpl.class);

	@Override
	public String loginToHome() {
		LOGGER.info("logging into Guest >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>#######");
		return "guest_home";
	}

}
