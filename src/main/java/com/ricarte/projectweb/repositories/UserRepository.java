package com.ricarte.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricarte.projectweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
