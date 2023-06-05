package com.controlflowhw;
import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter marks:");
		int marks=read.nextInt();
		if(marks>=0) {
			if(marks>=50)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		}else
			System.out.println("please enter a non negative number");
		read.close();
	}

}
