package com.example.demo.modelo;

public class Calculadora {

	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("no es posible división por cero");
			return 0;
		}
	}
	
	
}
