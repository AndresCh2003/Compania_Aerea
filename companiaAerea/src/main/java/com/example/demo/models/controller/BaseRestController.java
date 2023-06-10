package com.example.demo.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.entity.Base;
import com.example.demo.models.service.IBaseService;

@RestController
@RequestMapping("/api")
public class BaseRestController {

	@Autowired
	private IBaseService baseservice;

	// listar
	@GetMapping("/base")
	public List<Base> index() {
		return baseservice.finAll();
	}

	// buscar
	@GetMapping("/base/{id}")
	public Base show(@PathVariable Long id) {
		return baseservice.FindById(id);
	}

	// Guardar
	@PostMapping("/base")
	@ResponseStatus(HttpStatus.CREATED)
	public Base create(@RequestBody Base base) {
		return baseservice.save(base);
	}

	// Editar 
	@PutMapping("/base/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Base update(@RequestBody Base base, @PathVariable Long id) {
		Base baseActual = baseservice.FindById(id);
		baseActual.setNombre_base(base.getNombre_base());
		return baseservice.save(baseActual);
	}

	// eliminar 
	@DeleteMapping("/base/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		baseservice.delete(id);
}
}	
