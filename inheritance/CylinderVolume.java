package com.inheritance;
class Circle{
	private double radius=1.0;
	private String color="red";
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea() {
		//System.out.println("color of circle is: "+color);
		//System.out.print("the area of circle is: ");
		return (Math.PI*(Math.pow(radius, 2)));
	}
}

class Cylinder extends Circle{
	private double height=1.0;

	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
		
	}
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
	}
	public Cylinder(double radius,double height,String color) {
		super(radius,color);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		System.out.println("height of cylinder is:"+height);
		System.out.print("volume of cylinder is: ");
		//return (Math.PI*(Math.pow(getRadius(), 2)*height));
		return (getArea()*height);
	}
	
}

public class CylinderVolume {
	public static void main(String[] args) {
		Cylinder cylinder =new Cylinder(1,3,"red");
		Cylinder cylinder1=new Cylinder(2,4);
		System.out.println(cylinder);
		System.out.println(cylinder1);
		System.out.println("Area of circle is: "+cylinder.getArea());
		System.out.println("Area of circle is: "+cylinder1.getArea());
		System.out.println(cylinder.getVolume());
		System.out.println(cylinder1.getVolume());
		
		
	}

}
