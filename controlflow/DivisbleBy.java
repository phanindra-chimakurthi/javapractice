package com.controlflow;
import java.util.Scanner;

public class DivisbleBy {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		for(int i=1;i<=number;i++) {
			if((i%2==0)&&(i%4==0)&&(i%5==0))
				System.out.println(i);
		}
		read.close();
	}

}
