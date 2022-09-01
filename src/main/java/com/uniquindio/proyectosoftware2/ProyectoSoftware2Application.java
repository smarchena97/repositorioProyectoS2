package com.uniquindio.proyectosoftware2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uniquindio.proyectosoftware2.model.Libro;
import com.uniquindio.proyectosoftware2.repositorio.LibroRepositorio;

@SpringBootApplication
public class ProyectoSoftware2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSoftware2Application.class, args);
	}
	

}
