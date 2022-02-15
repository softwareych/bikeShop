package com.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Staffs;
@Repository
public interface StaffsRepository  extends JpaRepository<Staffs, Integer> {

}
