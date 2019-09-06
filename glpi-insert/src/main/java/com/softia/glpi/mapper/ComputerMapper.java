package com.softia.glpi.mapper;

import com.softia.glpi.dto.ComputerDto;
import com.softia.glpi.model.Computer;

public class ComputerMapper {
	public static Computer ComputerDtoToComputer(ComputerDto comp) {
		Computer computer = new Computer();
		computer.setId(comp.getId());
		computer.setName(comp.getName());
		return computer;
	}

	public static ComputerDto ComputerToComputerDto(Computer comp) {
		ComputerDto computer = new ComputerDto();
		computer.setId(comp.getId());
		computer.setName(comp.getName());
		return computer;
	}
}
