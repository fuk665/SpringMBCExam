package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hand.dao.AddressDao;
import com.hand.dto.Address;
import com.hand.service.AddressService;

@Component("addressService")
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressDao addressDao;
	
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}
	
	
	
	@Override
	public Address getById(Integer id) {
		return addressDao.getById(id);
	}

}
