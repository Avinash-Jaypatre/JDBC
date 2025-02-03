import java.sql.*;

public class CreateTable 
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
			Statement stmt = con.createStatement();
			
			String query = "create table student.demo(id int primary key auto_increment,name varchar(50) not null,salary double not null,address varchar(50) not null,mobile bigint not null)";
			
			stmt.execute(query);
			System.out.println("Table created.....!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception handled....!");
		}
	}
}
