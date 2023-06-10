package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IBaseDao;
import com.example.demo.models.entity.Base;

@Service
public class BaseServiceImpl implements IBaseService{

	@Autowired
	private IBaseDao baseDao;
	@Override
	@Transactional (readOnly = true)
	public List<Base> finAll() {
		return (List<Base>) baseDao.findAll();
	}
	
	@Override
	@Transactional
	public Base save(Base base) {
		// TODO Auto-generated method stub
		return baseDao.save(base);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Base FindById(Long id) {
		// TODO Auto-generated method stub
		return baseDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		baseDao.deleteById(id);
	}

	

}
