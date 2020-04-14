package com.martin.tutorial1.tutorial1.repostory;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

import com.martin.tutorial1.tutorial1.entities.Persona;

@Service
public class PersonaRepository extends RepositoryBase<Persona> {

	public List<Persona> getLista() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> query = builder.createQuery(Persona.class);
		Root<Persona> root = query.from(Persona.class);

		return entityManager.createQuery(query).getResultList();
	}

}
