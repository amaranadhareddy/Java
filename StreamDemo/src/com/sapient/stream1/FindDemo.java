package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("amar", "venkat", "ram", "ravi", "vamsi", "maddy");
		Optional opt = lst.stream().filter(s->s.startsWith("r")).findAny();
		System.out.println(opt);
		if(opt.isPresent())
			System.out.println("element found: "+opt.get());
		else 
			System.out.println("element not found");
	}

}
