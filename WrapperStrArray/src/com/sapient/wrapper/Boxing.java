package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		Integer a = new Integer(10);//boxing
		Integer b = new Integer(20);//boxing
		int res = a.intValue()+b.intValue();//unboxing
		Integer c = Integer.valueOf(res);//boxing
		System.out.println(c.toString());
		
	}
}
