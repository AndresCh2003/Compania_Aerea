package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Vuelo;

public interface IVueloDao  extends CrudRepository<Vuelo,Long>{

}
