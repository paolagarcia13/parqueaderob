package com.parqueadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parqueadero.model.Persona;
import com.parqueadero.service.IPersonaService;

@RestController
@RequestMapping(path = "personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping(path = "/listar")
	public List<Persona> listar(){
		return service.listar();
	}
	
	@PostMapping(path="/insertar")
	@CrossOrigin(origins = "http://localhost:4200")
	public void insertar(@RequestBody Persona persona) {
		service.insertar(persona);
	}
	
	@PutMapping(path="modificar")
	@CrossOrigin(origins = "http://localhost:4200")
	public void modificar(@RequestBody Persona persona) {
		service.actualizar(persona);
	}
	
	@DeleteMapping(path="eliminar/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
	
	@GetMapping(path="/buscar-por-identificacion/{identificacion}")
	public List<Persona> listarPorIdentificacion(@PathVariable String identificacion) {
		return service.listarPorIdentificacion(identificacion);
	}
	
}
