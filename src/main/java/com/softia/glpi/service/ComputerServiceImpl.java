package com.softia.glpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softia.glpi.dao.CentreonConnect;
import com.softia.glpi.dao.ComputerDao;
import com.softia.glpi.model.Computer;

@Service
@Transactional
public class ComputerServiceImpl implements ComputerService {
	@Autowired 
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
		for(Computer comp : computers) {
			computerDao.create(comp);
		}
	}

	@Override
	public void addToCentreon(Computer comp) throws Exception {
		CentreonConnect centreon = CentreonConnect.INSTANCE;
		centreon.addtoCentreon(comp);
		
		
		
			
	}

	

}
