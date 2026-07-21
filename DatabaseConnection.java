package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection{
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
			{
				System.out.println("Database Connected Successfully");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}