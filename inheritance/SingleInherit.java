package com.inheritance;
//base class
class Employee{
	int empId;
	String empName;
	public void setData(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public void getData() {
		System.out.print("Employee Id: "+empId+"|"+"Employee Name: "+empName+"|");
	}
}
//derived class
class Manager extends Employee{
	String empDept;
	public void setDept(String empDept) {
		this.empDept=empDept;
	}
	public void getDept() {
		System.out.print("Employee department :"+empDept);
	}
}

public class SingleInherit {
	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.setData(1234, "phanindra");
		manager.setDept("human resources");
		manager.getData();
		manager.getDept();
		
		
	}

}
