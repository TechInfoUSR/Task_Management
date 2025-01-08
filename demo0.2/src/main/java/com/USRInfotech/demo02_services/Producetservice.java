package com.USRInfotech.demo02_services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.USRInfotech.demo02_model.Product;
@Service
public class Producetservice {
	 List<Product> products=Arrays.asList(
			 new Product(101,"Phone", 1000),
			 new Product(102,"Laptop", 2000));
	 
	 public List<Product> getproducts(){
		 return products;
	 }
}
