package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Factorial obj = Calculator.getFactorial();
		System.out.println(obj.doSum(1,2,3,4,5));
		System.out.println(obj.calFactorial(5));

	}

}
