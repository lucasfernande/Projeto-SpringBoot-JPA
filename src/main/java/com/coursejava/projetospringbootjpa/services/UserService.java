package com.coursejava.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetospringbootjpa.entities.User;
import com.coursejava.projetospringbootjpa.repositories.UserRepository;

@Service // registrando a classe como um componente do spring

public class UserService  {
    
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() { // método que retorna todos os usuários do banco de dados
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repo.findById(id);
		return user.get();
	}
	
	public User insert(User obj) {
		repo.save(obj);
		return obj;
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
