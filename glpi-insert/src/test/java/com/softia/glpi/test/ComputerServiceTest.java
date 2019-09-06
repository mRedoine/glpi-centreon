package com.softia.glpi.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softia.glpi.config.TestConfig;
import com.softia.glpi.model.Computer;
import com.softia.glpi.service.ComputerService;



public class ComputerServiceTest {
	private ComputerService service;

	@Before
	public void setup() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);
		service = ctx.getBean(ComputerService.class);
	}

	@Test
	public void it_should_get_all_computers() {
		List<Computer> computers = service.findAllComputers();
		Assert.assertNotNull("Pas d'ordinateurs !", computers);

	}
}
