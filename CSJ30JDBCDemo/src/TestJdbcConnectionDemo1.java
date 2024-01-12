import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcConnectionDemo1 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {

//load the driver
		//static Class forName(String str)thorws ClassNotFoundException
		//Unhandled exception type ClassNotFoundException
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		//Connection static getConnection(String, string,string)throws SqlException
		//Unhandled exception type SQLException
	Connection connection=	
			DriverManager.
			getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		System.out.println(connection);
		
		//I want store data in my student table
		//  Statement createStatement()
		/*
		 *1. ResultSet.TYPE_SCROLL_SENSETIVE
		 * 
		 * The constant indicating the type for 
		 * a ResultSet object that is scrollable and 
		 * generally sensitive
		 * to changes to the data that underlies the ResultSet.
		 * 
		 * ResultSet.TYPE_SCROLL_INSENSETIVE
		 * ii.The constant indicating the type for
		 *  a ResultSet object that is scrollable but 
		 *  generally not sensitive to 
		 * changes to the data that underlies the ResultSet.
		 * 
		 * ResultSet.CONCUR_READ_ONLY
		 * iii.The constant indicating the concurrency mode for
		 *  a ResultSet object that may NOT be updated.
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
Statement st	=	  connection.
createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
Scanner sc=new Scanner(System.in);
/*int status=0;
String ch=null;
do {
System.out.println("Enter roll no");
int roll=sc.nextInt();
System.out.println("Enter name");
String name=sc.next();
System.out.println("Enter phone ");
long phone=sc.nextLong();
System.out.println("Enter address");
String address=sc.next();


//"+id+""+","+"'"+name+"'
String sql="insert into student_table values"
		+ "("+roll+""+","+"'"+name+"'"+","+" "+phone+" "+","+"'"+address+"')";
//int executeUpdate(String sqlQuery)throws SqlException
 status=st.executeUpdate(sql);
System.out.println("Enter your choice");
 ch=sc.next();
}while(!ch.equalsIgnoreCase("NO"));
 if(status>0)
 {
	 System.out.println("data inserted sucessfully");
 }else
 {
	 System.out.println("not able insert");
 }
System.out.println("Enter roll no to update");
int rollNo=sc.nextInt();
System.out.println("Enter the phone number to update");
long phNo=sc.nextLong();
//UPDATE STUDENT_TABLE SET STUDENT_PHONE="+phNO+", WHERE STUDENT_ROLL="+rollNo+";
String sqlUpdate
="UPDATE STUDENT_TABLE SET STUDENT_PHONE="+phNo+" WHERE STUDENT_ROLL="+rollNo+"";	
		
int updateStatus=st.executeUpdate(sqlUpdate);
if(updateStatus>0)
{
	System.out.println("successfully updated");
}
else
{
	System.out.println("not able to update");
}
System.out.println("Enter the roll no to delete");
int rollToDelete=sc.nextInt();
		String  sqlDelete="delete from Student_table where Student_roll="+rollToDelete+"";
		int deleteStatus=st.executeUpdate(sqlDelete);
		if(deleteStatus>0)
		{
			
			System.out.println("deleted sucessfully");
		}else
		{
			System.out.println("not able to delete");
		}*/
		
		
		//How to fetch all data from student_table
	String fetchQuery="select * from student_table order by student_roll";
ResultSet rs=		st.executeQuery(fetchQuery);
while(rs.next())
{
	//int roll=rs.getInt("student_roll");
	int roll=rs.getInt(1);
	String name=rs.getString(2);
	long phone=rs.getLong(3);
	String address=rs.getString(4);
	System.out.println(roll + " "+name+ " "+phone+ " "+address);
	
}
System.out.println("*******");
while(rs.previous())
{
	int roll=rs.getInt(1);
	String name=rs.getString(2);
	long phone=rs.getLong(3);
	String address=rs.getString(4);
	System.out.println(roll + " "+name+ " "+phone+ " "+address);
}

	
String fetchQuey1="select distinct student_address from student_table";	
//based on roll number fetch the particular student details
ResultSet rs1=st.executeQuery(fetchQuey1);
while(rs1.next())
{
	String studentAddr=rs1.getString("student_address");
	System.out.println(studentAddr);
}
String fetchQuey2="select count(student_roll) as number_of_student from Student_table";


 ResultSet rs3=st.executeQuery(fetchQuey2);
 int no=0;
 while(rs3.next())
 {
 no=rs3.getInt("number_of_student");

 }
System.out.println(no); 

	}
	/*
	 * count(col_name)
	 * max(col_name)
	 * min(col_name)
	 * sum(col_name)
	 * avg(col_name)
	 * 
	 * 
	 * 
	 * 
	 */

	
}
