package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Vuelo;

public interface IVueloService {
	public List<Vuelo> finAll();

	public Vuelo save(Vuelo vuelo);

	public Vuelo FindById(Long id);

	public void delete(Long id);
}
