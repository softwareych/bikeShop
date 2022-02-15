package com.edutecno.controller;

import org.apache.logging.log4j.LogManager;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.model.Orders;
import com.edutecno.service.CustomersService;
import com.edutecno.service.OrdersService;
import com.edutecno.service.StoresService;

import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //genera mensajes en la consola
public class BikeShopController {
	static Logger log = LogManager.getRootLogger();
	
	@Autowired
	private CustomersService customersService;
	
	@Autowired
	private StoresService storesService;
	
	@Autowired
	private OrdersService ordersService;	
	
	@GetMapping("/")
	public String inicio(Model model) {
		return "Principal";
	}
	
	@GetMapping("/listarCustomers")
	public String listarCustomers(Model model) {
		var listarCustomers = customersService.getCustomersByState("NY");
		model.addAttribute("listarCustomers", listarCustomers);
		log.info("Yenny dice en INFO: Paso por Customers Estado");
		return "listarCustomers";
	}
	
	@GetMapping("/listarCustomersDominio")
	public String listarCustomersDominio(Model model) {
		var listarCustomersDominio = customersService.getCustomersByDominio("%yahoo%");
		model.addAttribute("listarCustomersDominio", listarCustomersDominio);
		log.info("Yenny dice en INFO: Paso por Customers Dominio");
		return "listarCustomersDominio";
	}	

	@GetMapping("/listarOrdenesPorTienda")
	public String listarOrdenesPorTienda(Model model) {
		//log.info("Yenny dice en INFO: Paso por listarOrdenesPorTienda");
		//var listarOrdenesPorTienda = ordersService.getOrdenesPorTienda();
		//log.info("Yenny dice en INFO: Paso por listarOrdenesPorTienda2");
		//model.addAttribute("listarOrdenesPorTienda", listarOrdenesPorTienda);
		var listarOrdenesPorTienda = ordersService.getOrdenesPorTienda();
		model.addAttribute("listarOrdenesPorTienda", listarOrdenesPorTienda);
		log.info("Yenny dice en INFO: Paso por listarOrdenesPorTienda3");
		
	/*	
		List<Orders> listaOrders = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Orders> criteriaQuery = null;
		Root<Orders> fromOrders = null;
		TypedQuery<Orders> query = null;
		Orders orders = null;
		
		//Query
		
		cb=em.getCriteriaBuilder();
		
		criteriaQuery= cb.createQuery(Orders.class);
		
		fromOrders = criteriaQuery.from(Orders.class);
		
		criteriaQuery.select(fromOrders);
		
		query = em.createQuery(criteriaQuery);
		
		listaOrders = query.getResultList();
		
		model.addAttribute("listarOrdenesPorTienda", listaOrders);
		//@Query(value = "SELECT  b.store_name, COUNT(*) as cantidadOrdenes FROM dbanalisis.orders as a INNER JOIN dbanalisis.stores as b on a.store_id = b.store_id GROUP BY  b.store_name ORDER BY cantidadOrdenes DESC", nativeQuery = true)
		*/
		
		
		
		return "listarOrdenesPorTienda";
	}
	
	@GetMapping("/listarOrdenesTotales")
	public String listarOrdenesTotales(Model model) {
		var listarOrdenesTotales = ordersService.getOrdenesTotales(2);
		model.addAttribute("listarOrdenesTotales", listarOrdenesTotales);
		log.info("Yenny dice en INFO: Paso por Ordenes Totales");
		return "listarOrdenesTotales";
	}	
	
	@GetMapping("/listarOrdenesMontos")
	public String listarOrdenesMontos(Model model) {
		var listarOrdenesMontos = ordersService.getOrdenesMontos(2);
		model.addAttribute("listarOrdenesMontos", listarOrdenesMontos);
		log.info("Yenny dice en INFO: Paso por Ordenes Totales");
		return "listarOrdenesMontos";
	}		
	
	@GetMapping("/reporteOrdenesPorTienda")
	public String reporteOrdenesPorTienda(Model model) {
		Orders ordersBuscar = new Orders();
		model.addAttribute("tienda", storesService.listarStores());
		
		log.info("Yenny dice en INFO: Paso por Ordenes por Tienda");
		return "reporteOrdenesPorTienda";
	}	
	
}
