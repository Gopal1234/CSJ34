package inheritance.demos;
class Emp
{
	private int empId;
	private String empName;
	public Emp(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	//overriding toString() method object
	/*
	 * toString() is the method of Object class 
	 * which returns
	 * String
	 * we can override toString() into our own class 
	 * to convert the content of the object into string
	 * 
	 * How to call toString()
	 * once we call println() method , internally it 
	 * calls toString()
	 * method of the Object class
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public String toString()
	{
		return empName+ " "+empId;
	}
	//override hashCode()
	
}
public class TesObjectClassDemo {

	public static void main(String[] args) {

Emp obj=new Emp(108,"A");
System.out.println(obj);

	}

}
