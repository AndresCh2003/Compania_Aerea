package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Aviones;

public interface IAvionesService {
	public List<Aviones> finAll();

	public Aviones save(Aviones aviones);

	public Aviones FindById(Long id);

	public void delete(Long id);
}
