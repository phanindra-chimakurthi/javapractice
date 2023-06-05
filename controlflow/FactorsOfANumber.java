package com.controlflow;
import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		int i=1;
		while(i<=number) {
			if(number%i==0)
				System.out.println(i);
			i++;
		}
		read.close();
	}

}
