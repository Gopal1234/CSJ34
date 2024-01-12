import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import utility.DBUtil;

public class TestResuktSetType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Connection con=DBUtil.getDBConnection();
	Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	//String fetchQuery="select * from ProductDetails";
	ResultSet rs=stmt.executeQuery("select * from ProductDetails");
	int countRows=1;

	while(rs.next())
	{
		System.out.println(rs.getInt(1)+ " "+rs.getString(2));
		if(countRows==2)
		
			Thread.sleep(45000);
		
		countRows++;
	}
	//rs.close();
	//stmt.close();
	//con.close();
	
	
}catch(Exception e)
{
	System.out.println(e);
}
	}

}
