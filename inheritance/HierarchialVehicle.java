package com.inheritance;
//base class
class Vehicle{
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	 
	public void displayInfo() {
		System.out.println("vehicle make: "+make+"|"+"vehicle model: "+model+"|"+"manufactured year: "+year );
	}
}

class Car extends Vehicle{
	int numDoors;
	
	public Car(String make,String model,int year,int numDoors) {
		super(make,model,year);
		this.numDoors=numDoors;
	}
	
	public int getNumDoors() {
		return numDoors;
	}

	

	public void startEngine() {
		System.out.println("engine Started");
	}
}

class MotorCycle extends Vehicle{
	boolean isDoorsThere;

	public MotorCycle(String make, String model, int year,boolean isDoorsThere) {
		super(make, model, year);
		this.isDoorsThere=isDoorsThere;
		// TODO Auto-generated constructor stub
	}
	public void startEngine() {
		System.out.println("engine Started");
	}
	public boolean isDoorsThere() {
		return isDoorsThere;
	}
	
	
	
	
}

public class HierarchialVehicle {
	public static void main(String[] args) {
		Car car=new Car("suzuki", "swift" ,2022,4);
		car.displayInfo();
		car.startEngine();
		System.out.println(car.getNumDoors());
		
		MotorCycle bike=new MotorCycle("yamaha","r15",2023,false);
		bike.displayInfo();
		bike.startEngine();
		System.out.println(bike.isDoorsThere());
		
	}

}
