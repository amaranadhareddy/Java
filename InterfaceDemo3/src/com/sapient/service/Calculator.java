package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest, Factorial{
	private static Calculator calc = new Calculator();
	private  Calculator() {
	}
	
	public static Basic getBasic(){
		Basic obj = calc;
		return obj;
	}
	public static Interest getInterest(){
		Interest obj = calc;
		return obj;
	}
	public static Factorial getFactorial(){
		Factorial obj = calc;
		return obj;
	}
	@Override
	public String convert2Binary(int num) {
		return Integer.toBinaryString(num);
	}

	@Override
	public double calSimple(double amt, int years, float rate) {
		double si  = amt * years * rate / 100;
		return si;
	}

	@Override
	public double calCompound(double amt, int years, float rate) {
		double ci = amt * Math.pow((1+rate/100),years);
		return ci - amt;
	}

	@Override
	public BigInteger calFactorial(int num) {
		BigInteger fact = BigInteger.ONE;
		for(int i = 1;i<=num;i++)
			fact = fact.multiply(BigInteger.valueOf(num));
		return fact;
	}

	@Override
	public int doSum(int... a) {
		return Interest.super.doSum(a);
	}
	
	
}
