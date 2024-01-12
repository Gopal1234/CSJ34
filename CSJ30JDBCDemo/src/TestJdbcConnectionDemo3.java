import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcConnectionDemo3 {

	public static void main(String[] args) throws SQLException {

		Connection connection=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	 connection=	
			DriverManager.
	getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		Statement st=connection.createStatement();
		//If I want group all stduent based on student address		
		 ResultSet rs=st.
				 executeQuery(
		"select count(student_roll) as roll, student_address from student_table  group by student_address");
		 while(rs.next())
		 {
			 int no=rs.getInt("roll");
			 String address=rs.getString("student_address");
			 System.out.println(no + " "+address);
		 }
		
		 
		 
		 
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		finally {
			connection.close();
		}
		
		
		

	}

}
