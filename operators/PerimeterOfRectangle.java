package com.operators;
import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int length=read.nextInt();
		int breadth=read.nextInt();
		float Perimeter=2*(length+breadth);
		System.out.println(Perimeter);
		read.close();
		
	}
	


}
