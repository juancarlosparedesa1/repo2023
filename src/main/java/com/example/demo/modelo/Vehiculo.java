package com.example.demo.modelo;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String matricula;

	// constructor
	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	// metodos get

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	//to string
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
	
}
