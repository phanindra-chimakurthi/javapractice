package com.oops;
class Employeec{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	//default Constructor
	public Employeec() {
		empId="ES6015";
		empName="Phanindra Chimakurthi";
		emailId="chvrsphani1436@gmail.com";
		phoneNumber=9398591553l;
		salary=100000;
		
	}
	//parameterized constructor-three arguments
	public Employeec(String empId,String empName,String emailId) {
		this.empId=empId;
		this.empName=empName;
		this.emailId=emailId;
	}
	//parameterized constructor all-arguments
	public Employeec(String empId,String empName,String emailId,long phoneNumber,double salary) {
			this.empId=empId;
			this.empName=empName;
			this.emailId=emailId;
			this.phoneNumber=phoneNumber;
			this.salary=salary;
	}
	public void getEmployeeDetails() {
		System.out.println("EmpId:"+empId);
		System.out.println("Name:"+empName);
		System.out.println("e-mail:"+emailId);
		System.out.println("phn no:"+phoneNumber);
		System.out.println("Salary:"+salary);
	}
	
}

public class EmployeeConstructor {
	
	public static void main(String[] args) {
		//object of def constructor
		Employeec ec=new Employeec();
		ec.getEmployeeDetails();
		
		//object of param three arg constructor
		Employeec ec1=new Employeec("es6015","phani","chvrs@");
		ec1.getEmployeeDetails();
		//object of param all arg
		Employeec ec2=new Employeec("es6015","phani","chvrs@",9398591653l,60000);
		ec2.getEmployeeDetails();
		
	}

}
