package com.martin.tutorial1.tutorial1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.martin.tutorial1.tutorial1.services.PersonaService;

@Controller
public abstract class BaseController {

	@Autowired
	protected PersonaService personaService;

}
