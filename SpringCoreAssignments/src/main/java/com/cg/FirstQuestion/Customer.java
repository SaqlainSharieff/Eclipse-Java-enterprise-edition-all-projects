package com.cg.FirstQuestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Customer {
	private int customerId;
	 private String customerName;
	private String customerAddress;
	private int customerContact;
	
	
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


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public int getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}


	public Customer(int customerId, String customerName, String customerAddress, int customerContact) {
		super();
		customerId = customerId;
		customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContact = customerContact;
		
	}

	
	private Address address;


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	void display() {
		System.out.println(customerId+" "+customerName+" "+customerAddress+" "+customerContact);
		System.out.println(address);
	}

	
}
