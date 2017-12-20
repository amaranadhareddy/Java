package com.sapient.service;

public interface Interest extends Basic{
	
	double calSimple(double amt, int years,float rate);
	
	double calCompound(double amt, int years,float rate);
}
 