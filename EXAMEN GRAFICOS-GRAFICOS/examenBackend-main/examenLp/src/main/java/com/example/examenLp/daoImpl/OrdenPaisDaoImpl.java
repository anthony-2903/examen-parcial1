package com.example.examenLp.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examenLp.dao.Todo;
import com.example.examenLp.entity.OrdenPais;

@Component
public class OrdenPaisDaoImpl implements Todo<OrdenPais>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "SELECT ORD.OrderID, ORD.ShipCountry FROM orders AS ORD JOIN customers AS CUST ON ORD.CustomerID = CUST.CustomerID limit 10;";
		return jdbcTemplate.queryForList(sql);
	}

}
