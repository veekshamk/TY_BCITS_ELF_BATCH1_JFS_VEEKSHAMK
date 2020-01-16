package com.bcits.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertion {
	public static void main(String[] args) {
		Connection con=null;
		int rs=0;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl="jdbc:mysql://localhost:3306/test?user=root&password=root";
			//try {
				con = DriverManager.getConnection(dburl);
		//	} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
			
			//3. Issue SQL queries via connection.
			String query = "insert into employee_info values(?,?) ";
			pstmt = con.prepareStatement(query);
		//	rs = pstmt.executeUpdate();
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
		//	pstmt.setInt(3, Integer.parseInt(args[2]));
			rs=pstmt.executeUpdate();
			
			if(rs!=0) {
				System.out.println("num of rows affected:"+rs);
			}else {
				System.err.println("data not found");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
