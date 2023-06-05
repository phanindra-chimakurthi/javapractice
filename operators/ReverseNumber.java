package com.operators;

import java.util.Scanner;

/**
 * @author vchimakurthi
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		System.out.println((number%10)+""+((number/10)%10)+((number/100)%10));
		read.close();
	}

}
