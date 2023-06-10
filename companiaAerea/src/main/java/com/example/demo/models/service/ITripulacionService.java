package com.example.demo.models.service;

import java.util.List;
  
import com.example.demo.models.entity.Tripulacion;

public interface ITripulacionService {

	public List<Tripulacion> finAll();

	public Tripulacion save(Tripulacion tripulacion);

	public Tripulacion FindById(Long id);

	public void delete(Long id);
}
