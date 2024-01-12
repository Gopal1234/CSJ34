import java.io.Serializable;
/*
 * Serializable is an marker interface
 * which is used to mark a class , so that the object of the class can be 
 * serialized
 * If you will not implement Serializable interface with your class and if 
 * you try to implement Serialization then you will get 
 * NotSerializableException 
 * 
 * 
 * 
 */
public class Account implements Serializable{
	
	private int pinCode;
	//If you do not want to serialize a particular properties of the class then you can use
	//either transient or static keyword
	//transient is the non access modifier which prevent a field  from serialization
	//process
	private transient String accountHolderName;
	private transient long accountNumber;
	private transient String accountType;
	public Account(int pinCode, String accountHolderName, long accountNumber, String accountType) {
		super();
		this.pinCode = pinCode;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public int getPinCode() {
		return pinCode;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	
	

}
