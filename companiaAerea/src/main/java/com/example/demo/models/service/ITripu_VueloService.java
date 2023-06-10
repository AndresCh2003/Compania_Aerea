package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Tripu_Vuelo;

public interface ITripu_VueloService {
	public List<Tripu_Vuelo> finAll();

	public Tripu_Vuelo save(Tripu_Vuelo tripVuelo);

	public Tripu_Vuelo FindById(Long id);

	public void delete(Long id);
}
