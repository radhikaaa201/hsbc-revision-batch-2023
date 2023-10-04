package com.hsbc;

import java.util.Scanner;

interface Vehicle { 
	
	int x = 0;
	String wheels();
	String mileage();
}
abstract class Bike implements Vehicle {
	public String wheels() {
		return "Two Wheeler";
	}
}
abstract class Car implements Vehicle {
	public String wheels() {
		return "Four Wheeler";
	}
}
class RoyalEnfield extends Bike {
	@Override
	public String mileage() {
		return "30 - 35 kmpl";
	}
}
class Pulsar extends Bike {
	@Override
	public String mileage() {
		return "40 - 45 kmpl";
	}
}
class Nexon extends Car {
	@Override
	public String mileage() {
		return "20 - 25 kmpl";
	}
}
class XUV700 extends Car {
	@Override
	public String mileage() {
		return "25 - 28 kmpl";
	}
}
class VehicleFactory {
	public static Vehicle createVehicle(String name) {
		switch(name) {
		case "RE": return new RoyalEnfield();
		case "P": return new Pulsar();
		case "NX": return new Nexon();
		case "X7": return new XUV700();
		default: throw new RuntimeException("Wrong vehicle name!");
		}
	}
}
abstract class GC {
	
}
public class TestAbstractionAndPolymorphism {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select the vehicle: RE, P, NX, X7");
		String name = scan.next();
		Vehicle vehicle = VehicleFactory.createVehicle(name.toUpperCase());
		// getClass can called from any reference because it is in Object class
		System.out.println("Name: "+vehicle.getClass().getSimpleName());
		System.out.println("Wheels: "+vehicle.wheels()); // polymorphic
		System.out.println("Mileage: "+vehicle.mileage()); // polymorphic
		scan.close();
	}
}
