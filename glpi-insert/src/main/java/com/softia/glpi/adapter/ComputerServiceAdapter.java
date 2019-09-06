package com.softia.glpi.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softia.glpi.dto.ComputerDto;
import com.softia.glpi.mapper.ComputerMapper;
import com.softia.glpi.service.ComputerService;
@Service
public class ComputerServiceAdapter {
	@Autowired
	private ComputerService service;
	
	public void create(ComputerDto comp) {
		service.create(ComputerMapper.ComputerDtoToComputer(comp));
	}
	
	public List<ComputerDto> findAllComputers(){
		return service.findAllComputers()
				.stream()
				.map(computer -> ComputerMapper.ComputerToComputerDto(computer))
				.collect(Collectors.toList());
				
	}

}
