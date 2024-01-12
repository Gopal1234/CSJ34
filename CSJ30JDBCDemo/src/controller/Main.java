package controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dao.CustomerServiceImpl;
import model.Customer;
import service.CustomerService;

public class Main {

	public static void main(String[] args) {

CustomerService service=new CustomerServiceImpl();
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String name=sc.nextLine();
System.out.println("enter your address");
String addr=sc.nextLine();
System.out.println("enter your phone number");
long phone=sc.nextLong();
sc.nextLine();
System.out.println("enter your dob YYYY-MM-DD");
String dob1=sc.nextLine();
		LocalDate dob2=LocalDate.parse(dob1);
		Customer customer=new Customer();
		customer.setCustomerName(name);
		customer.setPhone(phone);
		customer.setAddress(addr);
		customer.setDob(dob2);
		
	if(service.addCustomer(customer)!=null)
	{
		//System.out.println("congartulation"+ " "+customer.getCustomerName()+ " ");
		
List<Customer> listOfCustomer=		service.getAllCustomer();
	listOfCustomer.forEach(c->System.out.println(c));	
		
		
	}else
	{
		System.out.println("not able to insert");
	}
		
		
		
		

	}

}
