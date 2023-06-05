package com.controlflow;
import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		float xCoordinate=read.nextFloat();
		float yCoordinate=read.nextFloat();
		if(xCoordinate>0 &&yCoordinate>0) {
			System.out.println("First quadrant");
		}else if(xCoordinate<0 && yCoordinate<0) {
			System.out.println("Third quadrant");
			
		}else if(xCoordinate>0 && yCoordinate<0) {
			System.out.println("Fourth quadrant");
			
		}else if(xCoordinate<0 && yCoordinate>0) {
			System.out.println("Second quadrant");
			
		}else if(xCoordinate==0 && yCoordinate<0) {
			System.out.println("negative y-axis");
			
		}else if(xCoordinate<0 && yCoordinate==0) {
			System.out.println("negative x-axis");
			
		}else if(xCoordinate>0 && yCoordinate==0) {
			System.out.println("positive x-axis");
			
		}else if(xCoordinate==0 && yCoordinate>0) {
			System.out.println("positive x-axis");
			
		}else
			System.out.println("at origin");
		read.close();
	}
	

}
