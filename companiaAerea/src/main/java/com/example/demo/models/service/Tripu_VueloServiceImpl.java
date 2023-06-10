package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ITripu_VueloDao;
import com.example.demo.models.entity.Tripu_Vuelo;

@Service
public class Tripu_VueloServiceImpl implements ITripu_VueloService{
	
	@Autowired
	private ITripu_VueloDao tripVueloDao;
	@Override
	@Transactional (readOnly = true)
	public List<Tripu_Vuelo> finAll() {
		return (List<Tripu_Vuelo>) tripVueloDao.findAll();
	}
	
	@Override
	@Transactional
	public Tripu_Vuelo save(Tripu_Vuelo tripVuelo) {
		// TODO Auto-generated method stub
		return tripVueloDao.save(tripVuelo);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Tripu_Vuelo FindById(Long id) {
		// TODO Auto-generated method stub
		return tripVueloDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tripVueloDao.deleteById(id);
	}

}
