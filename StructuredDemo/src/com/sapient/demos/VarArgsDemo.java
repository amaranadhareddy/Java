package com.sapient.demos;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4,5,6,7,8));
		
	}
	public static int sum(int... arr){
		System.out.println("var args called");
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}


