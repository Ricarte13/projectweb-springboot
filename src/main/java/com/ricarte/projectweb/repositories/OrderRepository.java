package com.ricarte.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricarte.projectweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
