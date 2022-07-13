package com.zareen.demoProject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zareen.demoProject.service.CombustionEngine;
import com.zareen.demoProject.service.Engine;

@Configuration
@ComponentScan(value = {"com.zareen.demoProject.consumer"})
public class DIConfig {
	
	@Bean 
	public Engine getVehicleEngine() {
		return new CombustionEngine();
	}

}
