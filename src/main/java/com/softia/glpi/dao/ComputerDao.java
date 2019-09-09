package com.softia.glpi.dao;

import java.util.List;

import com.softia.glpi.model.Computer;


public interface ComputerDao  {
	List<Computer> findAllComputers();
	void create(Computer computer);
	
	
}
