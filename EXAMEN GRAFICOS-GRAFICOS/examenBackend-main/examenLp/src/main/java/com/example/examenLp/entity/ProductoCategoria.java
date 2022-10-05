package com.example.examenLp.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoCategoria implements Serializable{

	private String CategoryName;
	private int CategoryID;
}
