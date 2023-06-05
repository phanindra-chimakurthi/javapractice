package com.controlflow;
import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		if(a>0) {
			System.out.println(a +"is positive");
		}else {
			if(a==0) {
				System.out.println("please enter a positive or negative number");
		}else {
			System.out.println(a+" is negative");
		}
			
		}
		read.close();
	}
}

