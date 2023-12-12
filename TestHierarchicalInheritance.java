package inheritance.demos;
class User
{
	String userName;
	String userPassword;
	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String login(String userName, String password)
	{
		if(userName.equals("Admin") && 
				password.equals("admin@123"))
		{
			return "Hello"+ " "+userName;
		}
		else if(userName.equals("customer") &&
				password.equals("cust@123"))
		{
			return "Hello"+ " "+userName;
		}
		return "No valid user";
	}
	
}

class Admin extends User
{

	public Admin(String userName, String userPassword) {
		super(userName, userPassword);
		// TODO Auto-generated constructor stub
	}
	
	
}
class Customer extends User
{

	public Customer(String userName, String userPassword) {
		super(userName, userPassword);
		// TODO Auto-generated constructor stub
	}
	
	
}
public class TestHierarchicalInheritance {

	public static void main(String[] args) {
		Admin admin=new Admin("Admin","admin@123");
	String status=	admin.login("Admin", "admin@123");
System.out.println(status);
Customer customer=new Customer("customer", "cust@123");
String custStatus=customer.login("custome443r", "cust@123");
System.out.println(custStatus);
	}

}
