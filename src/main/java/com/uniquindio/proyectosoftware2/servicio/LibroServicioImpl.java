package com.uniquindio.proyectosoftware2.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.proyectosoftware2.model.Libro;
import com.uniquindio.proyectosoftware2.repositorio.LibroRepositorio;

@Service
public class LibroServicioImpl implements LibroServicio{
	
	@Autowired
	private LibroRepositorio repo;

	@Override
	public List<Libro> listarLibros() {
		return repo.findAll();
	}

	

}
