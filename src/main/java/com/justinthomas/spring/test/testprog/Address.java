package com.justinthomas.spring.test.testprog;

public class Address {
	private String street;
	private String zipcode;
	
	public Address(String street, String zipcode) {
		super();
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
}
