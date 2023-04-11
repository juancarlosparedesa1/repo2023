package com.example.demo.modelo;

public class Coche extends Vehiculo {
	
	//atributes
	private String numPuertas;
	private String tipoCombustible;
	
	//constructor
	public Coche(String marca, String modelo, String matricula, String numPuertas, String tipoCombustible) {
		super(marca, modelo, matricula);
		this.numPuertas = numPuertas;
		this.tipoCombustible = tipoCombustible;
	}
	
	
	
	
	
	
}
