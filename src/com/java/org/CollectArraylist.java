package com.java.org;

import java.util.ArrayList;
import java.util.List;

public class CollectArraylist {
public static void main(String[] args) {
	List<Object> l = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();
	
	l.add(10);
	l.add(40);
	l.add(30);
	l.add("jeni");
	l.add(null);
	l.add('A');
	l.add(70);
	l.add(20);
//	l.add(null);
	
	System.out.println(l);
	
	l2.add(90);
	l2.add(10);
	l2.add(40);
	l2.add(50);
	System.out
	.println(l2);
	
	l.addAll(l2);
	System.out.println(l);
	
	l.add(3, 22);
	System.out.println(l);
	
	boolean contains = l.contains(64);
	System.out.println(contains);
	
	Object in = l.get(2);
	System.out.println("the number is : "+in);
	
	l.remove(2);
	System.out.println(l);
	
	
	int indexOf = l.indexOf(22);// searches the number place
	System.out.println("number place is : "+indexOf);
	
/*	l.retainAll(l2);// common nos
	System.out.println(l);*/
	
	int size = l.size();
	System.out.println(size);
	
	
}
}
