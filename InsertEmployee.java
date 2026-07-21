package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployee {

	public static void main(String[] args) {
		String url="\"jdbc:mysql://localhost:3306/employee_db\"";
		String user="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st = con.createStatement();
			String query="INSERT INTO employee VALUES(101,'Shitanshu',35000)";
			int rows=st.executeUpdate(query);
			System.out.println(rows+ "Record Inserted Successfully");
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
