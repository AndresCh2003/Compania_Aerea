package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Base;

public interface IBaseService {
	public List<Base> finAll();

	public Base save(Base base);

	public Base FindById(Long id);

	public void delete(Long id);
}
