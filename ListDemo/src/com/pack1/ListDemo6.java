package com.pack1;

import java.util.Arrays;
import java.util.List;

public class ListDemo6 {

	public static void main(String[] args) {
		Integer arr[] = {5,10,15,20,25};
		List<Integer> lst = (List<Integer>)Arrays.asList(arr);
		System.out.println(lst);
	}

}
