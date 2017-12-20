package com.sapient.service;

public interface Basic {
	
	String convert2Binary(int num);
	
	public default  int doSum(int ...a){
		int sum = 0;
		for(int var: a)
			sum+=var;
		return sum;
	}
	
	public default double doAvg(int ...b){
		int sum = doSum(b);
		double avg = sum/b.length;
		return avg;
	}
}
