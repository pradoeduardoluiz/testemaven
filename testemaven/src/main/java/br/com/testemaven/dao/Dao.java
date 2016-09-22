package br.com.testemaven.dao;

import javax.persistence.EntityManager;

import br.com.testemaven.util.JpaUtil;

public abstract class Dao {

	EntityManager getEntityManager() {
		EntityManager entityManager = JpaUtil.getEntityManager();
		return entityManager;
	}

}
