package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Washercontroller {
	@GetMapping("/hellos")
	public String sayhello()
	{
		return "hello from nikhil";
	}

}
