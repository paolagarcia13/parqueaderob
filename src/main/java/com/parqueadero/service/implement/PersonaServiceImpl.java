package com.parqueadero.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parqueadero.model.Persona;
import com.parqueadero.repository.PersonaRepository;
import com.parqueadero.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private PersonaRepository repo;
	
	@Override
	public List<Persona> listar() {
		return repo.listar();
	}

	@Override
	public void insertar(Persona persona) {
		repo.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		repo.modificar(persona);
		
	}

	@Override
	public void eliminar(int id) {
		repo.eliminar(id);
		
	}

	@Override
	public List<Persona> listarPorIdentificacion(String identificacion) {
		
		return repo.listarPorIdentificacion(identificacion);
	}

}
