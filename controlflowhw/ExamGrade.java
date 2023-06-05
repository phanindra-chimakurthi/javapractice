package com.controlflowhw;
import java.util.Scanner;

public class ExamGrade {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int marks=read.nextInt();
		if(marks>0) {
			if(marks>90)
				System.out.println("grade:O");
			else if(marks>=81&&marks<=90)
				System.out.println("grade:A");
			else if(marks>=71&&marks<=80)
				System.out.println("grade:B");
			else if(marks>=61&&marks<=70)
				System.out.println("grade:C");				
		    else if(marks>=50&&marks<=60)
		    	System.out.println("grade:D");
		    else if(marks<50)
		    	System.out.println("grade:F");			
		}else
			System.out.println("Enter a non-negative number ");
		read.close();
	}

}
