package com.bcits.deletion;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Deletion {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		int i=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/employee_management_info";
			FileInputStream fileInputStream=new FileInputStream("db.properties");
			Properties prop=new Properties();
			prop.load(fileInputStream);
			con=DriverManager.getConnection(dburl, prop);

			String query=" delete from employee_primary_info name='shaarvi' ";
			//String query=" update employee_proj_info set emp_id=6 where emp_id=5";
			stmt=con.createStatement();
			i=stmt.executeUpdate(query);
			System.out.println("Number of rows effected:"+i);



		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}



