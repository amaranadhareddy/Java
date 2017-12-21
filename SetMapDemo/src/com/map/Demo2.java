package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1001, "ram");
		map.put(1002, "shyam");
		map.put(1001, "tom");//replaces ram
		map.put(1003, "bob");
		map.put(1001, "varun");//replaces tom
		map.put(null, "sai");
		System.out.println("iterating using keySet()");
		Set<Integer> set = map.keySet();
		for(Integer key:set){
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("iterating using values()");
		Collection<String> col = map.values();
		for(String str:col){
			System.out.println(str);
		}
		
		System.out.println("iterating using entrySet()");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry e:entries){
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
