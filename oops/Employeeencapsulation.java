package com.oops;
class Employeencap{
	private String empId;
	private String empName;
	private String emailId;
	private long phoneNumber;
	private double salary;
	
	
	public Employeencap(String empId, String empName, String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
	}
	public Employeencap(String empId, String empName, String emailId, long phoneNumber, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
public class Employeeencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeencap ec2=new Employeencap("es6015","phani","sdcfd",98765432l,60000);
		System.out.println(ec2.getEmpId());
		System.out.println(ec2.getEmailId());
		System.out.println(ec2.getEmpName());
		System.out.println(ec2.getPhoneNumber());
		System.out.println(ec2.getSalary());
		
		

	}

}
