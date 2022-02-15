package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Customers;
import com.edutecno.repository.CustomersRepository;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	private CustomersRepository customersRepository;

	@Override
	public List<Customers> listarCustomers() {
		// TODO Auto-generated method stub
		return customersRepository.findAll();
	}

	@Override
	public List<Customers> getCustomersByState(String state) {
		// TODO Auto-generated method stub
		List<Customers> customersState = customersRepository.getCustomersByState(state);
		return customersState;
	}

	@Override
	public List<Customers> getCustomersByDominio(String dominio) {
		// TODO Auto-generated method stub
		List<Customers> customersDominio = customersRepository.getCustomersByDominio(dominio);
		return customersDominio;
	}
	
	
}
