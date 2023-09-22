package com.ricarte.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricarte.projectweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
