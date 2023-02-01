package org.git;

public class Employee {
	public void empId() {
		System.out.println("Employeed Id: 2345");

	}
	public void empName() {
		System.out.println("Employeed Name: Saranya");

	}
	
	private void empProj() {
		System.out.println("Employe Project:1243");

	}
	
	private void empAdd() {
		System.out.println("Employe Address:Chennai");

	}
	
	public static void main(String[] args) {
		 Employee e = new  Employee();
		 e.empId();
		 e.empName();
		 e.empProj();
		 e.empAdd();
		
		 ProjectDetail p = new ProjectDetail();
		 p.proId();
		 p.proName();
	}
}
