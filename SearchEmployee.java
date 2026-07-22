package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class SearchEmployee {
	public static void main(String args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String query="SELECT * FROM employee WHERE id=102";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				System.out.println("ID : "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Salary : "+rs.getDouble("salary"));
			}
			else
			{
				System.out.println("Employee Not Found");
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
