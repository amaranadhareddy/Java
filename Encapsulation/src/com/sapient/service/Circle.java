package com.sapient.service;

public class Circle {
	private double rad;
	public Circle(double rad) throws Exception{
		super();
		if(rad<=0)
			throw new Exception("radius must be greater than zero");
		this.rad = rad;
	}
	public double area(){
		return Math.PI * rad*rad;
	}
	
	public double peri(){
		return 2* Math.PI *rad;
	}

}
