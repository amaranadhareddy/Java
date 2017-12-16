package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;
import com.sapient.util.SapUtil;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		System.out.println("enter radius");
		obj.rad = new Scanner(System.in).nextInt();
		System.out.println(obj.area());
		System.out.println(obj.peri());
		System.out.println(SapUtil.roundUp2Dec(obj.area()));
		System.out.println(SapUtil.roundUp2Dec(obj.peri()));
	}

}
