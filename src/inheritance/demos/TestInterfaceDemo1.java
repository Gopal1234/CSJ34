package inheritance.demos;
//creating an interface
interface Service1
{
	//public static final
	String msg1="welcome to our  login service portal";
	//public and abstract
	public  void getAuthenticateService(String userName, String password);
	
}
interface Service2 extends Service1
{
	String msg2="welocome to authorization Service";
	public void getAuthorization(String userType);
}
class User1 implements  Service2
{
	String userName;
	String userPassword;
	String userType;
	public User1(String userName, String userPassword,String userType) {
		
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType=userType;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	@Override
	public void getAuthorization(String userType) {
System.out.println(Service2.msg2);
if(userType.equals("admin"))
{
	System.out.println("admin you can delete customer, upcdate customer, generateReport");
}else
{
	System.out.println("you can view products and buy products");
}
		
	}
	@Override
	public void 
	getAuthenticateService(String userName,
			String password) {
		
		System.out.println(Service1.msg1);
		
		if(userName.equalsIgnoreCase("ADMIN") && 
				password.equals("cyber@123"))
		{
			System.out.println("Hello"+ " "+userName);
		}else if(userName.equalsIgnoreCase("customer123")
				&& password.equals("cust@123"))
		{
			System.out.println("Hello"+ " "+userName);
		}else
		{
		System.out.println("you are not a valid user");
		}
	}
	
	
	
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		Service2 userObj=new 
				User1("ADMIN", "admin@123", "admin");
		userObj.
		getAuthenticateService("ADMIN", "admin@123");
		//Service2 ser=new User1("asa","fsfs","sfsfe");
		userObj.getAuthorization("admin");

	}

}
