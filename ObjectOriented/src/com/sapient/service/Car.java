package com.sapient.service;

public class Car {
	private int carId;
	private String carName;
	private double price;
	public Car (int carId) throws Exception{
		
		System.out.println("one arg constructor");
		if (carId<1000) throw new Exception("cardId must be greater thatn 1000");
		this.carId = carId;
	}
	public  Car(int carId, String carName) throws Exception{
		this(carId);
		
		System.out.println("two arg constructor");
		if(!carName.matches("[a-z]{3,10}"))
			throw new Exception("car name must be 3-10 characters");
		this.carName = carName;
	}
	public Car(int carId, String carName, double price) throws Exception{
		this(carId, carName);
		System.out.println("three arg constructor");
		if(price<100000)
			throw new Exception("price must be mre than one lakh");
		this.price = price;
	}
	
	public void display(){
		System.out.println(carId+" "+carName+" "+price);
	}
}
