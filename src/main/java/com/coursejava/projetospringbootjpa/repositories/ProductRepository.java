package com.coursejava.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projetospringbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
