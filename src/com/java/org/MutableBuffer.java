package com.java.org;

public class MutableBuffer {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Good");
		StringBuffer s1 = new StringBuffer("Good");
		StringBuffer s2 = new StringBuffer("Morning");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("APPEND");
		StringBuffer append = s.append(s1);
		System.out.println(System.identityHashCode(append));
	}

}
