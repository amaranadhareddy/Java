package com.sapient.fp;



public class CaseClient {
/**
 * Demo - functional programming
 * @param args
 */
	public static void main(String[] args) {
		
		//ICase lower = s-> s.toLowerCase();
		//ICase upper = (String s)->{return s.toUpperCase();};
		display(s-> s.toLowerCase(),"RamA");
		display((String s)->{return s.toUpperCase();},"RamA");
	}
	
	public static void display(ICase obj, String str){
		String res = obj.changeCase(str);
		System.out.println(res);
	}
}
