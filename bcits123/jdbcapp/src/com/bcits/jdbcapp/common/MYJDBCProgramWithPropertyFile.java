package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MYJDBCProgramWithPropertyFile {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		// 1. Load the Driver.

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl="jdbc:mysql://localhost:3306/employee_management_info";
			FileInputStream file=new FileInputStream("db.properties");
			Properties prop=new Properties();
			prop.load(file);

			con = DriverManager.getConnection(dburl, prop);


			String query = "select * from employee_primary_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			//4. Process the result returned by SQL Queries.

			while (rs.next()) {
				int emp_id = rs.getInt("emp_id");
				String name = rs.getString("name");
				long mobile_number = rs.getLong("mobile_number");
				String official_mail_id = rs.getString("official_mail_id");
				Date dob = rs.getDate("dob");
				Date doj = rs.getDate("doj");
				String designation = rs.getString("designation");
				String blood_group = rs.getString("blood_group");
				Double salary = rs.getDouble("salary");
				int dept_id = rs.getInt("dept_id");
				int manager_id = rs.getInt("manager_id");

				System.out.println("Employee ID->" + emp_id);
				System.out.println("Name->" + name);
				System.out.println("Mobile Number->" + mobile_number);
				System.out.println("Official Mail ID->" + official_mail_id);
				System.out.println("DOB->" + dob);
				System.out.println("DOJ->" + doj);
				System.out.println("Designation->" + designation);
				System.out.println("Blood Group->" + blood_group);
				System.out.println("Salary->" + salary);
				System.out.println("Department ID->" + dept_id);
				System.out.println("Manager ID->"+manager_id);

			}
		} catch (Exception s) {
			System.out.println("3333333333333");
			s.printStackTrace();

		}finally {
			//5. Close all JDBC objects

			try {
				if(con!=null) {
					con.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}//End of inner try-catch block
		}//End of Finally

	}// End of Main

}// End of Class
