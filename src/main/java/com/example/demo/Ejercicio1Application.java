package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Persona;

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
	}
}
