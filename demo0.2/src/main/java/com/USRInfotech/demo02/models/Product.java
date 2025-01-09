package com.USRInfotech.demo02.models;

import org.springframework.stereotype.Component;

@Component
public class Product {
 
	public Product(){
		
	}
	private int ID;
	private String ProdName;
	private int price;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int iD, String prodName, int price) {
		super();
		ID = iD;
		ProdName = prodName;
		this.price = price;
	}
	
}
