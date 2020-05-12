package com.coursejava.projetospringbootjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejava.projetospringbootjpa.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
    
	@GetMapping // para indicar que esse método responde a requisição get do HTTP
	public ResponseEntity<User> findAll(){ 
		User u = new User(1L, "Maria", "maria@gmail.com", "12131415", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
