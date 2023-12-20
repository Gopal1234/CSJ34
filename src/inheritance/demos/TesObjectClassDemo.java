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
	//overriden toString()
	public String toString()
	{
		return empName+ " "+empId;
	}
	 //override hashCode()
	//overriden hashCode()
	public int hashCode()
	{
		return empId*2;
	}
	//overriding equals() method
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		Emp e=(Emp)obj;
		if((e.empId==this.empId) &&
				(e.empName.equals(this.empName)))
		{
			return true;
		}
		return false;
		
	}
	
}
public class TesObjectClassDemo {

	public static void main(String[] args) {

Emp obj1=new Emp(108,"A");
System.out.println(obj1.hashCode());
Emp obj2=new Emp(108,"A");
//System.out.println(obj1.equals(obj2));
String msg=obj1.equals(obj2)?"both objects are same":"not same";
System.out.println(msg);
/*if(obj1.equals(obj2))
{
	System.out.println("both object content are same");
}
else
{
	System.out.println("not same");
}*/
System.out.println(obj2.hashCode());
String s1="A";
String s2="A";
System.out.println(s1.hashCode()+ " "+s2.hashCode());


	}

}
