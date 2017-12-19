package com.sapient.service;

public class SavingsAcc extends Acc{

	public SavingsAcc(int accId, String custName, double amt) {
		super(accId, custName, amt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amt) {
		// TODO Auto-generated method stub
		amt = getAmt()+amt;
		String res = "not deposited";
		if(amt<0) return "amt can't be negative";
		if(amt<50000){
			setAmt(amt);
			res="deposited";
		}
		return res;
	}
	
	
}
