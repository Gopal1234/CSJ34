package inheritance.demos;

/*
 * Cloneable is a marker interface
 * by default java objects are not cloneable
 * So to clone the object of the class we  have to mark 
 * that
 * class using Cloneable interface
 * Cloneable interface resides inside java.lang package
 * 
 * 
 * 
 */
class Laptop implements Cloneable
{
	private String brand;
 private	double price;
 public Laptop(String b, double p)
 {
	 brand=b;
	 price=p;
 }
@Override
public String toString() {
	return brand + "  "+price;
}
 public Object copyMyObject()
 {
	 Object obj=null;
	 try
	 {
 obj= super.clone();
	 }catch(CloneNotSupportedException e)
	 {
		 System.out.println(e.getLocalizedMessage());
	 }
	 return obj;
 }
public Laptop() {
	
}

}
public class TestCloneDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
Laptop laptop=new Laptop("DELL", 56000.00);
System.out.println(laptop);
Laptop clonedLaptop=(Laptop) laptop.copyMyObject();
System.out.println(clonedLaptop);
//getClass() method return a Class type
Class c= laptop.getClass();
System.out.println(c.getName());
Laptop obj3=(Laptop) c.newInstance();
System.out.println(obj3);
	}

}
