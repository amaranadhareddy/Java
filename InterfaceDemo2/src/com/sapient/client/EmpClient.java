package com.sapient.client;

import com.sapient.service.EmpUtil;
import com.sapient.service.Idao;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idao dao = EmpUtil.getDaoInstance();
		System.out.println(dao.viewEmployee());
	}

}
