package com.example.examenLp.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenPais implements Serializable{
	private int OrderID;
	private String ShipCountry;
	
}
