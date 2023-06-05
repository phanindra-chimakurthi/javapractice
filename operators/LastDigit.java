package com.operators;
import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int number=read.nextInt();
		System.out.println(number%100);
		read.close();
	}

}
