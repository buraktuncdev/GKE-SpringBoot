package com.buraktuncdev.gkeexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.buraktuncdev.gkeexample.service.GreetingService;

@Controller
public class GreetingController {

	private final GreetingService greetingService;

	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting(){
		return greetingService.greet();
	}

}
