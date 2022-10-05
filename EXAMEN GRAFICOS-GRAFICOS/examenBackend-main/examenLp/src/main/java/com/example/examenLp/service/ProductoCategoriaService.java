package com.example.examenLp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenLp.dao.Todo;
import com.example.examenLp.daoImpl.ProductoCategoriaDaoimpl;
import com.example.examenLp.entity.ProductoCategoria;

@Service
public class ProductoCategoriaService implements Todo<ProductoCategoria>{

	@Autowired
	private ProductoCategoriaDaoimpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
