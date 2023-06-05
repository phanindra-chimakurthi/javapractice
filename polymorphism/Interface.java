package com.polymorphism;
interface Shapes{
	double getArea();
	double getPerimeter();
}
class Rectangle implements Shapes{
	float length,breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return(length*breadth);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2*(length+breadth));
	}
	
}
class Squares implements Shapes{
	float side;

	public Squares(float side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (side*side);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (4*side);
	}
	
	
}
public class Interface {
	public static void main(String[] args) {
		Shapes s=new Rectangle(4f,3f);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		s=new Squares(4f);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
	}

}
