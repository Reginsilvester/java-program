package com.java.org;

public class MeLoding {
	public void Details(String name) {
		System.out.println("name:"+name);
	}
	public void Details(int age) {
System.out.println("age:"+age);		
	}
	public void Details(char initial,String name) {
		System.out.println("full name :"+initial+"."+name);
		
		
	}
public static void main(String[] args) {
	MeLoding m = new MeLoding();
	m.Details("Jeni");
	m.Details(23);
	m.Details('A', "Reegana Jenifer");
}
}
