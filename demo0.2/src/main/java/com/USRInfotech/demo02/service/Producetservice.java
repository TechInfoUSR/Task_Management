package com.USRInfotech.demo02.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.USRInfotech.demo02.models.Product;
@Service
public class Producetservice {
	 List<Product> products=Arrays.asList(
			 new Product(101,"Phone", 1000),
			 new Product(102,"Laptop", 2000));
	 
	 public List<Product> getproducts(){
		 return products;
	 }
@RequestMapping

	public Product getproductsByid(int prodId) {
		
		return products.stream()
				.filter(p -> p.getProdId()== prodId)
				.findFirst().get();
	}
}
