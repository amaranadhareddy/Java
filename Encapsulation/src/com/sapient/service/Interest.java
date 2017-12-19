package com.sapient.service;

public class Interest {
	private double amt;
	private int years;
	private float rate;
	
	public void setAmt(double amt)throws Exception{
		if(amt<=5000)
			throw new Exception("amount must be greater than 5000");
		this.amt=amt;
	}
	public void setYears(int years)throws Exception{
		if(years<=0 || years>=30)
			throw new Exception("years must be between 0 and 30");
		this.years=years;
	}
	public void setRate(float rate)throws Exception{
		if(rate<=0 || rate>1)
			throw new Exception("amount must be greater than 5000");
		this.rate=rate;
	}
	public double calcSimple(){
		double si = amt * years * rate;
		return si;
	}
	
	public double calcCompound(){
		double ci = amt * Math.pow((1+rate), years);
		return ci;
	}

	

}
