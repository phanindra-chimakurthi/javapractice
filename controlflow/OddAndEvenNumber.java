package com.controlflow;
import java.util.Scanner;

public class OddAndEvenNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		for(int i=1;i<=number;i++) {
			//if(i%2!=0)
			//	System.out.println(i);
			if(i%2==0)
				System.out.println(i);
		}
		read.close();
	}

}
