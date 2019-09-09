package com.softia.glpi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.softia.glpi.config.ServiceConfig;

@Configuration
//Import du fichier de conf deja écrit
@Import(ServiceConfig.class)
//Chargement du fichier properties
@PropertySource("jdbc.properties")
public class TestConfig {
	@Autowired
	private Environment env;
	@Bean
	public DataSource glpiDS() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		
		return ds;
	}

}
