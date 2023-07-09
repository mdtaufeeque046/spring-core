package com.taufeeque.springCoreProblemStatement6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public Car car() {
		Car car = new Car(null, null, null, null);

		car.setCarName("Hyundai Ioniq 6");
		car.setEngine(engine());
		car.setBrakes(brakes());
		car.setGear(gear());

		return car;

	}

	@Bean
	public Engine engine() {
		Engine engine = new Engine();

		engine.setEngineManufacturer("Hyundai");
		engine.setFuelType("Gasoline");
		engine.setFuelConsumptionRate(15.3);
		engine.setEngineRunning(true);
		engine.setEngineOverHeating(false);

		return engine;

	}

	@Bean
	public Brakes brakes() {
		Brakes brakes = new Brakes();

		brakes.setBrakeEngaged(true);
		brakes.setBrakeFluidLevel(5.6);
		brakes.setParkingBrakeLightsOn(true);
		brakes.setParkingBrakeOn(true);

		return brakes;

	}

	@Bean
	public Gear gear() {
		Gear gear = new Gear();

		gear.setGearNumber(6);
		gear.setGearSpeed(18.9);
		gear.setGearEngaged(true);
		gear.setGearLocked(false);
		gear.setReverse(true);
		
		return gear;

	}

}
