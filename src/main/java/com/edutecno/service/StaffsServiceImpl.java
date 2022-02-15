package com.edutecno.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.edutecno.repository.StaffsRepository;

public class StaffsServiceImpl implements StaffsService {

	@Autowired
	private StaffsRepository staffsRepository;
}
