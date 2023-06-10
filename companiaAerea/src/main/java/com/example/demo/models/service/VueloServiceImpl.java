package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IVueloDao;
import com.example.demo.models.entity.Vuelo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloDao vueloDao;
	@Override
	@Transactional (readOnly = true)
	public List<Vuelo> finAll() {
		return (List<Vuelo>) vueloDao.findAll();
	}
	
	@Override
	@Transactional
	public Vuelo save(Vuelo vuelo) {
		// TODO Auto-generated method stub
		return vueloDao.save(vuelo);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Vuelo FindById(Long id) {
		// TODO Auto-generated method stub
		return vueloDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		vueloDao.deleteById(id);
	}
}
