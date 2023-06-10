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

import com.example.demo.models.entity.Vuelo;
import com.example.demo.models.service.IVueloService;

@RestController
@RequestMapping("/api")
public class VueloRestController {
	@Autowired
	private IVueloService vuelosservice;

	// listar
	@GetMapping("/vuelo")
	public List<Vuelo> index() {
		return vuelosservice.finAll();
	}

	// buscar
	@GetMapping("/vuelo/{id}")
	public Vuelo show(@PathVariable Long id) {
		return vuelosservice.FindById(id);
	}

	// Guardar
	@PostMapping("/vuelo")
	@ResponseStatus(HttpStatus.CREATED)
	public Vuelo create(@RequestBody Vuelo vuelo) {
		return vuelosservice.save(vuelo);
	}

	// Editar 
	@PutMapping("/vuelo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vuelo update(@RequestBody Vuelo vuelo, @PathVariable Long id) {
		Vuelo vueloActual = vuelosservice.FindById(id);
		vueloActual.setId_avion(vuelo.getId_avion());
		vueloActual.setOrigen(vuelo.getOrigen());
		vueloActual.setDestino(vuelo.getDestino());
		vueloActual.setFecha(vuelo.getFecha());
		vueloActual.setHora(vuelo.getHora());
		return vuelosservice.save(vueloActual);
	}

	// eliminar 
	@DeleteMapping("/vuelo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		vuelosservice.delete(id);
	}

}
