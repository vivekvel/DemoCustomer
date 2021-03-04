package com.java.springboot.demoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.demoservice.model.Customer;
import com.java.springboot.demoservice.model.Response;
import com.java.springboot.demoservice.service.CustomerService;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
	
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getCustomers() {
	List<Customer> customers =	custService.getCustomerList();
		return customers;
	}
	@GetMapping("/{id}/getCustomer")
	public Customer getCustId(@PathVariable int id ) {
		Customer customer = custService.getCustById(id);
		return customer ;
	}
	
	@GetMapping("/getCustomer")
	public Customer getCustById(@RequestParam int id ) {
		Customer customer = custService.getCustById(id);
		return customer ;
	}
	
	@PostMapping("/addCustomer")
	public Response addCustomer(@RequestBody Customer customer) {
		Response response = custService.addCustomers(customer);
		return response;
	}
	
	@DeleteMapping("/{id}/delete")
	public Response deleteCustId(@PathVariable int id ) {
		Response response = custService.deleteCustomers(id);
		return response ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
