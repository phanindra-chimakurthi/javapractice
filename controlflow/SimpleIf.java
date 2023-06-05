package com.controlflow;
import java.util.Scanner;
/**
 * @author vchimakurthi
 * @since 31/05/2023
 * program to find greater number with two numbers
 * @version JDK11
 *
 */
public class SimpleIf {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		int b=read.nextInt();
		if((a>0 && b>0) && (a!=b)) {
			if(a>b) {
				System.out.println("a is greater than b");
			}else
				System.out.println("b is greater than a");
	

}else {
	System.out.println("enter valid input");
}
		read.close();
}
}