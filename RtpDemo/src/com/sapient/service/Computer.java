package com.sapient.service;

public class Computer extends Product{
	private String hdd;

	public Computer(int proId, String proName, double price, String hdd) {
		super(proId, proName, price);
		this.hdd = hdd;
	}

	@Override
	public String isExpensive() {
		double price = getPrice();
		String res=null;
		if(price>50000) 
			res= "expensive";
		else if(price >=30000)
			res="average";
		else res="cheap";
		return res;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10s%30s%20s\n",hdd, isExpensive(),getClass().getSimpleName());
	}
	
	
}
