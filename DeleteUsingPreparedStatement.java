package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteUsingPreparedStatement {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			String query="DELETE FROM employee WHERE id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 102);
			
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Employee Deleted Successfully");
			}
			else {
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
