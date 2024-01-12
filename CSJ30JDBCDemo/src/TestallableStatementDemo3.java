import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.Types;

public class TestallableStatementDemo3 {

	public static void main(String[] args) {
   try
   {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection	 connection=	
					DriverManager.
			getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		
		 CallableStatement cs=connection.prepareCall("{call getAddressById(?,?)}");
		 cs.setInt(1, 2);
		 cs.registerOutParameter(2, JDBCType.VARCHAR);
		 cs.execute();
		 String addr=cs.getString(2);
		
		System.out.println(addr);
		
		
		
		
		
		
		
		
		
		
		
   }
   catch(Exception e)
   {
	   System.out.println(e);   }
	}

}
