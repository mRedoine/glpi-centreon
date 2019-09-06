package com.softia.glpi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.softia.glpi.model.Computer;

@Service
@Transactional
public interface ComputerService {
	List<Computer> findAllComputers();
	void create(Computer computer);
	void createComputers(List<Computer> computers);
	

}
