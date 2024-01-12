package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import model.Customer;
import service.CustomerService;
import utility.DBUtil;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer addCustomer(Customer customer) {
		Connection connection=null;
		int status=0;
		try
		{
   connection=DBUtil.getDBConnection();
  String sqlInsertQuery=
		  "insert into customer_table(customer_name,address,phone,customer_dob) values(?,?,?,?)";
  
  //PreparedStatement prepareStatement(String sql)throws SqlException
 PreparedStatement ps=    connection.prepareStatement(sqlInsertQuery);
  ps.setString(1, customer.getCustomerName());
  ps.setString(2, customer.getAddress());
  ps.setLong(3, customer.getPhone());
  java.sql.Date d=Date.valueOf(customer.getDob());
  ps.setDate(4, d);
  status=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(status>0)
		{
		return customer;
		}
		return null;
	}

	//This method will fetch all details about customer from database
	//bind with List object 
	//return that list
	@Override
	public List<Customer> getAllCustomer() {
		Connection connection=null;
		List<Customer> listOfCustomer=new ArrayList();
		try
		
		{
			connection=DBUtil.getDBConnection();
PreparedStatement ps=connection.prepareStatement("select * from customer_table");
	 ResultSet rs=  ps.executeQuery();		
	while(rs.next())
	{
		int id=rs.getInt("customer_id");
		String name=rs.getString(2);
		String address=rs.getString(3);
		long phone=rs.getLong(4);
		java.sql.Date dob=rs.getDate(5);
		//converting sql date into LocalDate
	LocalDate dob1=	      dob.toLocalDate();
		
		Customer customer=new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setPhone(phone);
		customer.setAddress(address);
		customer.setDob(dob1);
		listOfCustomer.add(customer);
		}//end of the while loop
			}//end of the try block
		catch(Exception e)
		{
			System.out.println(e);
		}//end  of the catch block
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end of the finally block

return listOfCustomer;
	}//end of the method

	@Override
	public int updateCustomer(int customerId, Customer newCustomer) {
Connection coonection=null;
int status=0;
  try
  {
	 Connection connection= DBUtil.getDBConnection();
	 String upadteQuery="updat customer_table set address=?, phone=? where customer_id=?";
  PreparedStatement ps=connection.prepareStatement(upadteQuery);
ps.setString(1,newCustomer.getAddress() );
	ps.setLong(2,newCustomer.getPhone());
	ps.setInt(3, customerId);
	status=ps.executeUpdate();
	  
  }catch(Exception e)
  {
	  
  }
		
return status;
	}

	@Override
	public int deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int customerId) {
Connection connection=null;
Customer customer=null;
try
{  
connection=	DBUtil.getDBConnection();
String fetchQuery="select * from customer_table where customer_id=?";
PreparedStatement  ps=        connection.prepareStatement(fetchQuery);	
ps.setInt(1, customerId);
  ResultSet rs=    ps.executeQuery();
if(rs.next())
{
	int id=rs.getInt("customer_id");
	String name=rs.getString(2);
	String address=rs.getString(3);
	long phone=rs.getLong(4);
	java.sql.Date dob=rs.getDate(5);
	//converting sql date into LocalDate
LocalDate dob1=	      dob.toLocalDate();
	
 customer=new Customer();
	customer.setCustomerId(id);
	customer.setCustomerName(name);
	customer.setPhone(phone);
	customer.setAddress(address);
	customer.setDob(dob1);
}
}catch(Exception e)
{
System.out.println(e);	
}
		return customer;
	}

}
