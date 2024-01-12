import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;



public class TestCallableDemo1 {

	/*
	 * 
	 * DELIMITER $$
create  procedure getSum(IN num1 int, IN  num2 int,  
OUT  result int)
begin
SET result = num1+num2;
end $$
DELIMITER ;
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
Connection	 connection=	
			DriverManager.
	getConnection("jdbc:mysql://localhost:3306/CSJ30DB1","root","root");
	
CallableStatement cst=connection.prepareCall("{call getSum(?,?,?)}");
  cst.setInt(1, 100);
  cst.setInt(2, 700);
  cst.registerOutParameter(3, Types.INTEGER);
  cst.execute();
  int result=cst.getInt(3);
  System.out.println(result);
	CallableStatement cst1=connection.prepareCall("{call getCustomer1(?,?,?,?)}");

	cst1.setInt(1, 2);
	cst1.registerOutParameter(2, java.sql.Types.VARCHAR);
	cst1.registerOutParameter(3, JDBCType.VARCHAR);
	cst1.registerOutParameter(4, JDBCType.BIGINT);
	cst1.execute();
	String name=cst1.getString(2);
	String address=cst1.getString(3);
	long ph=cst1.getLong(4);
	System.out.println(name + " "+address+ " "+ph);

	
	
	
		 }catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	
	}

}
