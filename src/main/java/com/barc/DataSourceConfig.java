package com.barc;

import javax.activation.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

	
	private static final DataSource dataSource = null;

	@Profile("dev")
	DataSource dev() {
		
		return dataSource;
	}
	@Profile("cloud")
	private DataSource cloud() {
		return dataSource;
	}
}
