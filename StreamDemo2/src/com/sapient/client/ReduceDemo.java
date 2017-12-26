package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"ram",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		double totsal = lst.stream().map(e->e.getEsal()).reduce((double) 0,(sal1,sal2)->sal1+sal2);
		System.out.println(totsal);
		
		/*
		 double totsal = lst.stream().mapToDouble(e->e.getEsal()).sum();
		 */
	}

}
