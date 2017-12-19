package com.sapient.client;

import com.sapient.service.Car;

public class ConstructorDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			Car car = new Car(100, "ford", 450000);
			car.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
