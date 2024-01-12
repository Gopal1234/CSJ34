import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestInageDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
Reader reader=new FileReader("./src/dbCConfig.properties");
Properties p=new Properties();
/*
 * void load(Reader reader)
 * void load(InputStream stream)
 * 
 * 
 */
p.load(reader);
//String getProperty(String keyName)
String driverName=p.getProperty("driver");
System.out.println(driverName);
String url=p.getProperty("url");
String userName=p.getProperty("user");
String password=p.getProperty("password");
Class.forName(driverName);
Connection con=DriverManager.getConnection(url,userName,password);
System.out.println("connecction estabilished");
//Now I want to insert image file and compant name into table
/*String insertQuery="insert into company_profile values(?,?)";
InputStream input=new FileInputStream("D://indigo-logo.png");
PreparedStatement ps=con.prepareStatement(insertQuery);
ps.setString(1, "Indigo");
ps.setBinaryStream(2, input);
int status=ps.executeUpdate();
if(status>0)
{
	System.out.println("inserted");
}*/
OutputStream fout=new FileOutputStream("D://save-logo.png");
String fetchQuery="select company_image from company_profile where company_name=?";
PreparedStatement ps=con.prepareStatement(fetchQuery);
ps.setString(1, "Indigo");
 ResultSet rs=ps.executeQuery();
 while(rs.next())
 {
	byte[] img= rs.getBytes("company_image");
	//void write(byte[] byte)
	//void write(int )
	fout.write(img);
	System.out.println("file written successfully");
	 
	 
 }

		
		
		
		

	}

}
