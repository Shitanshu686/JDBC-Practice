package com.jdbc.practice;
import java.sql.*;

public class BatchProcessing {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			Statement st=con.createStatement();
			st.addBatch("insert into employee values(201,'Aman',35000)");
			st.addBatch("insert into employee values(202,'Rohit',40000)");
			st.addBatch("insert into employee values(203,'Neha',50000)");
			int result[]=st.executeBatch();
			System.out.println("Batch Executed Successfully");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
