package com.sapient.arr;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		String[] arr1 = {"ram","amith","kumar","hari","venkat"};
		String[] arr2 = new String[arr1.length];
		System.arraycopy(arr1, 1, arr2, 0, 3);
		System.out.println(Arrays.toString(arr2));
	}

}
