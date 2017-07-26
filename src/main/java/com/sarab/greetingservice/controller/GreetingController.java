package com.sarab.greetingservice.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

	private static final String[] greetings = {"Hello", "Namaste", "SSakal"};
	private Random random = new Random();
	
	@RequestMapping(value = "/greeting-service/greeting", method=RequestMethod.GET)
	public String getGreeting() {
		int index = random.nextInt(greetings.length);
		LOGGER.info("index is: "+index);
		return greetings[index];
	}
}
