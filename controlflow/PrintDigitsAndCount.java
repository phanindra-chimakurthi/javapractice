package com.controlflow;
import java.util.Scanner;

public class PrintDigitsAndCount {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		int digit=0;
		int i=0;
		while(number!=0) {
			digit=(number%10);
			i++;
			System.out.println(digit);
			number=number/10;
			
		}
		System.out.println(i);
		read.close();
	}

}
