package com.jdbc.practice;

import java.io.*;
import java.sql.*;

public class BlobRetrieve {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
	                "root",
	                "");
			PreparedStatement ps =con.prepareStatement("select image from images where id=?");
			ps.setInt(1, 1);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Blob b=rs.getBlob(1);
				byte data[]=b.getBytes(1, (int)b.length());
				FileOutputStream fos=new FileOutputStream("D:\\output.jpg");
				
				fos.write(data);
				fos.close();
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
