package com.oops;
import java.util.Scanner;
class Account{
	private String id;
	private String name;
	private int balance=0;
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int credit(int amount) {
		  balance=(balance+amount);
		  return balance;
	}
	public int debit(int amount) {
	      	if(amount<=balance) {
	      		balance=(balance-amount);
	      		return balance;
	      	}else
	      		System.out.println("Amount exceeded balance,your balance is ");
	      	return balance;
	}
	public int transferTo(Account another,int amount) {
		if(balance>=amount) {
			another.balance=amount+another.balance;
			balance=balance-amount;
			return balance;
		}else
			System.out.println("insufficient funds");
		return balance;
		
	}
	
	
	
	
	
}

public class DriverClassAccount {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter id: ");
		String id=read.next();
		System.out.println("enter name:");
		String name=read.next();
		System.out.println("enter balance");
		int balance=read.nextInt();
		Account new1=new Account(id,name,balance);
		Account new2=new Account("hemanth1234","hemanth",25000);
		System.out.println(new1);
		System.out.println(new1.credit(1500));
		System.out.println(new1);
		System.out.println(new1.debit(3900));
		System.out.println(new1);
		System.out.println(new1.transferTo(new2, 1500));
		System.out.println(new1);
		System.out.println(new2);
		read.close();
		
	}

}
