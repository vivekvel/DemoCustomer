package com.java.springboot.demoservice.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.MapUtils;
import org.springframework.stereotype.Repository;

import com.java.springboot.demoservice.dao.CustomerDao;
import com.java.springboot.demoservice.model.Customer;
import com.java.springboot.demoservice.model.Response;
@Repository
public class CustDaoImpl implements CustomerDao {

	List<Customer> customers =null;
	Customer customer = null;
	Response response =null;
	
	
	private  Map<Integer,Customer> customersMap = new HashMap<Integer,Customer>();
	@Override
	public List<Customer> getCustomerList() {
		//null pointer
		customers = new ArrayList<Customer>();
		if(MapUtils.isNotEmpty(customersMap)) {
		Set<Integer> ids = customersMap.keySet();
		//Customer[] cust = new Customer[ids.size()];
		//int i=0;
		for(Integer id : ids){
			//cust[i] = customersMap.get(id);
			 customer = customersMap.get(id);
			 customers.add(customer);
			//i++;
		}
		}
		return customers;
		//return Arrays.asList(cust);
	


		
		/*customers = new ArrayList<Customer>();
		 customer = new Customer(12,"John","Canada");
		 customers.add(customer);
		 customer = new Customer(14,"Tom","USA");
		 customers.add(customer);
		 customer = new Customer(16,"Shane","UK");
		 customers.add(customer);
		 customer = new Customer(16,"Arun","India");
		 customers.add(customer);
		return customers;*/
	}

	@Override
	public Customer getCustById(int id) {
		if(MapUtils.isNotEmpty(customersMap))
			customer = customersMap.get(id);
		return customer;
		/*Customer cust = new Customer();
		cust.setCustName("Jhon");
		cust.setCountry("Canda");
		cust.setId(id);;
		return cust;*/
	}

	@Override
	public Response addCustomers(Customer customer) {
		 response = new Response();
        if(MapUtils.isNotEmpty(customersMap)) 
		 if(customersMap.get(customer.getId()) != null){
			response.setStatus(false);
			response.setMessage("Customer Already Exists");
			return response;
		
		}
	
		customersMap.put(customer.getId(), customer);
		response.setStatus(true);
		response.setMessage("Customer created successfully");
		return response;
	}

	@Override
	public Response deleteCustomer(int id) {
		response = new Response();
		if(MapUtils.isNotEmpty(customersMap))
		if(customersMap.get(id) == null){
			response.setStatus(false);
			response.setMessage("Customer Doesn't Exists");
			return response;
		}
		
		customersMap.remove(id);
		response.setStatus(true);
		response.setMessage("Customer deleted successfully");
		return response;
		
	}

}
