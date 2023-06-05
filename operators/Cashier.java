package com.operators;

import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		int ten = 10;
		int fifty = 50;
		int hundred = 100;
		Scanner read = new Scanner(System.in);
		int cash = read.nextInt();
		int res1 = cash / hundred;
		int temp1 = cash - (res1 * 100);
		int res2 = temp1 / fifty;
		int temp2 = temp1 - (res2 * 50);
		int res3 = temp2 / ten;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		read.close();

	}

}
