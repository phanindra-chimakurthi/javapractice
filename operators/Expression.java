package com.operators;
import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		int result=((((number+8)/3)%5)*5);
		System.out.println(result);
		read.close();
	}

}
