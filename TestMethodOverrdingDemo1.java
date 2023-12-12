package inheritance.demos;

import java.sql.SQLException;

class A1
{
	 void displayMsg(String msg)	{
		System.out.println("displaying message from super class"+ " "+msg);
	}
}
class B2 extends A1
{
	 void displayMsg(String msg)
	{
		//super.displayMsg("Hiii");
		System.out.println("displaying message from child class"+ " "+msg);
	}
	
}
public class TestMethodOverrdingDemo1 {

	public static void main(String[] args) {

		//in parent type reference I have initialized 
		//object of child class
		//This concept known as upcasting
A1 parent=new B2();
parent.displayMsg("welcome");

	}

}
