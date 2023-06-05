package com.polymorphism;


public class MethodOverloading {
	static int add(int first,int second) {
		return first+second;
	}
	static double add(double first,double second) {
		return first+second;
	}
	static float add(float first,float second) {
		return first+second;
	}
	static char add(char first,char second) {
		return (char)(first+second);
	}
	static String add(String first,String second) {
		//return first+second;
		return first.concat(second);
	}
	public static void main(String[] args) {
		System.out.println("adding two integers: "+add(2,5) );
		System.out.println("adding two double: "+add(2.34,5.45) );
		System.out.println("adding two float: "+add(2.3f,5.7f) );
		System.out.println("adding two char: "+add('2','5') );
		System.out.println("adding two strings: "+add("method ","overloading") );
	}

}
