package com.bcits.jdbcapp.common;

public class MainMethodclass {
	public static void main(String[] args) {
		String dbUrl="one";
		Connection1 con=DriverManager1.getConnection(dbUrl);
		con.toString();
		con.print();
		
	}

}
