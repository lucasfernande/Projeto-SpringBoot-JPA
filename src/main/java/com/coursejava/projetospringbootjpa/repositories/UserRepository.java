package com.coursejava.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projetospringbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
