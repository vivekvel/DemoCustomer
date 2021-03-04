package com.java.springboot.demoservice.model;

public class Customer {
	
	private Integer id;
	private String custName;
	private String country;
	 
	public Customer() {
		
	}

	public Customer(Integer id, String custName, String country) {
		super();
		this.id = id;
		this.custName = custName;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
