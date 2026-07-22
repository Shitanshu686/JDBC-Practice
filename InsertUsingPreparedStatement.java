package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			String query="INSERT INTO employee VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 104);
			ps.setString(2,"Rohit");
			ps.setDouble(3, 45000);
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Employee Inserted Successfully");
			}
			else {
				System.out.println("Insertion Failed");
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
