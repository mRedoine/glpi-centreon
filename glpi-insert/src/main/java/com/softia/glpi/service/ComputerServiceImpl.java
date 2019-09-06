package com.softia.glpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.softia.glpi.dao.ComputerDao;
import com.softia.glpi.model.Computer;

public class ComputerServiceImpl implements ComputerService {
	@Autowired @Qualifier("JPA")
	private ComputerDao computerDao;
	@Override
	public List<Computer> findAllComputers() {
		return computerDao.findAllComputers();
	}

	@Override
	public void create(Computer computer) {
		computerDao.create(computer);

	}

	@Override
	public void createComputers(List<Computer> computers) {
		// TODO Auto-generated method stub

	}

}
