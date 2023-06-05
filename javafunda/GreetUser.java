package com.javafunda;
import java.util.Scanner;
/**
 * @author vchimakurthi
 * @since 30/05/2023
 * program to take input from user and display it as a message
 *
 */
public class GreetUser {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);//creating a scanner object for getting input from user
		System.out.println(" Please enter the user name:");
		String userName=read.next();
		System.out.println("Hello "+userName+"!!");
		read.close();
		

	}

}
