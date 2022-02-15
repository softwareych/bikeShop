package com.edutecno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.repository.OrdersItemsRepository;

@Service
public class OrdersItemsServiceImpl implements OrdersItemsService {
	@Autowired
	private OrdersItemsRepository ordersItemsRepository;
}
