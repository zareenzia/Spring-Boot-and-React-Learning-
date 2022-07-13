package com.zareen.demoProject.service;

public class ElectricalEngine implements Engine {
	
	public ElectricalEngine() {
		System.out.println("Inside ElectricalEngine constructor." );
	}
	@Override
	public boolean turnOn() {
		System.out.println("Electrical Engine turned on");
		return true;
	}

}
