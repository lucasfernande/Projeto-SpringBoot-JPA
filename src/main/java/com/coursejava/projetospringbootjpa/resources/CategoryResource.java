package com.coursejava.projetospringbootjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejava.projetospringbootjpa.entities.Category;
import com.coursejava.projetospringbootjpa.services.CategoryService;

@RestController
@RequestMapping(value ="/categories")
public class CategoryResource {
    
	@Autowired
	private CategoryService service; // injeção de dependência do serviço
	
	@GetMapping // para indicar que esse método responde a requisição get do HTTP
	public ResponseEntity<List<Category>> findAll(){ 
		List<Category> users = service.findAll();			
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}	
	
}
