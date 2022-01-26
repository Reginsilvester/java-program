package com.java.org;

public class Constructor {
	public Constructor() {
System.out.println("student details");
	}
	public Constructor(int i) {
		System.out.println("student ID :"+ i);
		
	}
	public Constructor(String name) {
		System.out.println("Student name :"+ name);
	}
	public Constructor(char a,String nam,float t) {
		System.out.println("student percent:"+a+"."+nam+"="+t);
		
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor("Jeni");
		Constructor c3 = new Constructor('A', "Jeni", 71.3f);
	}
	

}
