package com.bcits.jdbcapp.common;

public class MainMethodclass {
	public static void main(String[] args) {
		String dbUrl="one";
		Connection con=DriverManager.getConnection(dbUrl);
		con.toString();
		con.print();
		
	}

}
