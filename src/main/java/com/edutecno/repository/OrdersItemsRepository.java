package com.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Customers;
import com.edutecno.model.OrderItems;

@Repository
public interface OrdersItemsRepository extends JpaRepository<OrderItems, Integer>{

}
