package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("ram");
		set.add("shyam");
		set.add("Amar");
		set.add("surya");
		set.add("bean");
		set.add("ram");//ignoring duplicates
		for(String str:set){
			System.out.println(str);
		}
	}

}
