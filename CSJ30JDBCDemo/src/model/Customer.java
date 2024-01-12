package model;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {

@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phone=" + phone + ", dob=" + dob + "]";
	}
private int customerId;
private String customerName;
private String address;
private long phone;
private LocalDate dob;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}



}
