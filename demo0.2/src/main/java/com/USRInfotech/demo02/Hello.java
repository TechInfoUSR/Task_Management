package com.USRInfotech.demo02;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class Hello {
	@RequestMapping("/")
public String greet() {
	System.out.println("Hello");
	return "Hello Completed the task";
}
}
