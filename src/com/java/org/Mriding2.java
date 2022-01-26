package com.java.org;

public class Mriding2 extends Mriding{
	@Override
	public void code(int i) {
		System.out.println("changed code:"+i);
		super.code(i);
	}
	public static void main(String[] args) {
	Mriding2 m2 = new Mriding2();
	m2.code(13);
	m2.name("Jeni");
	}

}
