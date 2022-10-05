package com.example.examenLp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examenLp.entity.OrdenPais;
import com.example.examenLp.entity.ProductoCategoria;
import com.example.examenLp.service.OrdenPaisService;
import com.example.examenLp.service.ProductoCategoriaService;

@RestController
@RequestMapping("/api/home")
@CrossOrigin({"*"})
public class HomeController {
	
	@Autowired
	private ProductoCategoriaService productoService;
	@Autowired
	private OrdenPaisService ordenPaisService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listarProduct(){
		return productoService.readAll();
	};
	
	@GetMapping("/readOrdeCountries")
	public List<Map<String, Object>> listarCountries(){
		return ordenPaisService.readAll();
	};
}
