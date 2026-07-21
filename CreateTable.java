package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			Statement st=con.createStatement();
			String sql="CREATE TABLE employee("+
						"id INT PRIMARY KEY,"+
						"name VARCHAR(50),"+
						"salary DOUBLE)";
			st.executeUpdate(sql);
			System.out.println("Table Created Successfully");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
