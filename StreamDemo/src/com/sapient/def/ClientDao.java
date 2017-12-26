package com.sapient.def;

import java.util.Arrays;
import java.util.List;

public class ClientDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDao dao = new DaoImpl2();
		List <String> lst = Arrays.asList("ram","tom","sam");
		dao.m3(lst);
	}

}
