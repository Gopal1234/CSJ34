package inheritance.demos;
class Login
{
	static final boolean getLogin(int empId)
	{
		if(empId==108)
		{
			return true;
		}
		return false;
	}
	
static final	String getLogin(String empId, long phone)
	{
		if(empId.equals("ADMIN008") && phone==8147117572L)
		{
			return "Hello Admin welcome";
		}
		return "no valid Admin";
	}
	
	
	
}
public class TestMethodOverloadingDemo {

	public static void main(String[] args) {

  // Login obj=new Login();
  boolean empLoginStatus= Login.getLogin(108);
  if(empLoginStatus)
  {
	  System.out.println("employee logged in successfully");
  }
  else
  {
	  System.out.println("employee failed to login ");
  }
String adminLoginStatus=Login.getLogin("ADMIN008",8147117572L);
System.out.println(adminLoginStatus);
	}

}
