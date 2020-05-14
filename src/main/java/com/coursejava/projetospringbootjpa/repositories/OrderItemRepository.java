package com.coursejava.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projetospringbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
