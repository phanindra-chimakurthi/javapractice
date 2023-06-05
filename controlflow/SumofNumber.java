package com.controlflow;
import java.util.Scanner;

public class SumofNumber {
	public static void main(String[] args) {
	   Scanner read=new Scanner(System.in);
	   int n=read.nextInt();
	   int sum=0;
	   while(n!=0) {
		   sum=sum+n%10;
		   n=n/10;
	   }
	   System.out.println(sum);
	   read.close();
	}

}
