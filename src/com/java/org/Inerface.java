package com.java.org;

public class Inerface implements Interface,Interface2 {

	@Override
	public void interestrate() {
		System.out.println("2%");
	}

	@Override
	public void Carloan() {
		System.out.println("10%");
	}

	@Override
	public void Insurance() {
		System.out.println("3%");
	}

	@Override
	public void premium() {
		System.out.println("5%");
	}

public static void main(String[] args) {
	Inerface i = new Inerface();
	i.Carloan();
	i.premium();
	i.interestrate();
	i.Insurance();
}
}
