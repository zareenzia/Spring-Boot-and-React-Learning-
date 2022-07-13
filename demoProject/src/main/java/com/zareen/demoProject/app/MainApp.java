package com.zareen.demoProject.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zareen.demoProject.configuration.DIConfig;
import com.zareen.demoProject.consumer.Bike;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
		Bike bike = context.getBean(Bike.class);
		System.out.println(	bike.getVehicleName());
		System.out.println(bike.startEngine());
		bike.startEngine();

		context.close();
	}
}