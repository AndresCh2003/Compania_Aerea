package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Base;

public interface IBaseDao  extends CrudRepository<Base,Long>{

}
