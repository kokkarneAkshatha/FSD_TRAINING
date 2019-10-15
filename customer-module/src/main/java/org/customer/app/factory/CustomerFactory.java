package org.customer.app.factory;

import java.util.List;

import org.customer.app.module.Customer;

public interface CustomerFactory {
	
	public Customer createCustomer(int id,String name,String email);
	public List<Customer> getAllCustomer();
	//public void updateCustomer(int id);
	public void findById(int id);
	public void deleteCustomer(int id);
	public void updateCustomer(int id);
	
}