package com.java.org;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collectlinklist {
	public static void main(String[] args) {
		List<Object> l = new LinkedList<>();
		List<Integer> m= new LinkedList<>();
		
		l.add(10);
		
		l.add(40);
		l.add(30);
		l.add("jeni");
		l.add(null);
		l.add('A');
		l.add(70);
		l.add(20);
//		l.add(null);
		
		System.out.println(l);
		
		m.add(90);
		m.add(10);
		m.add(40);
		m.add(50);
		System.out.println(m);
		
	}
}
