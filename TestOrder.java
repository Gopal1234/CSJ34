import java.util.Scanner;

/*for every class compiler define no parameterized
 * constructor or default constructor to initialize the newly 
 * created object of the class
 * 
 * 
 * 
 * 
*/
 class Order {
	//memeber if the class
	//variable and method
	 /*
	  * Instance varaible or non static variable
	  * 1. instance varaible dependent on the object of the class to it's access
	  * 2.instance variable stored at heap memory area along with object of the class
	  * 3.the scope of the instance variable are avilable for entire class block
	  * 4. The value of the instance variable can not retain for the every object of the
	  * same class 
	  * 5. we always declare instance variable inside class block
	  * 6.we can use any access specifier with instance variable like
	  * public, private, protected ,<no-keyword>
	  * 7.instance variable can take value of it's default type
	  * if (int, long, short, byte)-->0
	  * for object null
	  * 
	  * 
	  * 
	  * 
	  */
	 
 int orderId;
	String orderName;
	double orderPrice;
	public void method1()
	{
		System.out.println(orderId);
	}
	public void method2()
	{
		System.out.println(orderPrice);
	}
	public void dislayMsg()
	{
		System.out.println("welcome to shop");	}
	
}// end of the Order class
public class TestOrder
{
	public static void main(String[] args) {
	/*
	 * here Order is class type
	 * orderObj is reference variable
	 * = is assignment operator
	 * new is keyword by which java created object of a class
	 * Order() is the default constructor calling to initialize the object of order class
	 * 
	 * 
	 * 
	 */
		Order orderObj1=new Order();
		
		System.out.println(orderObj1.orderId++);
		System.out.println(orderObj1.orderName);
		System.out.println(orderObj1.orderPrice);
		
		
		
		Order orderObj2=new Order();
		System.out.println(orderObj2.orderId++);
		System.out.println(orderObj2.orderName);
		System.out.println(orderObj2.orderPrice);
		
		Order orderObj3=new Order();
		
		System.out.println(orderObj3.orderId++);
		System.out.println(orderObj3.orderName);
		System.out.println(orderObj3.orderPrice);
		
		//setting value with the object of Order
		
		/*Scanner s=new Scanner(System.in);
		
		System.out.println("enter order id");
	//	int id=s.nextInt();
		orderObj.orderId=s.nextInt();
		System.out.println("enter order named");
		String name=s.next();
		orderObj.orderName=name;
		orderObj.orderPrice=343434.90;*/
		
		
		//accssing and printing the object data
	
	
		
		
		
		
	}
}