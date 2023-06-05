package com.polymorphism;

class Vehicle{
	public void run() {
		System.out.println("inside vehicle run method");
	}
}

class Truck extends Vehicle{
	public void run() {
		System.out.println("inside truck run method");
	}
	
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("inside vehicle run method");
	}
}

public class MethodOverridng {
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle=new Truck();
		vehicle.run();
		vehicle=new Bike();
		vehicle.run();
	}

}
