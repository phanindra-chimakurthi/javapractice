package com.oops;
import java.util.Scanner;
class Employees{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	public void setEmployeeDetails(String id,String name,String emailid,long phno,double sal) {
		empId=id;
		empName=name;
		emailId=emailid;
		phoneNumber=phno;
		salary=sal;
		
		
	}
	public void getEmployeeDetails() {
		System.out.println("EmpId:"+empId);
		System.out.println("Name:"+empName);
		System.out.println("e-mail:"+emailId);
		System.out.println("phn no:"+phoneNumber);
		System.out.println("Salary:"+salary);
	}
}


/**
 * @author vchimakurthi
 *driver class
 */
public class EmployeeDriverUserValues {
	public static void main(String[] args) {
		
		Employees employees=new Employees();
		Scanner read=new Scanner(System.in);
		System.out.println("enter employee id:");
		String id=read.next();
		System.out.println("enter employee name:");
		String name=read.next();
		System.out.println("enter employee e-mail:");
		String emailid=read.next();
		System.out.println("enter employee phone number:");
		long phno=read.nextLong();
		System.out.println("enter employee salary:");
		double sal=read.nextDouble();
		
	      
		employees.setEmployeeDetails(id, name, emailid, phno, sal);
		employees.getEmployeeDetails();
		read.close();
		Employees newemployees=new Employees();
		newemployees.setEmployeeDetails("es6015", "venkata", "phani@1436", 9398591553l, 60000);
		newemployees.getEmployeeDetails();
	}
		
	}



