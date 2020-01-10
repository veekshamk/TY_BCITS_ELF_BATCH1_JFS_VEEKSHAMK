package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class InsertQuery {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		int i=0;

		//1. Load Driver
		try {
			//FileInputStream fileInputReader=new FileInputStream("dbinfo.properties");
			//Properties properties=new Properties();
			//properties.load(fileInputReader);

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl="jdbc:mysql://localhost:3306/employee_management_info";
			FileInputStream fileInputReader=new FileInputStream("db.properties");
			Properties prop=new Properties();
			prop.load(fileInputReader);
			con=DriverManager.getConnection(dburl, prop);

			  String query=" insert into employee_primary_info values "
					+ " (12, 'prathiksha', 1234567891,'prathiksha@gmail.com','1990-10-10',"
					+ "'2020-12-08', 'tester','o-', 10000, 20, 50)";
			//String query=" insert into employee_proj_info values(12,15)";
			stmt=con.createStatement();

			i=stmt.executeUpdate(query);
			System.out.println("Number of rows effected:"+i);




			/*} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
