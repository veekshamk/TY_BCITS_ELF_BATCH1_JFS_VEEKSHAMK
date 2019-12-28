package com.bcits.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJBDBCProgram {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		// 1. Load the Driver.
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);

			// 2. Get the DB connection via Driver

			String dburl = "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			
			//3. Issue SQL queries via connection.
			String query = "select * from employee_primary_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			//4. Process the result returned by SQL Queries
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

				System.out.println("employee id->" + emp_id);
				System.out.println("name->" + name);
				System.out.println("mobile_number->" + mobile_number);
				System.out.println("official_mail_id->" + official_mail_id);
				System.out.println("dob->" + dob);
				System.out.println("doj->" + doj);
				System.out.println("designation->" + designation);
				System.out.println("blood_group->" + blood_group);
				System.out.println("salary->" + salary);
				System.out.println("dept_id->" + dept_id);
				System.out.println("manager_id->+manager_id");

			}
		} catch (SQLException s) {
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
			} catch (SQLException e) {
				e.printStackTrace();
			}//End of inner try-catch block
		}//End of Finally

	}// End of Main

}// End of Class
