package com.javafundahard;
import java.util.Scanner;

public class GreetCustom {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter 1stperson name:");
		String name1=read.next();
		System.out.println("enter 2ndperson name:");
		String name2=read.next();
		System.out.println("Welcome "+name1+"! Welcome "+name2+" too !");
		read.close();
		
		
	}

}
