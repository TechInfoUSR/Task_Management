package com.USRInfotech.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.USRInfotech.demo02_controller.Hello;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class, args);
//		Hello obj =context.getBean(com.USRInfotech.demo02_controller.Hello. class);
//		obj.greet();	
	}

}
