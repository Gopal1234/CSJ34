import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcConnectuonDemo2 {

	public static void main(String[] args) throws SQLException {
Connection connection=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	 connection=	
			DriverManager.
	getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		Statement st=connection.createStatement
				(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 ResultSet rs=st.executeQuery("select * from student_table");
		rs.absolute(3);
		rs.updateString("student_address", "PUNE");
		rs.updateRow();
		 }catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			connection.close();
		}
		
		
		
		

	}

}
