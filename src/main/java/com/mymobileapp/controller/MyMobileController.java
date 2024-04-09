package com.mymobileapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyMobileController {
	
	@GetMapping(value = "/mobile")
	public String mobile() {
		return "mobile app is running";
	}
	

}
