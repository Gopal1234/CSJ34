package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		//Connection static getConnection(String, string,string)throws SqlException
		//Unhandled exception type SQLException
	Connection connection=	
			DriverManager.
			getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		System.out.println(connection);
		
		Statement stament=
				connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=stament.executeQuery("select * from student_table");
		System.out.println("printing in forward direction");
		while(rs.next())
		{
			String address=rs.getString(4);
			
			System.out.println(address);	
		}
		
		System.out.println("printing in reverse order");
		rs.absolute(1);
		rs.updateString("student_address", "K");
		rs.updateRow();
		rs.absolute(4);
		rs.updateString("student_address", "D");
		rs.updateRow();
		while(rs.previous())
		{
			
		String address=rs.getString(4);
		System.out.println(address);
		}
		
		
		
		
		
	}

}
