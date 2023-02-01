package org.git;

public class Employee {
	public void empId() {
		System.out.println("Employeed Id: 2345");

	}
	public void empName() {
		System.out.println("Employeed Name: Saranya");

	}
	public static void main(String[] args) {
		 Employee e = new  Employee();
		 e.empId();
		 e.empName();
		
		 ProjectDetail p = new ProjectDetail();
		 p.proId();
		 p.proName();
	}
}
