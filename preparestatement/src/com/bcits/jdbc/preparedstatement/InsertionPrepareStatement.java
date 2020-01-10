package com.bcits.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertionPrepareStatement {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rs=0;

		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			//2.Get DB connection via Driver
			String dburl="jdbc:mysql://localhost:3306/employee_management_info";
			con=DriverManager.getConnection(dburl, "root", "root");

			//3.Issue SQL queries via Connection
			//			String query=" insert into employee_primary_info "
			//					+ " values(?, 'prathiksha', 1234567891,'prathiksha@gmail.com',"
			//					+ " '1990-10-10', '2020-12-08', 'tester','o-', 10000, 20, 50)";
			//			String query=" update employee_primary_info set name='veekshaa' where name=?";

			//String query=" delete from employee_primary_info where emp_id=?";
			String query=" insert into department_info values(?,?,?) ";

			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setInt(3, Integer.parseInt(args[2]));
			rs=pstmt.executeUpdate();

			if(rs!=0) {
				System.out.println("Num of rows effected:"+rs);
			}else {
				System.out.println("Employee data is not found");
			}
			//4.Process the result returned by SQL queries

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5. Close all JDBC objects

			try {
				if(con!=null) {
					con.close();
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
