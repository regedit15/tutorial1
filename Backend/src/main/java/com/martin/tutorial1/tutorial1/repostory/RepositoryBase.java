package com.martin.tutorial1.tutorial1.repostory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RepositoryBase<T> {

	@PersistenceContext
	protected EntityManager entityManager;

}
