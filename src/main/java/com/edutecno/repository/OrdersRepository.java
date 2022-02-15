package com.edutecno.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	// CONSULTA C
	@Query(value = "SELECT * FROM dbanalisis.orders as a inner join dbanalisis.stores as b on a.store_id = b.store_id", nativeQuery=true)
	//@Query(value = "SELECT  b.store_name, COUNT(*) as cantidadOrdenes FROM dbanalisis.orders as a INNER JOIN dbanalisis.stores as b on a.store_id = b.store_id GROUP BY  b.store_name ORDER BY cantidadOrdenes DESC", nativeQuery = true)

	List<Orders> getOrdenesPorTienda();

	// CONSULTA D
	@Query(value = "SELECT  b.last_name as last_name, b.first_name as first_name , COUNT(*) as cantidadOrdenes FROM dbanalisis.stores a inner join dbanalisis.staffs b on a.store_id = b.store_id inner join dbanalisis.orders c on b.store_id = c.store_id and b.staff_id = c.staff_id WHERE a.store_id = :store GROUP BY 1 ORDER BY 2", nativeQuery = true)
	List<Orders> getOrdenesTotales(int store);

	// CONSULTA E
	@Query(value = "SELECT b.last_name as last_name, b.first_name as first_name , SUM(d.quantity * list_price) as monto FROM dbanalisis.stores a INNER JOIN dbanalisis.staffs b on a.store_id = b.store_id inner join dbanalisis.orders c on b.store_id = c.store_id and b.staff_id = c.staff_id inner join dbanalisis.order_items d on c.order_id = d.order_id WHERE a.store_id = :store GROUP BY 1 ORDER BY 2 ;", nativeQuery = true)
	List<Orders> getOrdenesMontos(int store);

	@Query(value = "SELECT * FROM dbanalisis.orders a INNER JOIN dbanalisis.staffs b ON a.staff_id = b.staff_id NNER JOIN dbanalisis.customers c ON a.customer_id = c.customer_id INNER JOIN stores d ON a.store_id = d.store_id 	WHERE d.store_id = :store OR a.order_status = :estado OR a.order_date >= :fechaD OR a.order_date <= :fechaH", nativeQuery = true)
	List<Orders> findByTiendaEstadoFechaOrden(int store, int estado, Date fechaD, Date fechaH);
	// List<Orders> findByNameOrLastName(@Param("nombre") String nombre,
	// @Param("apellido") String apellido);//se quiere que reciba solo un parámetro
	// pero que realice la búsqueda en los dos campos

}
