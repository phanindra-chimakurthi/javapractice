package com.controlflow;
import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String userName="Phani1234";
		String password="Phani@1436";
		String enterUser=read.next();
		String enterPass=read.next();
		if(userName.equals(enterUser) && password.equals(enterPass)) {
			System.out.println("Welcome "+userName);
		}else {
			System.out.println("Invalid username or password");
		}
		read.close();
				
	}

}
