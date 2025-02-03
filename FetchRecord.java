package com.ty;
import java.sql.*;

public class FetchRecord 
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306?";
		String username = "root";
		String password = "root";
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			stmt = con.createStatement();
			
			String query = "select * from student.demo";
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getLong(5));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception handled.....!");
		}
	}
}
