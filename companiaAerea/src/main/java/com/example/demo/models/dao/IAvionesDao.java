package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Aviones;

public interface IAvionesDao  extends CrudRepository<Aviones,Long>{

}
