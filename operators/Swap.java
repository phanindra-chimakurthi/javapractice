package com.operators;

public class Swap {
	public static void main(String[] args) {
		int a=6;
		int b=8;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		a=6;
		b=8;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		a=6;
		b=8;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
