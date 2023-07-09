package com.taufeeque.springCoreProblemStatement6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Car car = context.getBean(Car.class);

		System.out.println("Car Name : " + car.getCarName());

		System.out.println("Engine Manufacturer Company :" + car.getEngine().getEngineManufacturer());
		System.out.println("Fuel Type : " + car.getEngine().getFuelType());
		System.out.println("Fuel Consumption Rate : " + car.getEngine().getFuelConsumptionRate());
		System.out.println("Is Engine running smoothly? : " + car.getEngine().isEngineRunning());
		System.out.println("Is Engine Over Heating? : " + car.getEngine().isEngineOverHeating());

		System.out.println("Is Car Brake Engaged? : " + car.getBrakes().isBrakeEngaged());
		System.out.println("Brake Fluid Level : " + car.getBrakes().getBrakeFluidLevel());
		System.out.println("Is Parking Lights On? : " + car.getBrakes().isParkingBrakeLightsOn());
		System.out.println("Is Parking Brake On? :" + car.getBrakes().isParkingBrakeOn());

		System.out.println("Numbers of Gear in Car: " + car.getGear().getGearNumber());
		System.out.println("Gear Speed :" + car.getGear().getGearSpeed());
		System.out.println("Is Gear Engaged? :" + car.getGear().isGearEngaged());
		System.out.println("Is Gear Locked? :" + car.getGear().isGearLocked());
		System.out.println("Is Rever gear present in the car or not? : " + car.getGear().isReverse());

		context.close();

	}
}
