package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		try {
			Mtable obj = new Mtable(scn.nextInt());
			obj.display();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		scn.close();
	}

}
