import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pack.Emp;

public class TestJDBCDemo1 {

	public static void main(String[] args) throws SQLException
			 {
//step 1: we have to load a driver or register a driver
//static Class forName(String str)throws ClassNotFoundException
	/*Class c=	Class.forName("pack.Emp");	
	Emp eObj=(Emp)	c.newInstance();
	eObj.display();	*/
		Connection con=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql driver loaded");	
		
//setp 2: estabilish connection
	//static Connection getConnection(String path, String userName, String pw)throws SqlException
	 con=DriverManager.
			getConnection
	("jdbc:mysql://localhost:3306/CSJ34DB","root","root");
	Scanner s=new Scanner(System.in);
	String choice=null;
	do
	{
	System.out.println("Enter user name");
	String uname=s.next();
	System.out.println("enter user password");
	String pw=s.next();
		System.out.println
		("connection estabilished"+ " "+con);
  //insert one record to the DB 
String sqlInserQuery=
"insert into UserDetails values('"+uname+"'"+",'"+pw+"')";	
   //Now creating object of Statement
/*
 * Statement is an interface in JDBC API
 */
// Statement createStatement()
	Statement stmt=	 con.createStatement();
	//int executeUpdate(String sqlQuery)throws SqlException
	int status=stmt.executeUpdate(sqlInserQuery);
		System.out.println(status + " "+"row inerted");
		System.out.println("do you want to continue..say YES/NO");
		choice=s.next();
	}while(!(choice.equalsIgnoreCase("NO")));
		}catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you ...");
			con.close();
		}
	}

}
