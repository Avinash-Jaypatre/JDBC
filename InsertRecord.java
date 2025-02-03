import java.sql.*;

public class InsertRecord
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306?";
		String username = "root";
		String password = "root";
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			
			String query ="insert into student.demo(name,salary,address,mobile) values('Avinash',23000,'Baramati',7869786958)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.executeUpdate();
			System.out.println("Record inserted.....!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception handled....!");
		}
	}
}
