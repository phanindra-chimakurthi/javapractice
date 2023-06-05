package com.operators;
import java.util.Scanner;

public class CircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int diameter=read.nextInt();
		System.out.println(Math.round(diameter*3.14));
		read.close();
		
	}

}
