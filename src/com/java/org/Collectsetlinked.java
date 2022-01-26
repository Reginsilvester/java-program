package com.java.org;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collectsetlinked {
public static void main(String[] args) {
	Set<Object> s= new LinkedHashSet<>();
	Set<Integer> h = new LinkedHashSet<>();
	
	s.add("jeni");
	s.add("A");
	s.add(20);
	s.add(true);
	s.add(20);// no duplic
	
	h.add(80);
	h.add(20);
	h.add(10);
	h.add(null);
	System.out.println(s);// correct gn order
	System.out.println(h);
	
}
}
