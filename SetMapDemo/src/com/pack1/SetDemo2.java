package com.pack1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1001,"ram",1000);
		Emp e2 = new Emp(1002,"amar",2000);
		Emp e3 = new Emp(1003,"shayam",3000);
		Emp e4 = new Emp(1005,"bob",5000);
		Emp e5 = new Emp(1004,"tom",4000);
		Emp e6 = new Emp(1005,"ravi",6000);
		Emp e7 = e2;
		
		Set<Emp> set = new HashSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);//ignored based on the ref
		set.add(e7);
		for(Emp emp:set){
			System.out.println(emp);
		}
		
	}

}
