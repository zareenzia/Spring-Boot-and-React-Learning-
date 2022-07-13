package com.zareen.demoProject.service;

public class CombustionEngine implements Engine {
	@Override
	public boolean turnOn() {
		System.out.println("Combustion Engine turned on");
		return true;
	}
}
