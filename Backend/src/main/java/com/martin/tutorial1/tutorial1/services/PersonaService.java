package com.martin.tutorial1.tutorial1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.martin.tutorial1.tutorial1.entities.Persona;

@Service
public class PersonaService extends BaseService {

	public List<Persona> getLista() {
		return personaRepository.getLista();
	}

}
