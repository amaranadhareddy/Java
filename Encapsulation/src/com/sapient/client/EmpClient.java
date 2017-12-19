package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {
	public static void main(String[] args) {
		Emp emp = new Emp();
		try{
			emp.setName("amar");
			emp.setAge(240);
			System.out.println(emp.getName()+" "+emp.getBusUnit()+" "+emp.getAge());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
