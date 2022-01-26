package com.java.org;

public class Interface1 implements Interface {
	
@Override
public void Carloan() {
System.out.println("carloan : 10%");	
}

@Override
public void Insurance() {
System.out.println("insurance : 3%");	
}

@Override
public void premium() {
System.out.println("premium : 2%");	
}
public static void main(String[] args) {
	Interface1 i = new Interface1();
	i.Carloan();
	i.Insurance();
	i.premium();
}

}
