package com.edutecno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Customers;



@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

	//CONSULTA A
		@Query (value="SELECT customer_id , last_name , first_name , phone , email , street , city , state , zip_code FROM dbanalisis.customers WHERE state=:state ORDER BY last_name, first_name", nativeQuery=true)
		List<Customers> getCustomersByState(String state);
		
	//CONSULTA B	
		@Query (value="SELECT customer_id , last_name , first_name , phone , email , street , city , state , zip_code FROM dbanalisis.customers WHERE email like :dominio and phone is null ORDER BY last_name, first_name", nativeQuery=true)
		List<Customers> getCustomersByDominio(String dominio);		
		
			
	
}
