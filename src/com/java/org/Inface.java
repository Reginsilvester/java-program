package com.java.org;

public interface Inface extends Interface,Interface2 {
	@Override
	default void premium() {
System.out.println("2%");		
	}
	@Override
	default void Insurance() {
System.out.println("4%");		
	}
	@Override
	default void interestrate() {
System.out.println("0.6%");		
	}
	public static void main(String[] args) {
Inface f = new Inface();
		f.interestrate();
f.premium();
f.Insurance();
	}

}
