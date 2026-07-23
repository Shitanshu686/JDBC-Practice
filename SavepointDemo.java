import java.sql.*;
public class SavepointDemo{
	public static void main(String args[])
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "12345");
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.executeUpdate("insert into employee values(401,'A',20000)");
			
			Savepoint sp=con.setSavepoint();
			st.executeUpdate("insert into employee values(402,'B',25000)");
			con.rollback(sp);
			con.commit();
			
			System.out.println("Rollback to Savepoint");
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}