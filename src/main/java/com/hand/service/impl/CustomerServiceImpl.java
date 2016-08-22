package com.hand.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hand.dao.CustomerDao;
import com.hand.dto.Customer;
import com.hand.service.CustomerService;

@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void getOne() {
	 Customer customer = customerDao.getOne();
		System.out.println("已经保存的数据如下:");
		System.out.println("ID: "+customer.getCustomerId());
		System.out.println("FirstName: "+customer.getFirstName());
		System.out.println("LastName: "+customer.getLastName());
		System.out.println("Email: "+customer.getEmail());
		System.out.println("Address: "+customer.getAddress().getAddress());
		System.out.println("CreateDate: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(customer.getCreateDate()));
	}

	@Override
	public Customer getById(Integer id) {
		return customerDao.getById(id);
	}

	@Override
	public void delete(Integer id) {
		customerDao.delete(id);
	}

	@Override
	public boolean login(String name) {
		String s = customerDao.login(name);
		if(s == null || "".equals(s)){
			return false;
		}
		return true;
	}

	@Override
	public List<Customer> getListByPage(Integer page) {
		return customerDao.getListByPage(page*10);
	}

}
