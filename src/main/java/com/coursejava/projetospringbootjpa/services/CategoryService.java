package com.coursejava.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetospringbootjpa.entities.Category;
import com.coursejava.projetospringbootjpa.repositories.CategoryRepository;

@Service // registrando a classe como um componente do spring

public class CategoryService  {
    
	@Autowired
	private CategoryRepository repo;
	
	public List<Category> findAll() { // método que retorna todos os usuários do banco de dados
		return repo.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = repo.findById(id);
		return user.get();
	}
}
