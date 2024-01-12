package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
static Connection connection=null;
	public static Connection getDBConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=	
				DriverManager.
				getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
			}catch(Exception e)
		{
			System.out.println(e);		
		}
		return connection;
	}
	

}
