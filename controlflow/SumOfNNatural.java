package com.controlflow;
import java.util.Scanner;

public class SumOfNNatural {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=i+sum;
			
		}
		read.close();
		System.out.println(sum);
	}

}
