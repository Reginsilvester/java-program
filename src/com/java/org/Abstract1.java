package com.java.org;

public class Abstract1 extends Abstract {
public void perloan() {
	System.out.println("perloan : 50%");
	
}
public static void main(String[] args) {
Abstract1 A = new Abstract1();
A.carloan();
A.homeloan();
A.perloan();
}
}
