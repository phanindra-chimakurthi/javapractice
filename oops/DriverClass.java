package com.oops;
import java.util.Scanner;
 class InvoiceItem {
	 private String id;
	 private String desc;
	 private int qty;
	 private double unitPrice;
	 
	 public InvoiceItem() {
		id="FS005";
		desc="Pens";
	}
	public InvoiceItem(String id,String desc,int qty,double unitPrice) {
		 this.id=id;
		 this.desc=desc;
		 this.qty=qty;
		 this.unitPrice=unitPrice;
	 }
	 public String getId() {
		 return id;
	 }
	 public String getDesc() {
		 return desc;
	 }
	 public int getQty() {
		 return qty;
	 }
	 public void setQty(int qty) {
		 this.qty=qty;
	 }
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	 public double getTotal() {
		 return unitPrice*qty;
	 }
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	 

}
 public class DriverClass{
	 public static void main(String[] args) {
		 Scanner read=new Scanner(System.in);
//		 String uid=read.next();
//		 String udesc=read.next();
//		 int uqty=read.nextInt();
//		 double uunitPrice=read.nextDouble();
		 InvoiceItem bill1=new InvoiceItem("1234","wheatflour",3,54.75d);
		 System.out.println(bill1);
		System.out.println(bill1.getTotal());
		InvoiceItem bill2=new InvoiceItem();
		bill2.setQty(25);
		bill2.setUnitPrice(15.99);
		System.out.println(bill2);
		System.out.println(bill2.getTotal());
		read.close();
		
	}
	
	 
	 
 }
