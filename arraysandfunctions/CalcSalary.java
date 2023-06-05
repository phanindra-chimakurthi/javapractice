package com.arraysandfunctions;
import java.util.Scanner;

public class CalcSalary {
	public static float calculateSalary(int currentSalary,float hikePercentage) {
		return (currentSalary+(currentSalary*(hikePercentage/100)));
	}
		
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int currentSalary=read.nextInt();
		int hikePercentage=read.nextInt();
		System.out.println(calculateSalary(currentSalary,hikePercentage));
		read.close();
			
		}
	

}
