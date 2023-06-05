package com.controlflow;

import java.util.Scanner;

public class DivisibleBySeven {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		if (a > 0 && a != 0) {
			if (a % 7 == 0) {
				System.out.println(a + "is divisible by 7");

			} else {
				System.out.println("number shoul not be negative and zero");
			}

		}
		read.close();
	}
}