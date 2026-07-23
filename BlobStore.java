package com.jdbc.practice;

import java.io.FileInputStream;
import java.sql.*;

public class BlobStore {

	public static void main(String[] args) {
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			PreparedStatement ps=con.prepareStatement("insert into images values(?,?)");
			FileInputStream fis=new FileInputStream("C:\\Images\\photo.jpg");
			
			ps.setInt(1, 1);
			ps.setBlob(2, fis);
			ps.executeUpdate();
			
			System.out.println("Image Stored");
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
