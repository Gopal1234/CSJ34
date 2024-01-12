import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestJdbcImg {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		Reader reader=new FileReader("./src/dbConfig.properties");
		Properties p=new Properties();
		p.load(reader);
	String driverName=p.getProperty("driver");
	String url=p.getProperty("url");
	String uname=p.getProperty("user");
	String pw=p.getProperty("password");
	System.out.println(driverName+ " "+url+ " "+uname+ " "+pw);
   Class.forName(driverName);
   Connection con=DriverManager.getConnection(url,uname, pw);
   
	System.out.println("connected");
		
		/*FileInputStream fin=new FileInputStream("D://indigo-logo.png");
		String company_name="Indigo";
		String inser_query="insert into company_table values(?,?)";
		PreparedStatement  ps=con    .prepareStatement(inser_query);
		ps.setString(1, company_name);
		ps.setBinaryStream(2, fin);
		int status=ps.executeUpdate();
		if(status>0)
		{
			System.out.println("inserted");
			
			
			
			
			
			
		}*/
		FileOutputStream fout=new FileOutputStream("D://logo1.png");
	PreparedStatement ps=	con.prepareStatement("select company_logo from company_table where company_name=?");
	
	ps.setString(1, "Indigo");
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
	byte[] byteArray=	rs.getBytes(1);
	fout.write(byteArray);
	System.out.println("file written");
	
	
	
	
	}
	
	
	
	
	
	
	
	}

}
