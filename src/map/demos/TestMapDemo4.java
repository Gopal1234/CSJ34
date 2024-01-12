package map.demos;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Customer
{
	private int customerId;
	private String customerName;
	private long customerPhone;
	public Customer(int customerId,
			String customerName, 
			long customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + "]";
	}
	
	
}
public class TestMapDemo4 {

	public static void main(String[] args) {

HashMap<Integer, Customer> custDetails=new HashMap();
Scanner sc=new Scanner(System.in);
for(int i=0; i<3; i++)
{
	System.out.println("enter id for" + (i+1)+ " "+"customer");
	int id=sc.nextInt();
	System.out.println("enter customer name");
	String name=sc.next();
	System.out.println("enter customer phone");
	long ph=sc.nextLong();
	Customer c=new Customer(id,name,ph);
	custDetails.put(id, c);
}

	Set<Entry<Integer, Customer>> set= custDetails.entrySet();

	for(Entry<Integer,Customer> en:custDetails.entrySet())
	{
		int id=en.getKey();
		Customer custObj=en.getValue();
		System.out.println(id + "  -->"+custObj.getCustomerName()+ " "+custObj.getCustomerPhone());
		
	}
	
	
	}

}
