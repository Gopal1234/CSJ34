package inheritance.demos;

 abstract class CustomerService
{
	double amount=5000.00;
	public double deposit(double amount)
	{
		this.amount=this.amount+amount;
		return this.amount;
	}
abstract	void showMsg();
	
}


//a abstract class can inherit other class
abstract class Rbi extends CustomerService
{
	public Rbi() {
    
System.out.println("welcome to my Bank");
	}
//for customer RBI having one method
	public void showRules()
	{
		System.out.println("If you want to withdraw more than 50k than you need show your PAN card");
	}
//BankingParterners 
	abstract public String getBanking(Rbi rbi);
	
	
	
}//close RBI class
//The type SBI must implement the inherited 
//abstract method Rbi.getBanking(Rbi)
/*
 * The type SBI must implement the inherited abstract
 *  method CustomerService.showMsg()
 * 
 * 
 */
class SBI extends Rbi
{
	public SBI()
	{
		super();
	}
	
public	String getBanking(Rbi rbi)
	{
	/*
	 * instanceOf operator is returns boolean
	 * This is used to check whether the object or
	 *  reference
	 * referring to particular Type of class object or not
	 * 
	 * 
	 */
	   if(rbi instanceof SBI)
	   {
		   return "SBI is Valid Bank";
	   }
	   else
	   {
		   return "SBI NOT VALID BANK";
	   }
	
	
	
		
	}


void showMsg() {
	System.out.println("Hiiii");
	
}
}//close of SBI class
class PNB extends Rbi
{
	public PNB()
	{
		super();
	}
public	String getBanking(Rbi rbi)
	{
	
	   if(rbi instanceof PNB)
	   {
		   return "PNB is Valid Bank";
	   }
	   else
	   {
		   return "PNB NOT VALID BANK";
	   }
	
	
	
		
	}

void showMsg() {
	System.out.println("Hello");
	
}
}


public class TestAbstractDemo1 {

	public static void main(String[] args) {
//Cannot instantiate the type Rbi
Rbi r=null;

r=new SBI();
double amount=r.deposit(5000.00);
System.out.println(amount);
r.showRules();
r.showMsg();
String statusForSBI=r.getBanking(r);
System.out.println(statusForSBI);
System.out.println("***********************");
r=new PNB();
r.showMsg();
r.showRules();
String statusForPNB=r.getBanking(r);
System.out.println(statusForPNB);

	}

}
