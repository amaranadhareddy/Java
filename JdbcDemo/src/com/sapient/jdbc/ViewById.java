package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewById {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scn  =new Scanner(System.in);
		System.out.println("enter emp id:");
		int empid = scn.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select * from employee12 where eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, empid);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getInt("dept_id"));
			System.out.println(rs.getDate("doj"));
			System.out.println("-------------------------");
		}
		conn.close();
	}
}

