package com.zareen.demoProject.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zareen.demoProject.consumer.Vehicle;

//This class is for XML constructor injection
public class ConstructorApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		//retrieve bean from spring container
		Vehicle theVehicle = context.getBean("myVehicle", Vehicle.class);
		
		//call methods on the bean
		System.out.println(theVehicle.getVehicleName());
		System.out.println(theVehicle.getEngineType());
		System.out.println(theVehicle.startEngine());
		
		// close the context
		context.close();

	}
}
