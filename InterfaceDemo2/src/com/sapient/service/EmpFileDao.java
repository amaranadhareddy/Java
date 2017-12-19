package com.sapient.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {
	EmpFileDao() {
		// Instance can't be created in other package
	}
	@Override
	public List<String> viewEmployee() {
		List<String> lst = new ArrayList<String>();
		String str = null;
		try{
			System.out.println("emp file dao");
			FileReader fr = new FileReader("emp.txt");
			BufferedReader br = new BufferedReader(fr);
			while((str = br.readLine()) != null){
				lst.add(str);
			}
			br.close();
			fr.close();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return lst;
	}

}
