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

import com.example.demo.models.entity.Tripulacion;
import com.example.demo.models.service.ITripulacionService;

@RestController
@RequestMapping("/api")
public class TripulacionRestController {
	@Autowired
	private ITripulacionService tripulacionservice;

	// listar
	@GetMapping("/tripulacion")
	public List<Tripulacion> index() {
		return tripulacionservice.finAll();
	}

	// buscar
	@GetMapping("/tripulacion/{id}")
	public Tripulacion show(@PathVariable Long id) {
		return tripulacionservice.FindById(id);
	}

	// Guardar
	@PostMapping("/tripulacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripulacion create(@RequestBody Tripulacion tripulacion) {
		return tripulacionservice.save(tripulacion);
	}

	// Editar 
	@PutMapping("/tripulacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripulacion update(@RequestBody Tripulacion tripulacion, @PathVariable Long id) {
		Tripulacion tripulacionActual = tripulacionservice.FindById(id);
		tripulacionActual.setId_base(tripulacion.getId_base());
		tripulacionActual.setCodigo(tripulacion.getCodigo());
		tripulacionActual.setNombre_piloto(tripulacion.getNombre_piloto());
		tripulacionActual.setApellido_piloto(tripulacion.getApellido_piloto());
		tripulacionActual.setHoras_vuelo(tripulacion.getHoras_vuelo());
		tripulacionActual.setPiloto_si_no(tripulacion.getPiloto_si_no());
		return tripulacionservice.save(tripulacionActual);
	}

	// eliminar 
	@DeleteMapping("/tripulacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tripulacionservice.delete(id);
	}

}
