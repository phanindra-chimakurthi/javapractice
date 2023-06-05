package com.arraysandfunctions;
import java.util.Scanner;

class AgeChecking{
	public  static boolean isEligible(int age) {
		if(age>=18)
			return true;
		else
			return false;
	 }
}

public class VotingFunction {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Read age: ");
		int age=read.nextInt();
		boolean check=AgeChecking.isEligible(age);
		if(check)
			System.out.println("eligible to vote");
		else
			System.out.println("not eligible to vote");
		read.close();
		
	}
	

}
