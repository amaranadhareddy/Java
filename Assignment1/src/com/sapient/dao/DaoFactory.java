package com.sapient.dao;

import java.util.ResourceBundle;
//these type of classes are called factory classes
public class DaoFactory {
	private static ResourceBundle rb;
	private static IDao dao; 
	static{
		rb = ResourceBundle.getBundle("sap");
		try{
			Class cls = Class.forName(rb.getString("cname"));//load the class explicitly
			dao = (IDao)cls.newInstance();//create instance
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
		
		
		public static IDao getDaoInstance(){
			return dao;
	}
}
