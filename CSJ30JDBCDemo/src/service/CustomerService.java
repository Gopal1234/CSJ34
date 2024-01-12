package service;

import java.util.List;

import model.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public int updateCustomer(int customerId, Customer newCustomer);
	public int deleteCustomer(int customerId);
	public Customer getCustomerById(int customerId);
	
	
	
	
}
