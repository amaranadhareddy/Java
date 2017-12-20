package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {
	public static void main(String [] args){
		Interest obj = Calculator.getInterest();
		System.out.println(obj.calSimple(5000, 2, 2.5f));
		System.out.println(obj.calCompound(5000, 2, 2.5f));
		System.out.println(obj.convert2Binary(12));
		System.out.println(obj.doSum(1,2,3,4,5));
		System.out.println(obj.doAvg(1,2,3,4,5));
	}
}
