package com.pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo5 {

	public static void main(String[] args) {
		List<String> lst =new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("vinod");
		lst.add("hari");
		lst.add("vamsi");
		System.out.println(lst);
		lst.add(2, "mohit");
		System.out.println(lst);
		System.out.println(lst.remove(3));
		System.out.println(lst);
		System.out.println(lst.remove("peter"));
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println("get element at index 2:"+ lst.get(2));
		
		List<String> lst2 = new ArrayList<String>();
		lst.add("varun");
		lst.add("tarun");
		lst2.addAll(lst);
		System.out.println(lst2);
	}

}