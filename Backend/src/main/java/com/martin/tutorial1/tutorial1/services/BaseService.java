
package com.martin.tutorial1.tutorial1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.tutorial1.tutorial1.repostory.PersonaRepository;

@Service
public abstract class BaseService {

	@Autowired
	protected PersonaRepository personaRepository;

}
