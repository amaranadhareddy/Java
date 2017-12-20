package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AddEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scn  =new Scanner(System.in);
		System.out.println("enter emp id:");
		int empid = scn.nextInt();
		System.out.println("enter emp name:");
		String empname = scn.next();
		System.out.println("enter emp sal:");
		double sal = scn.nextDouble();
		System.out.println("enter dept id:");
		int deptid = scn.nextInt();
		System.out.println("enter doj(dd-MON-yyyy):");
		String doj = scn.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "insert into employee12  values(?,?,?,?,?) ";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, empid);
		st.setString(2, empname);
		st.setDouble(3, sal);
		st.setInt(4, deptid);
		st.setString(5, doj);
		int rows = st.executeUpdate();
		System.out.println(rows+" row effected");
		st.close();
}
}
