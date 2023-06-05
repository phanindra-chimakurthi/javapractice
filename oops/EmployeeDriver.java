package com.oops;
class Employee{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	public void setEmployeeDetails() {
		empId="ES6015";
		empName="Phanindra Chimakurthi";
		emailId="chvrsphani1436@gmail.com";
		phoneNumber=9398591553l;
		salary=100000;
		
		
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
public class EmployeeDriver {
	public static void main(String[] args) {
		//create object for employee class
		Employee employee=new Employee();
		//invoke methods with employee object
		employee.setEmployeeDetails();
		employee.getEmployeeDetails();
		
	}
		
	}


