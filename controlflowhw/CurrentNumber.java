package com.controlflowhw;
import java.util.Scanner;

public class CurrentNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		if(number>0) {
			if(number%2==0)
				System.out.println(number/2);
			else
				System.out.println((number*3)+1);
			
		}
		else
			System.out.println("Enter a number greater than zero ");
		read.close(); 
	}

}
