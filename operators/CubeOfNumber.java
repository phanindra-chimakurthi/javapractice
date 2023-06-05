package com.operators;
import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		int cube=(number*number*number);
		System.out.println(cube);
		read.close();
	}

}
