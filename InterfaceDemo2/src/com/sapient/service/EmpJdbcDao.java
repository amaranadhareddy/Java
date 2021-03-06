package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpJdbcDao implements Idao{
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<String> viewEmployee() {
		System.out.println("jdbc dao");
		List<String> lst = new ArrayList<String>();
		Connection conn = null;
		try{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"system","sapient123");
			String sql = "select ename from employee12";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				lst.add(rs.getString("ename"));
			}
		}
		catch(SQLException ex){
			System.out.println(ex.getMessage());
		}finally{
			closeConn(conn);
		}
		
		return lst;
	}
	public void closeConn(Connection conn){
		if(conn!=null){
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}

}
