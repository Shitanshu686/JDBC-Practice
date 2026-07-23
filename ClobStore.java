package com.jdbc.practice;

import java.io.FileReader;
import java.sql.*;

public class ClobStore {

	public static void main(String[] args) {
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "");
			PreparedStatement ps=con.prepareStatement("insert into documents values(?,?)");
			ps.setInt(1, 1);
			
			FileReader fr=new FileReader("D:\\notes.txt");
			ps.setClob(2,fr);
			ps.executeUpdate();
			
			System.out.println("Text Stored");
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
