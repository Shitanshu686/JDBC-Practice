package com.jdbc.practice;
import java.sql.*;
public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM employee");
			ResultSetMetaData md=rs.getMetaData();
			System.out.println("Total Columns :  "+md.getColumnCount());
			for(int i=1;i<md.getColumnCount();i++)
			{
				System.out.println("Column Name : "+md.getColumnName(i));
				System.out.println("Column Type : "+md.getColumnTypeName(i));
				System.out.println("-------------------------");
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
