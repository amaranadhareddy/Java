package com.sapient.wrapper;

public class WrapperDemo1 {
	public static void main(String[] args){
		//convert string into primitive type
		String str1 = "67";
		String str2 = "4.5";
		int val1 = Integer.parseInt(str1);
		double val2 = Double.parseDouble(str2);
		double res = val1+val2;
		System.out.println(res);
		
		//find size and range
		System.out.println("size of float:"+ Float.SIZE);
		System.out.println("min:"+ Float.MIN_VALUE);
		System.out.println("max:"+ Float.MAX_VALUE);
	}
}
