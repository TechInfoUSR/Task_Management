package com.USRInfotech.demo02_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.USRInfotech.demo02_model.Product;
import com.USRInfotech.demo02_services.Producetservice;

//@Component
@RestController
public class Productcontroller {
	@Autowired
	Producetservice service;
	

	@RequestMapping("/products")
public List<Product> productlist()
{
	return service.getproducts();
}
}
