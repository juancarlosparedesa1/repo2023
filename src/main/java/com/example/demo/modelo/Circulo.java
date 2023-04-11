package com.example.demo.modelo;

public class Circulo {
	//atributos
	private double radio;

	//constructor
	public Circulo(double radio) {
		this.radio = radio;
	}

	//métodos
	public double calcularPerimetro() {

		return 2 * Math.PI * radio;

	}

	public double calcularArea() {

		return Math.PI * Math.pow(radio, 2);
	}

}
