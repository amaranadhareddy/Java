package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;



public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius");
		double rad = scan.nextDouble();
		try {
			Circle obj = new Circle(rad);
			System.out.println("area:"+obj.area());
			System.out.println("peri:"+obj.peri());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
