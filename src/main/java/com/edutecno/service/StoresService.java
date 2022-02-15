package com.edutecno.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edutecno.model.Customers;
import com.edutecno.model.Stores;

@Service
public interface StoresService {
	public List<Stores> listarStores();
}
