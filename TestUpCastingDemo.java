package inheritance.demos;
class X
{
	public void display()
	{
		System.out.println("employee info.....");
	}
	public void show1()
	{
		System.out.println("Hi");
	}
	
}
class Y extends X
{
	public void display()
	{
		System.out.println("employee task info.....");
	}
	public void show2()
	{
		System.out.println("Hello");
	}
	
}
public class TestUpCastingDemo {

	public static void main(String[] args) {

		//upcasting
		/*
		 * incase of upcasting we are initializing the object
		 * of child class into reference of parent type
		 * using upcasting we can able access and invoke the 
		 * overriden method of child class
		 * and we can invoke the non-overriden of parent class
		 * 
		 * 
		 */
   X parent=new Y();
   parent.display();
   parent.show1();
  ///parent.show2();
   /*downcasting is a technique by which we can initialize the 
    * reference of parent type into the child 
    * using the child object we can able invoke all methods of parent
    * and child
    * 
    * incase downcasting we need () (typecast operator)
    * 
    */
   Y child =(Y)parent;
   
   child.display();
   child.show1();
   child.show2();
   

	}

}
