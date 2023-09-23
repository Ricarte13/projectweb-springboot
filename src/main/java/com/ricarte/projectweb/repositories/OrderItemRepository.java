package com.ricarte.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricarte.projectweb.entities.OrderItem;
import com.ricarte.projectweb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
