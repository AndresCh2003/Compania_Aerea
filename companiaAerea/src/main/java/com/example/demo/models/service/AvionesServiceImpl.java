package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IAvionesDao;
import com.example.demo.models.entity.Aviones;

@Service
public class AvionesServiceImpl implements IAvionesService{
	
	@Autowired
	private IAvionesDao avionesDao;
	@Override
	@Transactional (readOnly = true)
	public List<Aviones> finAll() {
		return (List<Aviones>) avionesDao.findAll();
	}
	
	@Override
	@Transactional
	public Aviones save(Aviones aviones) {
		// TODO Auto-generated method stub
		return avionesDao.save(aviones);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Aviones FindById(Long id) {
		// TODO Auto-generated method stub
		return avionesDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		avionesDao.deleteById(id);
	}

	
}
