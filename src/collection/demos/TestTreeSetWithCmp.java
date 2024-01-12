package collection.demos;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class BankCustomer
{
	private String customerName;
	private long phoneNumber;
	private double balance;
	public BankCustomer(String customerName, long phoneNumber, double balance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "BankCustomer [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", balance=" + balance
				+ "]";
	}
	}//end of BankCustomer class

class SortCustomerByName implements Comparator<BankCustomer>
{

	@Override
	public int compare(BankCustomer c1, BankCustomer c2) {
      return c1.getCustomerName().compareTo(c2.getCustomerName());
    
		
	}
	
}//end of SortByCustomerName
class SortByBalance implements Comparator<BankCustomer>
{

	@Override
	public int compare(BankCustomer o1, BankCustomer o2) {
		if(o1.getBalance()>o2.getBalance())
		{
			return 1;
		}
		return -1;
	}
	
}

public class TestTreeSetWithCmp {

	public static void main(String[] args) {
	/*
	 * TreeSet(Comparator cmp)
	 * 
	 */
	//	Comparator cmp=new SortCustomerByName();
		Scanner sc=new Scanner(System.in);
		System.out.println("how to sort");
		String sortTechnique=sc.next();
		Comparator cmp=null;
		if(sortTechnique.equalsIgnoreCase("balance"))
		{
			cmp=new SortByBalance();
		}else if(sortTechnique.equalsIgnoreCase("name"))
		{
			cmp=new SortCustomerByName();
		}
		
		TreeSet<BankCustomer> ts=new TreeSet(cmp);
ts.add(new BankCustomer("Z", 12344L, 34500.00));
ts.add(new BankCustomer("A", 82344L, 54500.00));
ts.add(new BankCustomer("T", 92344L, 14500.00));
for( BankCustomer customer: ts)
{
	System.out.println(customer);
}

	}

}
