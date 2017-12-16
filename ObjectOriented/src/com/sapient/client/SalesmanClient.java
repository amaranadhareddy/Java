package com.sapient.client;

public class SalesmanClient {
	public String name;
	public int id;
	public double samt;
	public static int noOfEmp;
	public static double totSales;
	
	public double calSaleComm(){
		double sc=0;
		if(samt>=50000) sc= 0.1 * samt;
		else if(samt>=20000) sc = 0.05 * samt;
		else sc = 0.03 * samt;
		return sc;
	}

	public SalesmanClient(String name, int id, double samt) {
		super();
		this.name = name;
		this.id = id;
		this.samt = samt;
		++noOfEmp;
		totSales+=samt;
	}
	
	public void display(){
		System.out.println("name:"+name+" id:"+id+" sal:"+samt);
	}

}
