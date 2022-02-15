package com.edutecno.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Orders;

import com.edutecno.repository.OrdersRepository;
import com.edutecno.repository.StoresRepository;


@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	
	@Override
	public List<Orders> getOrdenesPorTienda() {
		// TODO Auto-generated method stub
		List<Orders> ordersStores = ordersRepository.getOrdenesPorTienda();
		return ordersStores;
	}


	@Override
	public List<Orders> getOrdenesTotales(int store) {
		// TODO Auto-generated method stub
		List<Orders> ordersStores = ordersRepository.getOrdenesTotales(store);
		return ordersStores;
	}


	@Override
	public List<Orders> getOrdenesMontos(int store) {
		// TODO Auto-generated method stub
		List<Orders> ordersStores = ordersRepository.getOrdenesMontos(store);
		return ordersStores;
	}


	@Override
	public List<Orders> findByTiendaEstadoFechaOrden(int store, int estado, Date fechaD, Date fechaH) {
		// TODO Auto-generated method stub
		return null;
	}

}
