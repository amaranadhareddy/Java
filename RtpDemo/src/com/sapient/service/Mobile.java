package com.sapient.service;

public class Mobile extends Product{
	private String camPx;

	public Mobile(int proId, String proName, double price, String camPx) {
		super(proId, proName, price);
		this.camPx = camPx;
	}

	@Override
	public String isExpensive() {
		String res=null;
		double price = getPrice();
		if(price>10000) res="Expensive";
		else if (price>5000) res= "average";
		else res="cheap";
		return res; 
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%20s%20s%20s\n",camPx,isExpensive(),getClass().getSimpleName());
	}
	
	
}
