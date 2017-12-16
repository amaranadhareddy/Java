package com.sapient.service;

import com.sapient.client.SalesmanClient;

public class Salesman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesmanClient s1 = new SalesmanClient("ram", 1001, 45000);
		SalesmanClient s2 = new SalesmanClient("tom", 1002, 18000);
		SalesmanClient s3 = new SalesmanClient("sam", 1003, 25000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("no of perons:"+SalesmanClient.noOfEmp);
		System.out.println("ttal sales:"+SalesmanClient.totSales);
	}

}



