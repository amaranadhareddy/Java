package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SumAvg {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select sum(sal) totsal, avg(sal) avgsal, count(eid) totemp from employee12 ";
		PreparedStatement st = conn.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			/*System.out.println("sum="+rs.getDouble(1));
			System.out.println("avg="+rs.getDouble(2));
			System.out.println("count="+rs.getInt(3));*/
			System.out.println("sum="+rs.getDouble("totsal"));
			System.out.println("avg="+rs.getDouble("avgsal"));
			System.out.println("count="+rs.getInt("totemp"));
			
		}
		conn.close();
	}
}
