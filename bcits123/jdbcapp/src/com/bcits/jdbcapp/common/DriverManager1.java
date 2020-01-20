package com.bcits.jdbcapp.common;

public class DriverManager1 {
	private DriverManager1() {}
	public static Connection1 getConnection(String str) {
		//Some Business Logic
		Connection1 ref=null;
		if (str.equals("one")) {
			ref=new ClassA();
			
		}else {
			ref=new ClassB();
		}
		
		return ref;
	}//End of myMethod

}//End of Class
