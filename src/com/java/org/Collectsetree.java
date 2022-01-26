package com.java.org;

import java.util.Set;
import java.util.TreeSet;

public class Collectsetree {
	public static void main(String[] args) {
		Set<Integer> s= new TreeSet<>();
		s.add(20); //gives in ascending order
		s.add(80);
		s.add(10);// no duplic
		s.add(50);
		s.add(20);
	//	s.add(null);// doesnt allow
		System.out.println(s);
	}

}
