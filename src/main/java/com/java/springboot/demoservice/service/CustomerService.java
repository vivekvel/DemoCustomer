package com.java.springboot.demoservice.service;

import java.util.List;

import com.java.springboot.demoservice.model.Customer;
import com.java.springboot.demoservice.model.Response;

public interface CustomerService {
	
 public	List<Customer> getCustomerList();
 
 public Customer getCustById(int id);
 
 public Response addCustomers(Customer customer);
 
 public Response deleteCustomers(int id);

}
