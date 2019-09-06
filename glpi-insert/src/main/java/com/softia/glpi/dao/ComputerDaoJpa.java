package com.softia.glpi.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
		// TODO Auto-generated method stub
		
	}

}
