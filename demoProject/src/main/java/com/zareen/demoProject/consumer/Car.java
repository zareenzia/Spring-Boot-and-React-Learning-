package com.zareen.demoProject.consumer;

import com.zareen.demoProject.service.Engine;
public class Car implements Vehicle {
	private Engine engine;
	
	//constructor for dependency injection
	public Car(Engine theEngine) {
		engine = theEngine;
	}

	@Override
	public String getVehicleName() {
		return "Vehicle name: CAR";
	}
	@Override
	public String getEngineType() {
		return null;
	}
	@Override
	public boolean startEngine() {
		return this.engine.turnOn();
	}

}
