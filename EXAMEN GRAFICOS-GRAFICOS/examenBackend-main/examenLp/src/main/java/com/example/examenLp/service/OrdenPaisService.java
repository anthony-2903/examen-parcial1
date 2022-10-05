package com.example.examenLp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenLp.dao.Todo;
import com.example.examenLp.daoImpl.OrdenPaisDaoImpl;
import com.example.examenLp.entity.OrdenPais;

@Service
public class OrdenPaisService implements Todo<OrdenPais>{

	@Autowired
	private OrdenPaisDaoImpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}
	
}
