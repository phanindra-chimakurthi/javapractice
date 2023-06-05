package com.controlflow;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int length=read.nextInt();
		int breadth=read.nextInt();
		if((length>0 && breadth>0)) {
			if((length*breadth)>(2*(length+breadth))) {
				System.out.println("area is greater than perimeter");
			}else {
				System.out.println("perimeter is greater than area");
			}
		}else {
			System.out.println("enter a number greater than 0");
		}
		read.close();
	}

}
