package com.zareen.demoProject.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zareen.demoProject.service.Engine;

@Component
public class Bike implements Vehicle{
	private Engine engine;

	//creating no-arg constructor
	public  Bike() {
		System.out.println("BIKE class, no arg constructor");
	}

	@Autowired
	public Bike(Engine theEngine) {
		engine = theEngine;
	}

	//setter for injection(XML)
	public void setEngine(Engine engine) {
		System.out.println("BIKE class(setEngine method), setter method for injection");
		this.engine = engine;
	}
	public String getVehicleName() {
		return "Vehicle name: BIKE";
	}

	public String getEngineType() {
		String EngineType="Electrical Engine";
		return EngineType;
	}

	public boolean startEngine() {
		return this.engine.turnOn();
	}
}
