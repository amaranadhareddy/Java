package com.sapient.service;

public class LoanAcc extends Acc{

	public LoanAcc(int accId, String custName, double amt) {
		super(accId, custName, amt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amt) {
		// TODO Auto-generated method stub
		String res="loan already cleared";
		double bal=getAmt();
		if(amt<0) return "amt can't be negative"; 
		if(amt<=bal&&bal>0){
			bal=bal-amt;
			
			setAmt(bal);
			res="deposited";
		}
		else if(amt>bal){
			setAmt(0);
			res="deposited";
		}
		return res;
	}
	

}
