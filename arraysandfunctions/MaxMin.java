package com.arraysandfunctions;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter no of values: ");
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
			
		}
		int max=0;
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		read.close();
		System.out.println(max);
		System.out.println(min);
	}

}
//can also use arrays.sort