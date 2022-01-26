package com.java.org;

import java.util.HashSet;
import java.util.Set;

public class Collectsethash {
	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>();
		s.add(10);
		s.add(40);
		s.add(30);
		s.add(70);// randomly placed
		s.add(40);//no duplicates
		System.out.println(s);
	
	}

}
