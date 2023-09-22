package com.ricarte.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricarte.projectweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
