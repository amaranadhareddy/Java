package com.sapient.service;

public abstract class Acc {
	 private int accId;
	 private String custName;
	 private double amt;
	 
	 public Acc(int accId, String custName, double amt) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.amt = amt;
	}

	public void display(){
		 System.out.println("Acc id:"+accId);
		 System.out.println("Acc name:"+custName);
		 System.out.println("Amount:"+amt);
	 }
	
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public abstract String deposit(double amt);
}
