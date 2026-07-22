package com.jdbc.practice;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class InsertMultipleRecords {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employee_db";
		String username="root";
		String password="12345";
		
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			String query="INSERT INTO employee VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter Number of Employees: ");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("\nEmployee "+i);
				
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter Salary: ");
				double salary=sc.nextDouble();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, salary);
				
				ps.executeUpdate();
				
			}
			System.out.println("\nAll Records Inserted Successfully.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
