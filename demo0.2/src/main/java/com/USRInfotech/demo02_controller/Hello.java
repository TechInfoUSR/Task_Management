package com.USRInfotech.demo02_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.USRInfotech.demo02_services.Producetservice;
@Component
@RestController
public class Hello {
	@Autowired
	Producetservice service;
	@RequestMapping("/")
	
public String greet() {
	System.out.println("Hello");
	return "Hello Completed the task..";
}
}
