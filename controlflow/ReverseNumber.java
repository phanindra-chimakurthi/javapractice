package com.controlflow;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int rev=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println(rev);
		read.close();
	}

}
