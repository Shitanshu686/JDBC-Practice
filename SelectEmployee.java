package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SelectEmployee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee_db";
		String user="root";
		String password="12345";
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from employee");
			while(rs.next())
			{
				System.out.println(
						rs.getInt("id")+" "
						+rs.getString("name")+" "
						+rs.getDouble("salary")
						);
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
