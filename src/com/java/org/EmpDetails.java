package com.java.org;

public class EmpDetails {
	public void EmpID() {
		System.out.println("Emp ID : 101");
		

	}
public void Empname() {
	System.out.println("Emp Name : Jeni");
	
	
}
public void EmpDOB() {
	System.out.println("DOB : 30-01-1994");
}
public void EmpDesignation() {
	System.out.println("Desigation : Assistant Manager");
	
}
public void EmpSalary() {
	System.out.println("Salary : 30,000");
	
}
public static void main(String[] args) {
	EmpDetails A = new EmpDetails ();
	A.Empname();
	A.EmpID();
	A.EmpDOB();
	A.EmpDesignation();
	A.EmpSalary();
}
}
