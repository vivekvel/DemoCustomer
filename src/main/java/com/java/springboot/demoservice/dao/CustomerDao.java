package com.java.springboot.demoservice.dao;

import java.util.List;

import com.java.springboot.demoservice.model.Customer;
import com.java.springboot.demoservice.model.Response;

public interface CustomerDao {
	
	List<Customer> getCustomerList();
	
	Customer getCustById(int custNo);
	
	
    Response addCustomers(Customer customer) ;
    
    Response deleteCustomer(int id);

}
