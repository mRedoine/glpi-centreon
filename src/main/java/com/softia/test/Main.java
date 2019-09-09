package com.softia.test;



import com.softia.glpi.model.Computer;
import com.softia.glpi.service.ComputerService;
import com.softia.glpi.service.ComputerServiceImpl;
public class Main {
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.setName("dernier");
		ComputerService tred = new ComputerServiceImpl();
		try {
			tred.addToCentreon(comp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
