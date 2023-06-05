package com.controlflow;
import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		final int age=18;
		int person=read.nextInt();
		if((person>=age) &&(person!=0 && person<0)) {
			System.out.println("you are eligible to vote");
			
		}else {
			if(person==0) {
				System.out.println("Age cannot be 0");
			}
			if(person<18 && person>0) {
				System.out.println("you are not eligible to vote,you have to wait "+(age-person)+"more years");
			}
			if(person<0) {
				System.out.println("age cannot be negative");
			}
		}
		read.close();
		
	}

}
