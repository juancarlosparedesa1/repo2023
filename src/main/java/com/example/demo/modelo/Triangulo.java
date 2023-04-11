package com.example.demo.modelo;

public class Triangulo {

	// atributes
	private double lado1, lado2, lado3;

	// resolution method with constructor 1
	// constructor
//	public Triangulo(double lado1, double lado2, double lado3) {
//		super();
//		this.lado1 = lado1;
//		this.lado2 = lado2;
//		this.lado3 = lado3;
//	}

	// methods
	// if use constructor no parameters in method
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

	public double calcularArea() {
		double s = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

	// resolutin method whitout constructor,use getters and setters
	// set value atribute in main class example triangulo1.setLado1(10);

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

}
