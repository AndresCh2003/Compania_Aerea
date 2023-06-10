package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ITripulacionDao;
import com.example.demo.models.entity.Tripulacion;

@Service
public class TripulacionServiceImpl implements ITripulacionService{

	@Autowired
	private ITripulacionDao tripulacionDao;
	@Override
	@Transactional (readOnly = true)
	public List<Tripulacion> finAll() {
		return (List<Tripulacion>) tripulacionDao.findAll();
	}
	
	@Override
	@Transactional
	public Tripulacion save(Tripulacion tripulacion) {
		// TODO Auto-generated method stub
		return tripulacionDao.save(tripulacion);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Tripulacion FindById(Long id) {
		// TODO Auto-generated method stub
		return tripulacionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tripulacionDao.deleteById(id);
	}
}
