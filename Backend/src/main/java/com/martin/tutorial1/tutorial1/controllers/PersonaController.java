package com.martin.tutorial1.tutorial1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.tutorial1.tutorial1.entities.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController extends BaseController {

	@GetMapping(value = "/saludar")
	public String saludar(String nombre) {

		return "Holaaa " + nombre + "!";
	}

	@PostMapping(value = "/getLista")
	public List<Persona> getLista() {

		return personaService.getLista();
	}

}
