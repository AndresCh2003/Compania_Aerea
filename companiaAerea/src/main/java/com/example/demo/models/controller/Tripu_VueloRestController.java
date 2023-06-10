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

import com.example.demo.models.entity.Tripu_Vuelo;
import com.example.demo.models.service.ITripu_VueloService;

@RestController
@RequestMapping("/api")
public class Tripu_VueloRestController {
	@Autowired
	private ITripu_VueloService tripVuelosservice;

	// listar
	@GetMapping("/tripVuelo")
	public List<Tripu_Vuelo> index() {
		return tripVuelosservice.finAll();
	}

	// buscar
	@GetMapping("/tripVuelo/{id}")
	public Tripu_Vuelo show(@PathVariable Long id) {
		return tripVuelosservice.FindById(id);
	}

	// Guardar
	@PostMapping("/tripVuelo")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripu_Vuelo create(@RequestBody Tripu_Vuelo tripVuelo) {
		return tripVuelosservice.save(tripVuelo);
	}

	// Editar 
	@PutMapping("/tripVuelo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripu_Vuelo update(@RequestBody Tripu_Vuelo tripVuelo, @PathVariable Long id) {
		Tripu_Vuelo tripVueloActual = tripVuelosservice.FindById(id);
		tripVueloActual.setId_tripulacion(tripVuelo.getId_tripulacion());
		tripVueloActual.setId_numvuelo(tripVuelo.getId_numvuelo());
		return tripVuelosservice.save(tripVueloActual);
	}

	// eliminar 
	@DeleteMapping("/tripVuelo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tripVuelosservice.delete(id);
	}

}
