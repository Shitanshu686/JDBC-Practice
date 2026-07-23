package com.jdbc.practice;
import java.sql.*;
public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "");
			DatabaseMetaData db=con.getMetaData();
			System.out.println("Database : "+db.getDatabaseProductName());
			System.out.println("Version : "+db.getDatabaseProductVersion());
			System.out.println("Driver : "+db.getDriverName());
			System.out.println("Driver Version : "+db.getDriverVersion());
			System.out.println("URL : "+db.getURL());
			System.out.println("User : "+db.getUserName());
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
