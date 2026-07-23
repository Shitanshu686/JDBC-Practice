package com.jdbc.practice;
import java.sql.*;

public class TransactionManagement {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "");
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.executeUpdate("insert into employee values(301,'Shitanshu',40000)");
			st.executeUpdate("insert into employee values(302,'Amit',45000)");
			
			con.commit();
			System.out.println("Transaction Successful");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
