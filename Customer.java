
public class Customer {
private String name;
private long phone;
private String emailId;
//here customer has dependency of Product
private Product[] product;
public Customer(String name, long phone, String emailId, 
		Product[] product) {
	super();
	this.name = name;
	this.phone = phone;
	this.emailId = emailId;
	this.product = product;
}
public String getName() {
	return name;
}
public long getPhone() {
	return phone;
}
public String getEmailId() {
	return emailId;
}
public Product[] getProduct() {
	return product;
}






}
