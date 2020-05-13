package com.coursejava.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projetospringbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
