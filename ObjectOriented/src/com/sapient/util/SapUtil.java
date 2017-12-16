package com.sapient.util;

public class SapUtil {
	
	public static double roundUp2Dec(double val){
		val = Math.round(val*100)/(double)100;
		return val;
	}

}
