package com.softia.glpi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.softia.glpi.model.Computer;


@Repository
public class ComputerDaoJpa implements ComputerDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Computer> findAllComputers() {
		String jpql = "select comps from Computer comps";
		Query query = em.createQuery(jpql);
		
		List<Computer> computers = query.getResultList();

		return computers;
	}

	@Override
	public void create(Computer computer) {
		em.persist(computer);
		
	}

}
