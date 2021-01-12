package com.buraktuncdev.gkeexample.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String greet(){
		return "Hello, GKE";
	}

}
