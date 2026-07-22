package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEmployee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String query="DELETE FROM empolyee WHERE id=102";
			int rows=st.executeUpdate(query);
			if(rows>0)
				System.out.println("Employee Deleted Successfully");
			else
				System.out.println("Employee not found");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
