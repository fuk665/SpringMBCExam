package com.hand.dto;

public class Store {

	private Integer storeId;
	private Integer managerStaffId;
	private Address address;
	
	public Store() {
	}

	public Store(Integer storeId) {
		this.storeId = storeId;
	}

	public Store(Integer storeId, Integer managerStaffId, Address address) {
		this.storeId = storeId;
		this.managerStaffId = managerStaffId;
		this.address = address;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(Integer managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", managerStaffId=" + managerStaffId + ", address=" + address + "]";
	}

	
	
	
}
