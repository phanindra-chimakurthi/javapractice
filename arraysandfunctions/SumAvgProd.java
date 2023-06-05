package com.arraysandfunctions;
import java.util.Scanner;

public class SumAvgProd {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter length of array: ");
		int n=read.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
			
		}
		int sum=0;
		int prod=1;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			prod=prod*a[i];
			
			
		}
		avg=sum/(a.length);
		System.out.println("sum:"+sum);
		System.out.println("product:"+prod);
		System.out.println("average:"+avg);
		
		read.close();
		
		
	}

}
