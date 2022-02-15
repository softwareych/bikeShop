package com.edutecno.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;


import com.edutecno.model.Orders;

@Service
public interface OrdersService  {
	
	public List<Orders> getOrdenesPorTienda();
	
	public List<Orders> getOrdenesTotales(int store);
	
	public List<Orders> getOrdenesMontos(int store);
	
	public List<Orders> findByTiendaEstadoFechaOrden(int store, int estado, Date fechaD, Date fechaH);
	
}
