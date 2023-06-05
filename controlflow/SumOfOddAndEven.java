package com.controlflow;

import java.util.Scanner;

public class SumOfOddAndEven {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int j=0;
		int k=0;
		int number=read.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%2==0)
				j=i+j;
			else
				k=i+k;
		}
		read.close();
		System.out.println(j+","+k);
	}
}
