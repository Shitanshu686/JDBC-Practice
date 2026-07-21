package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class UpdateEmployee {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			Statement st=con.createStatement();
			String sql="UPDATE employee SET salary=50000 WHERE id=101";
			int rows=st.executeUpdate(sql);
			System.out.println(rows+ " Record Updated");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
