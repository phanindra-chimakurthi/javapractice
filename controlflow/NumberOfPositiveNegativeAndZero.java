package com.controlflow;
import java.util.Scanner;
public class NumberOfPositiveNegativeAndZero {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int positive=0;
		int negative=0;
		int zero=0;
		while(true){
			String n=read.next();
			if(n.equals("Y"))
				break;
			else {
				int num1=Integer.parseInt(n);
				if(num1>0)
					positive++;
				else if(num1<0)
					negative++;
				else
					zero++;
			}
		
	}
		System.out.println("no of positive: "+positive);
		System.out.println("no of negative: "+negative);
		System.out.println("no of zero: "+zero);
		read.close();

}
}
