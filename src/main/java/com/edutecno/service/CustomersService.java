package com.edutecno.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edutecno.model.Customers;
@Service
public interface CustomersService {

	public List<Customers> listarCustomers();
	
	public List<Customers> getCustomersByState(String state);
	
	public List<Customers> getCustomersByDominio(String dominio);
	

	
}
