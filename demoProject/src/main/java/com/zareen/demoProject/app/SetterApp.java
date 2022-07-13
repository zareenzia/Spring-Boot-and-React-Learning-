package com.zareen.demoProject.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zareen.demoProject.consumer.Bike;

public class SetterApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//retrieve bean from spring container
		Bike theBike = context.getBean("myBike",Bike.class);
		
		//call methods on the bean
		System.out.println(theBike.getVehicleName());
		System.out.println(theBike.getEngineType());
		System.out.println(theBike.startEngine());

		// close the context
		context.close();
	}
}
