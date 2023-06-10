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

import com.example.demo.models.entity.Aviones;
import com.example.demo.models.service.IAvionesService;

@RestController
@RequestMapping("/api")
public class AvionesRestoController {
	@Autowired
	private IAvionesService avionesservice;

	// listar
	@GetMapping("/aviones")
	public List<Aviones> index() {
		return avionesservice.finAll();
	}

	// buscar
	@GetMapping("/aviones/{id}")
	public Aviones show(@PathVariable Long id) {
		return avionesservice.FindById(id);
	}

	// Guardar
	@PostMapping("/aviones")
	@ResponseStatus(HttpStatus.CREATED)
	public Aviones create(@RequestBody Aviones aviones) {
		return avionesservice.save(aviones);
	}

	// Editar 
	@PutMapping("/aviones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Aviones update(@RequestBody Aviones aviones, @PathVariable Long id) {
		Aviones avionesActual = avionesservice.FindById(id);
		avionesActual.setCodigo(aviones.getCodigo());
		avionesActual.setId_base(aviones.getId_base());
		avionesActual.setTipo(aviones.getTipo());
		return avionesservice.save(avionesActual);
	}

	// eliminar 
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		avionesservice.delete(id);
	}

	
}
