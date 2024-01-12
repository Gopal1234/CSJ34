import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Type;



public class TestcallableDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
	Connection connection=	
			DriverManager.
			getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
		
	CallableStatement cst=connection.prepareCall("{call getSum(?,?,?)} ");
	cst.setInt(1, 100);
	cst.setInt(2, 200);
	cst.registerOutParameter(3, JDBCType.INTEGER);
	cst.execute();
	int result=cst.getInt(3);
	System.out.println(result);
	
	
	

	}

}
