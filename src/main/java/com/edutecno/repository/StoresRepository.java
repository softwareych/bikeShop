package com.edutecno.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Integer>{
	

	
}
