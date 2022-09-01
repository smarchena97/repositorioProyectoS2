package com.uniquindio.proyectosoftware2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uniquindio.proyectosoftware2.repositorio.LibroRepositorio;
import com.uniquindio.proyectosoftware2.servicio.LibroServicio;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Autowired
	LibroServicio servicio;
	
	@Autowired
	LibroRepositorio repo;
	
	@GetMapping({"/index","","/"})
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/listar")
	public String listar(Model modelo) {
		modelo.addAttribute("libros", servicio.listarLibros());
		modelo.addAttribute("titulo", "Pagina para listar libros");
		return "listar";
	}
	
//	@GetMapping("/buscar")
//	public String buscar(Model modelo) {
//		modelo.addAttribute("titulo", "Pagina de busqueda de libro por autor");
//		modelo.addAttribute("libro", servicio.listarLibroPorAutor());
//		return "buscar";
//	}
	
	@GetMapping("/consulta/{autor}")
	public String consultar(@PathVariable String autor, Model model) {
		model.addAttribute("libro", repo.findLibroByAutor(autor));	
		return "mostarconsulta";
	}
	
	@PostMapping("/traer")
	public String eje1(@RequestParam("textoAutor") String autor, Model modelo) {
		modelo.addAttribute("libro", repo.findLibroByAutor(autor));
		return "mostrar";
	}
	
	@GetMapping("/volver")
	public String volver() {
		return "index";
	}

}
