package com.zareen.demoProject.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import com.zareen.demoProject.service.Engine;

public class AutoRickshaw implements Vehicle {
	
	private Engine engine;

	@Autowired
    public AutoRickshaw(Engine theEngine) {
        engine = theEngine;
    }

	
//	@Autowired
//	public void setEngine(Engine engine) {
//		System.out.println("AutoRickshaw class, setter method for injection");
//		this.engine = engine;
//	}

//	public Engine getEngine() {
//		return engine;
//	}
//	
	@Override
	public String getVehicleName() {
		return "Vehicle Name: Autorickshaw";
	}

	@Override
	public String getEngineType() {
		return null;
	}

	@Override
	public boolean startEngine() {
		return engine.turnOn();
	}

}
