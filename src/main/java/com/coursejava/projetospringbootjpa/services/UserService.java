package com.coursejava.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.coursejava.projetospringbootjpa.entities.User;
import com.coursejava.projetospringbootjpa.repositories.UserRepository;
import com.coursejava.projetospringbootjpa.services.exceptions.DatabaseException;
import com.coursejava.projetospringbootjpa.services.exceptions.ResourceNotFoundException;

@Service // registrando a classe como um componente do spring

public class UserService  {
    
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() { // método que retorna todos os usuários do banco de dados
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		repo.save(obj);
		return obj;
	}
	
	public void delete(Long id) {
		try {
			
		repo.deleteById(id);
		
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
			
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		User entity = repo.getOne(id);
		updateData(entity, obj);
		return repo.save(entity);
	}

	private void updateData(User entity, User obj) {
	    entity.setName(obj.getName());
	    entity.setEmail(obj.getEmail());
	    entity.setPhone(obj.getPhone());
	}
}
