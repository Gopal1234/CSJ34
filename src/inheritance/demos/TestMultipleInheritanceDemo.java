package inheritance.demos;
class A
{
	public A()
	{
		
	}
	void show1()
	{
		System.out.println("Hi");
	}
}
class B
{
	public B()
	{
		
	}
	void show2() {
		System.out.println("Hello");
	}
}
/*
 * java does not support multiple inheritance
 *  because of ambiguity
 * 
 * According to given example ,
 * class A and class B inherited by C
 * here once we create the object of C , we must have to
 *  invoke
 * constructor of immediate child class 
 * but compiler confuse to call super class constructors
 *  because C 
 * is inherited by more than one class
 * 
 * to resolve these problem in java they introduced the 
 * concept of 
 * interface
 * so instead of multiple inheritance we can use interface
 * 
 * 
 * 
 * 
 * 
 * 
 */
class C extends A,B
{
	public C()
	{
		super();
	}
}
public class TestMultipleInheritanceDemo {

	public static void main(String[] args) {

C child =new C();

	}

}
