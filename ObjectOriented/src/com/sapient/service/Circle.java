package com.sapient.service;

public class Circle {
	public int rad;
	
	public double area(){
		return Math.PI * rad*rad;
	}
	
	public double peri(){
		return 2* Math.PI *rad;
	}

}
