package com.zensar.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/naveen")
	public String welcome()
	{
		return "Welcome in Vizag -City of Destiny";
	}
}
