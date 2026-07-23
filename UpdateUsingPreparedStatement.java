package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			String query="UPDATE employee SET salary=? WHERE id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setDouble(1, 45000);
			ps.setInt(2, 101);
			int rows=ps.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("Employee Updated Successfully");
			}
			else
			{
				System.out.println("Employee Not Found");
				
			}
			ps.close();
			con.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


