package com.nestedloops;
import java.util.Scanner;
public class TrianglePattern {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter no.of lines:");
		int n=read.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i);j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		read.close();
	
	}

}
