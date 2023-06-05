package com.controlflowhw;
import java.util.Scanner;
public class Group {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		if(n>0) {
			if(n%10==0)
				System.out.println("Group Leader");
			else
				System.out.println("Group Member");
				
			
		}
		read.close();
		
	}

}
