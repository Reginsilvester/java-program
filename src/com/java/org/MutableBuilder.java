package com.java.org;

public class MutableBuilder {
public static void main(String[] args) {
	StringBuilder b = new StringBuilder("Good");
	StringBuilder b1=new StringBuilder("good");
	StringBuilder b2 = new StringBuilder("Morning");
	
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(b1));
	System.out.println(System.identityHashCode(b2));
	
	StringBuilder append = b.append(b1);
	System.out.println(System.identityHashCode(append));
	
}
}
