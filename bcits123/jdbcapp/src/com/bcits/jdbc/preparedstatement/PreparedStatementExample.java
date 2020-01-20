package com.bcits.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			//2.Get DB connection via Driver
			String dburl="jdbc:mysql://localhost:3306/employee_management_info";
			con=DriverManager.getConnection(dburl, "root", "root");

			//3.Issue SQL queries via Connection
			String qruery="select * from employee_primary_info "
					+ " where emp_id=?";
			pstmt=con.prepareStatement(qruery);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs=pstmt.executeQuery();

			//4.Process the result returned by SQL queries
			if(rs.next()) {
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
			}else {
				System.err.println("Employee Data Not Found in DB");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5. Close all JDBC objects

			try {
				if(con!=null) {
					con.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}                  
			} catch (Exception e) {
				e.printStackTrace();
			}//End of inner try-catch block
		}//End of Finally
	}
	//End of Main
}
//End of Class
