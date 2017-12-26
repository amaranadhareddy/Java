package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		System.out.println("using method ref of println()");
		lst.stream().forEach(System.out::println);//for each uses consumer interface
		System.out.println("using lambda epression");
		lst.stream().forEach(s->System.out.println(s));
		
	}

}
