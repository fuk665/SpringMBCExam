package com.hand.dto;

import java.util.Date;

public class Customer {

	private Integer customerId;
	private Store store;
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private Integer active;
	private Date createDate;

	public Customer() {
	}

	public Customer(Integer customerId, Store store, String firstName, String lastName, String email, Address address,
			Integer active, Date createDate) {
		super();
		this.customerId = customerId;
		this.store = store;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.active = active;
		this.createDate = createDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", store=" + store + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", address=" + address + ", active=" + active + ", createDate="
				+ createDate + "]";
	}

}
