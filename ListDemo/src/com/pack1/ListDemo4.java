package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {
	public static void main(String []args){
		List<String> lst =new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("vinod");
		lst.add("hari");
		lst.add("vamsi");
		System.out.println("iterating in forward direction");
		ListIterator<String> it = lst.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("iterating in ward direction");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}
}
