package com.coursejava.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetospringbootjpa.entities.Order;
import com.coursejava.projetospringbootjpa.repositories.OrderRepository;

@Service // registrando a classe como um componente do spring

public class OrderService  {
    
	@Autowired
	private OrderRepository repo;
	
	public List<Order> findAll() { // método que retorna todos os usuários do banco de dados
		return repo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = repo.findById(id);
		return user.get();
	}
}
