package com.controlflow;

import java.util.Scanner;

public class IplMatches {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String matchDate = read.next();
		switch (matchDate) {

		case "10-04-2023":
			System.out.println("srh vs gt");
			break;
		case "11-04-2023":
			System.out.println("mi vs csk");
			break;
		case "12-04-2023":
			System.out.println("kkr vs pbks");
			break;
		case "13-04-2023":
			System.out.println("rr vs rcb");
			break;
		case "14-04-2023":
			System.out.println("dc vs csk");
			break;
		case "15-04-2023":
			System.out.println("gt vs rcb");
			break;
		case "16-04-2023":
			System.out.println("lsg vs rr");
			break;
		default:
			System.out.println("no match on this date");

		}
		read.close();
	}

}
