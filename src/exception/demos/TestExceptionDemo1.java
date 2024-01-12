package exception.demos;

import java.util.Scanner;

public class TestExceptionDemo1 {

	public static void main(String[] args) {
		try
		{
Scanner s=new Scanner(System.in);
System.out.println("enter a number to divide");
int numByDivide=s.nextInt();
int res=100/numByDivide;
System.out.println(res);
System.out.println("enter the index to get the value from array");
String index=s.next();
int in=Integer.parseInt(index);
int[] arr= {34,67,89,90};
System.out.println(arr[in]);


		}
		
		/*catch( NumberFormatException
				| ArrayIndexOutOfBoundsException 
				|ArithmeticException |NullPointerException e)*/
		catch(Exception e)
		{
			//String getMessage();
			System.out.println(e.getMessage());
			main(null);
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			main(null);
		}
catch(Exception e)
		
		{
			System.out.println("i am parent block"+ " "+e);
		}*/
		finally {
			System.out.println("Thanks for using my app...");
		}
}

}
