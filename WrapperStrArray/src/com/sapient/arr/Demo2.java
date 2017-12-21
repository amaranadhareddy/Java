package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = {"ram","amith","kumar","hari","venkat"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("length:"+arr.length );
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string to search");
		String str = scn.next();
		int res = Arrays.binarySearch(arr, str);
		if(res>=0){
			System.out.println("found at:"+res);
		}
		else System.out.println("not found");
	}

}
