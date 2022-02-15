package com.edutecno.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Stores;
import com.edutecno.repository.StoresRepository;



@Service
public class StoresServiceImpl implements StoresService{

	@Autowired
	private StoresRepository storesRepository;

	@Override
	public List<Stores> listarStores() {
		// TODO Auto-generated method stub
		return storesRepository.findAll();
	}
}
