class A
{
	/*
	 * 
	 * Hello Admin...
Good morning
welcome to my website
	 * 
	 */
	/*
	 * this() is used to call overloaded constrcutor from same
	 * class
	 * 
	 * this() or constructor call should be first statement inside
	 * constructor
	 * 
	 * 
	 * 
	 */
	public  A()
	{
		//System.out.println("Hi");
		this("Hi");
		System.out.println("welcome to my website");
	}
	A(String msg)
	{
		this(108,"pass");
		System.out.println(msg);
	}
	A(int id, String password)
	{
		if(id==108 && password.equals("pass"))
		{
			System.out.println("Hello Admin...");
		}
		else
		{
			System.out.println("you are not admin");
		}
	}
	
}// close of A
public class TestA {
public static void main(String[] args) {
	//this call for no-argument constructor
	new A();
	//this call for string parameter constructor
	//new A("Good afternoon");
	
	//this call two parameter constrcutor
	//new A(108, "pass");
	
}
}
