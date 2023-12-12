class Account
{
	//we can not able to access these attributes from outside of the class
	//encapsulated pinCode field
	private int pinCode;
	//emcapsulated accountHolderName
	private String accountHolderName;
	//encapsulated accontNumber
	private long accountNumber;
	//by defining public setter methods 
	public  void  setPin(int pin)
	{
		pinCode=pin;
	}
	public  int  getPin()
	{
		
		return pinCode;
	}
    /*
     * 
     * this is a auto generated keyword
     * this holds the reference or address of currently running
     * object
     * 
     * this holds the reference of invoking object
     * 
     * this is used to resolve ambiguity between instance variable
     * and local variable or parameterized variable if they both
     * same name
     * 
     * 
     * 
     */
	public void setName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getName()
	{
		return accountHolderName;
	}
	public void setAcnNumber(long acn)
	{
	accountNumber=acn;	
	}
	public long getAcn()
	{
		return accountNumber;
	}
}//close of Account






//out side class
public class TestBank {

	public static void main(String[] args) {

//creating object of Account class
		Account acn=new Account();
		//accessing all fields or attributes of Account
		//calling setPin() method by object of Account
		acn.setPin(2345);
		//calling getPin() method by object account
	int result	=acn.getPin();
	System.out.println(result);
	acn.setName("abc");
	String name=acn.getName();
	System.out.println(name);
	acn.setAcnNumber(43535353);
	long num=acn.getAcn();
	System.out.println(num);
	
		

	}

}
