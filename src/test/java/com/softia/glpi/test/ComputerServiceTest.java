package com.softia.glpi.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softia.glpi.config.TestConfig;
import com.softia.glpi.model.AutoUpdateSystems;
import com.softia.glpi.model.Computer;
import com.softia.glpi.model.ComputerModel;
import com.softia.glpi.model.ComputerTypes;
import com.softia.glpi.model.Domains;
import com.softia.glpi.model.GlpiEntities;
import com.softia.glpi.model.Groups;
import com.softia.glpi.model.Location;
import com.softia.glpi.model.Manufacturers;
import com.softia.glpi.model.Networks;
import com.softia.glpi.model.Profiles;
import com.softia.glpi.model.UserCategories;
import com.softia.glpi.model.UserTitles;
import com.softia.glpi.model.Users;
import com.softia.glpi.service.ComputerService;

public class ComputerServiceTest {
	private ComputerService service;
	GlpiEntities entity;
	AutoUpdateSystems aUp;
	ComputerModel compModel;
	ComputerTypes compType;
	Domains domains;
	Groups grp;
	Location locations;
	Networks networks;
	Profiles profiles;
	UserCategories userCat;
	UserTitles userT;
	Users user;
	Computer comp;
	Manufacturers manufacturer;

	@Before
	public void setup() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);
		service = ctx.getBean(ComputerService.class);
		entity = new GlpiEntities(1, "entité", 3);
		aUp = new AutoUpdateSystems(1, "Mensuel");
		compModel = new ComputerModel(1, "Res", 3, 2, 2, 2, 2, false);
		compType = new ComputerTypes(3, "etyr244Art");
		domains = new Domains(3, "Paris", entity, false);
		grp = new Groups(7, entity, false, 9, true, false, true, true, false, false, true);
		locations = new Location(4, entity, true, "B", 5, 5, "46.8080", "22.909879");
		networks = new Networks(2, "A.O.I");
		manufacturer = new Manufacturers(2, "Samsung");
		profiles = new Profiles(0, "Default", true, 2, true, 2);
		userCat = new UserCategories(1, "tech");
		userT = new UserTitles(0, "rrr");
		user = new Users(1, "Redoine", "pwd", "07070707", locations, 2, true, 3, 4, false, entity, profiles, userT,
				userCat, false);

		comp = new Computer(entity, "Ordinateur de test", "R308904", 2, 2, aUp, locations, domains, networks, compModel,
				compType, false, "KL", manufacturer, false, false, user, grp);

	}

	@Test
	public void it_should_get_all_computers() {
		List<Computer> computers = service.findAllComputers();
		Assert.assertNotNull("Pas d'ordinateurs !", computers);

	}

	@Test
	public void it_should_create_a_computer() {

		service.create(comp);

	}

	@Test
	public void it_should_create_computers(List<Computer> computers) {
		for (Computer comp : computers) {
			service.create(comp);
		}

	}

	@Test
	public void it_should_add_a_computer_to_centreon_supervision() {

		comp.setName("EnvoiVersCentreon2");

		try {
			service.addToCentreon(comp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
