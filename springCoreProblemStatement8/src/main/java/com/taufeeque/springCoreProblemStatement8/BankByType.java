package com.taufeeque.springCoreProblemStatement8;

import org.springframework.beans.factory.annotation.Autowired;

public class BankByType {

	// Instance Variables

	private String bankName;

	@Autowired
	private Address address;

	// Generating Getters and Setters
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
