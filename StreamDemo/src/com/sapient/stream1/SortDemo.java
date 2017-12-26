package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {
	public static void main(String[] args){
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("amar");
		lst.add("shyam");
		lst.add("anand");
		lst.add("mohit");
		lst.add("ravi");
		System.out.println("ascending");
		Stream<String> s = lst.stream().sorted();
		s.forEach(System.out::println);
		System.out.println("descending");
		lst.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);;
	}
}