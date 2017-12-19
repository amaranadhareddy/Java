package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;



public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest obj = new Interest();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter amount,years and rate");
		double amt = scan.nextDouble();
		int years = scan.nextInt();
		float rate = scan.nextFloat();
		try {
			obj.setAmt(amt);
			obj.setYears(years);
			obj.setRate(rate);
			obj.calcSimple();
			obj.calcCompound();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
