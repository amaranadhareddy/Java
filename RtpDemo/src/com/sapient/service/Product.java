package com.sapient.service;

public abstract class Product {
	private int proId;
	private String proName;
	private double price;
	public Product(int proId, String proName, double price){
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void display(){
		System.out.printf("%10d%20s%10.2f", proId, proName, price);
	}
	public double getPrice(){
		return price;
	}
	public abstract String isExpensive();
}
