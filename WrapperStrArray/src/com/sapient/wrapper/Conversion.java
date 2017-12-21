package com.sapient.wrapper;

public class Conversion {

	public static void main(String[] args) {
		int dec = 45;
		System.out.println("Binary:"+Integer.toBinaryString(dec));
		System.out.println("octal:"+Integer.toOctalString(dec));
		System.out.println("hexadec:"+Integer.toHexString(dec));
	}

}
