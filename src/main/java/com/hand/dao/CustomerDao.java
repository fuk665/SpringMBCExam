package com.hand.dao;

import java.util.List;

import com.hand.dto.Customer;

public interface CustomerDao {

	public void save(Customer customer);
	
	public Customer getOne();
	
	public Customer getById(Integer id);
	
	public void delete(Integer id);
	
	public String login(String name);
	
	public List<Customer> getListByPage(Integer count);
}
