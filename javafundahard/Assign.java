package com.javafundahard;

/**
 * @author vchimakurthi
 *
 */
public class Assign {
	public static void main(String[] args) {
		int number1=23;
		int number2=50;
		int number3=78;
		int number4=1000;
		System.out.println(number1+" "+number2+" "+number3+" "+number4);
		number4=number3;
		number3=number2;
		number2=number1;
		number1=100;
		System.out.println(number1+" "+number2+" "+number3+" "+number4);
	}

}
