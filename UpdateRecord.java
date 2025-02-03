package com.ty;
import java.sql.*;

public class UpdateRecord 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?";
		String username = "root";
		String password = "root";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			
			String query = "update student.demo set address='Fondshiras' where id=?";
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,6);
			pstmt.executeUpdate();
			System.out.println("Record updated....!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception handled......!");
		}
	}

}
