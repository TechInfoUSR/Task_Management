package com.USRInfotech.demo02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.USRInfotech.demo02.service.Producetservice;
//@Component
@RestController
public class Hello {
	@Autowired
	Producetservice service;
//	@ResponseBody
	@RequestMapping("/")	
public String greet() {
	System.out.println("Hello");
	return "Hello Completed the task..";
}
}
