package collection.demos;

import java.util.TreeSet;

class PhoneBook implements Comparable
{
	private int slNo;
	private String custName;
	private long custNumber;
	private String city;
	public PhoneBook(int slNo, String custName, 
			long custNumber, String city) {
		super();
		this.slNo = slNo;
		this.custName = custName;
		this.custNumber = custNumber;
		this.city = city;
	}
	@Override
	public String toString() {
		return "PhoneBook [slNo=" + slNo + ", custName=" + custName + ", custNumber=" + custNumber + ", city=" + city
				+ "]";
	}
	@Override
	public int compareTo(Object obj) {
		//downcast into child type
		PhoneBook ph=(PhoneBook)obj;
		if(this.slNo>ph.slNo)
		{
			return 1;
		}
		return -1;
	}
	
	
}



public class TestSetDemo5 {

	public static void main(String[] args) {

TreeSet<PhoneBook> ts=new TreeSet();
ts.add(new PhoneBook(10, "B", 123456, "Kolkata"));
ts.add(new PhoneBook(8, "A", 873456, "Pune"));
ts.add(new PhoneBook(9, "C", 983456, "Mumbai"));
ts.add(new PhoneBook(12, "T", 653456, "Delhi"));

for( PhoneBook book :ts  )
{
	System.out.println(book);
}



	}

}
