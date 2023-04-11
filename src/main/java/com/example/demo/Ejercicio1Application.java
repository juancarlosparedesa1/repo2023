package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Calculadora;
import com.example.demo.modelo.Circulo;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Triangulo;
import com.example.demo.modelo.Vehiculo;

@SpringBootApplication
public class Ejercicio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		persona1.setNombre("juan");
		persona1.setEdad(27);
//		System.out.println("El nombre de la persona es:" + persona1.getNombre());
//		System.out.println("La edad de " + persona1.getNombre() + " es:" + persona1.getEdad());
		System.out.println(persona1);

		Vehiculo vehiculo1 = new Vehiculo("chevrolet", "luvdmax", "psg2024");
		System.out.println(vehiculo1);

		// probar la clase circulo
		Circulo circulo1 = new Circulo(10);// creamos un objeto circulo de radio 10
		double areaCirculo = circulo1.calcularPerimetro();
		double perimetroCirculo = circulo1.calcularPerimetro();
		System.out.println("area circulo: " + areaCirculo);
		System.out.println("perimetro circulo: " + perimetroCirculo);

//		// test class triangulo with constructor
//		Triangulo triangulo1 = new Triangulo(10, 20, 30);
//		double areaTriangulo = triangulo1.calcularArea();
//		double perimetroTrianguo = triangulo1.calcularPerimetro();
//		System.out.println("El area es:"+areaTriangulo);
//		System.out.println("el perimetro es:"+perimetroTriangulo);

		// test class triangulo without constructor;
		Triangulo triangulo2 = new Triangulo();
		triangulo2.setLado1(10);
		triangulo2.setLado2(20);
		triangulo2.setLado3(30);
		double areaTriangulo = triangulo2.calcularArea();
		double perimetroTriangulo = triangulo2.calcularPerimetro();
		System.out.println("El area del triangulo es: " + areaTriangulo);
		System.out.println("El perimetro del tríangulo es: " + perimetroTriangulo);

		// test class calculadora
		Calculadora calculadora1 = new Calculadora();
		System.out.println("la suma es:" + calculadora1.sumar(10, 20));
		System.out.println("la resta es:" + calculadora1.restar(10, 20));
		System.out.println("la multiplicacion es:" + calculadora1.multiplicar(10, 20));
		System.out.println("la division es:" + calculadora1.dividir(10, 0));

	}
}
