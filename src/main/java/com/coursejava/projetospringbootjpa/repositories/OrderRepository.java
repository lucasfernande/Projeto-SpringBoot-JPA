package com.coursejava.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projetospringbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
