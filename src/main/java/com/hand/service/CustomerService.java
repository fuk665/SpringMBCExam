package com.hand.service;

import java.util.List;

import com.hand.dto.Customer;

public interface CustomerService {
	public void save(Customer customer);
	
	public void getOne();
	
	public Customer getById(Integer id);
	
	public void delete(Integer id);
	
	public boolean login(String name);
	
	public List<Customer> getListByPage(Integer page);
}
