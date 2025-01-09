package com.USRInfotech.demo02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.USRInfotech.demo02.models.Product;
import com.USRInfotech.demo02.service.Producetservice;

@RestController
public class Productcontroller {
	@Autowired
	Producetservice service;
	

	@RequestMapping("/products")
public List<Product> productlist()
{
	return service.getproducts();
}
	
	public Product getProductId(int prodid) {
		return service.getproductsByid(prodid);
	}
}
