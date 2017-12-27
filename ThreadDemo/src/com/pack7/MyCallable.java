package com.pack7;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=500;i++){
			sum+=i;
			System.out.println("callable running "+i);
		}
		return sum;
	}
	
}
