package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pack1.Emp;

public class Demo1 {
	public static void main(String []args){
		Emp e1 = new Emp(1001,"ram",1000);
		Emp e2 = new Emp(1002,"amar",2000);
		Emp e3 = new Emp(1003,"shayam",3000);
		Map<Integer, Emp> map = new HashMap<Integer, Emp>();
		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter emp id:");
		int eid = scan.nextInt();
		if(map.containsKey(eid)){
			Emp e = map.get(eid);
			System.out.println(e);
		}else {
			System.out.println("not found");
		}
			
	}
}
