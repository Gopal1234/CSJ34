import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.mysql.cj.xdevapi.PreparableStatement;

import utility.DBUtil;

public class TestJdbcConnectionDemo4 {

	public static void main(String[] args) throws IOException, SQLException {

		//creating File object
		//File is a class
		//in the constructor of the file class we are passing filepath as String
		
		File file=new File("D://order_data.txt");
		//Reader is abstract class to read the text files
		//Reader class implemented by several concrete class like
		/* FileReader(File fileObj)
		 * 
		 */
/*Reader reader=new FileReader(file);
/*
 * BufferedReader class provides some method to read a file or read input from console
 * BufferedReader maintain buffer memory which can read file stores into it's buffer memory
 * Srting readLine()throws IOException
 * 
 * 
 */
/*BufferedReader br=new BufferedReader(reader);
 String str=null;
 Connection connection=	DBUtil.getDBConnection();
 //String readlIne()throws IOException
while( (str=br.readLine())!=null)
{
 System.out.println(str);
 String[] strArray= str.split(",");
    int orderId=Integer.parseInt(strArray[0]);
	String orderName=strArray[1];
	double orderPrcie=Double.parseDouble(strArray[2]);
	LocalDate date=LocalDate.parse(strArray[3]);
	int custId=Integer.parseInt(strArray[4]);
		
	
	String inserQuery="insert into order_table values(?,?,?,?,?)";
	
	PreparedStatement ps= connection.prepareStatement(inserQuery);
	ps.setInt(1, orderId);
	ps.setString(2, orderName);
	ps.setDouble(3, orderPrcie);
	java.sql.Date d=java.sql.Date.valueOf(date);
	ps.setDate(4, d);
	ps.setInt(5, custId);
	int status=ps.executeUpdate();
	if(status>0)
	{
		System.out.println("inserted");
	}
	
}*/

	//I want to fetch customer_name,address, order_name, order_date from both table
		
String sqlQuery=
"select cust.customer_name,cust.address, o.order_name,o.order_date from customer_table cust inner join order_table o ON cust.customer_id=o.customer_id where cust.address=?";
		Connection connection=	DBUtil.getDBConnection();
	PreparedStatement ps=connection.prepareStatement(sqlQuery);
	ps.setString(1,"kolkata");
	ResultSet rs=ps.executeQuery();
	Writer writer=new FileWriter("D://orderInfo.txt",true);
	while(rs.next())
	{
		String name=rs.getString(1);
		String address=rs.getString(2);
		String oname=rs.getString(3);
		java.sql.Date d=rs.getDate(4);
		LocalDate dat=d.toLocalDate();
		//write(String str)
		writer.write(name);
		writer.write(" ");
		writer.write(address);
		writer.write(" ");
		writer.write(oname);
		writer.write(" ");
		writer.write(dat.toString());
	   writer.write("\n");
		
		System.out.println(name + " "+address+ " "+oname+ " "+dat);
	}
		writer.close();

	}

}
