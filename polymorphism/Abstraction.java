package com.polymorphism;

abstract class Shape{
	private int length,breadth,radius;

	public Shape(int radius) {
		super();
		this.radius = radius;
	}
	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}

	public int getRadius() {
		return radius;
	}
	public abstract double area();
	public abstract double perimeter();

}
class Circle extends Shape{
	
	public Circle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI*(Math.pow(getRadius(), 2)));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return(2*(Math.PI)*getRadius());
	}
}
class Square extends Shape{

	public Square(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (getRadius()*getRadius());
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (4*getRadius());
	}
	
	
}

public class Abstraction {
	public static void main(String[] args) {
		Shape circle=new Circle(5);
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		Shape square=new Square(5);
		System.out.println(square.area());
		System.out.println(square.perimeter());
		
	}

}
