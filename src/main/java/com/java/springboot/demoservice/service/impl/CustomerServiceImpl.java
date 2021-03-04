package com.java.springboot.demoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.demoservice.dao.CustomerDao;
import com.java.springboot.demoservice.model.Customer;
import com.java.springboot.demoservice.model.Response;
import com.java.springboot.demoservice.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao custDao;
	@Override
	public List<Customer> getCustomerList() {
		List<Customer> customers= custDao.getCustomerList();
		return customers;
	}

	@Override
	public Customer getCustById(int id) {
		Customer customer=custDao.getCustById(id);
		return customer;
	}

	@Override
	public Response addCustomers(Customer customer) {
		
		return custDao.addCustomers(customer);
	}

	@Override
	public Response deleteCustomers(int id) {
		
		return custDao.deleteCustomer(id);
	}

}
