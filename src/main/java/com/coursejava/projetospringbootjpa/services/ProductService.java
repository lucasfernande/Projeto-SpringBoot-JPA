package com.coursejava.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetospringbootjpa.entities.Product;
import com.coursejava.projetospringbootjpa.repositories.ProductRepository;

@Service // registrando a classe como um componente do spring

public class ProductService  {
    
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll() { // método que retorna todos os usuários do banco de dados
		return repo.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> user = repo.findById(id);
		return user.get();
	}
}
