package controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dao.CustomerServiceImpl;
import model.Customer;
import service.CustomerService;

public class CustomerApp {

	public static void main(String[] args) {
	 CustomerService service=new CustomerServiceImpl();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter customer name");
	 String name=sc.next();
	 System.out.println("Enter customer address");
	 String address=sc.next();
	 System.out.println("Enter customer phone");
	 long ph=sc.nextLong();
	 System.out.println("Enter the dob in YYYY-MM-DD");
	 String db1=sc.next();
	 //LocalDate static parse(String str)
	 LocalDate dob=LocalDate.parse(db1);
	 Customer customer=new Customer();
	 customer.setCustomerName(name);
	 customer.setAddress(address);
	 customer.setPhone(ph);
	 customer.setDob(dob);
	Customer customerObj= service.addCustomer(customer);
	if(customerObj!=null)
	{
		System.out.println("congratulation "+ " "+customer.getCustomerName());
		
	List<Customer> list=	service.getAllCustomer();
		
		list.forEach(c->System.out.println(c));
		
		
		
		
		
	}else
	{
		System.out.println("not able to sign up");
	}
	 
	 
	 System.out.println("enter customer id to search");
	 int id=sc.nextInt();
Customer c=	 service.getCustomerById(id);
System.out.println(c);	 
System.out.println("enter customer id to update");
int idtoUpdate=sc.nextInt();
System.out.println("enter customer new address");
String newAddress=sc.next();
System.out.println("enter customer new phone number");
long newPhone=sc.nextLong();
Customer cust=new Customer();
cust.setAddress(newAddress);
cust.setPhone(newPhone);
int status    =service.updateCustomer(idtoUpdate, cust);
if(status>0)
{
	System.out.println("updated successfully");
}




	 
	 
	 
	 
	 
	 
	 

	}

}
