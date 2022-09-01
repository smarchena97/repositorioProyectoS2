package com.uniquindio.proyectosoftware2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uniquindio.proyectosoftware2.model.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String>{
	
	@Query(value = "SELECT * FROM libro l WHERE l.autor = :autor", nativeQuery = true)
	Libro findLibroByAutor(@Param("autor") String autor);

}
