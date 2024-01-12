package exception.demos;

class Division
{
	public String divideTwoNumbers(int number1,int number2) 
	{
		String str="";
		try
		{
			int res=number1/number2;
			str="The answer is "+res+".";
		}catch(ArithmeticException ae)
		{
			str="Division by zero is not possible.";
		}
		finally {
	str=str+"Thanks for using the application.";
			       }
		return str;

	}
}
public class TestExceptionDemo2 {
public static void main(String[] args) {
	
	Division div=new Division();
	String msg=div.divideTwoNumbers(10, 0);
	System.out.println(msg);
}
}
