package com.java.org;

public class Methods {
public static void main(String[] args) {
	String s= "Slow And Steady Wins The Race";
	
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals("Slow And Steady wins The Race");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("Slow and steady wins the race");
	System.out.println(equalsIgnoreCase);
	
	char charAt = s.charAt(6);
	System.out.println(charAt);
	
	int indexOf = s.indexOf('s');
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf('c');
	System.out.println(lastIndexOf);
	
	boolean contains = s.contains("Wins");
	System.out.println(contains);
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	boolean startsWith = s.startsWith("slo");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("ce");
	System.out.println(endsWith);
	
	String replace = s.replace('e', 'a');
	System.out.println(replace);
	
	String replaceAll = s.replaceAll("Wins", "won");
	System.out.println(replaceAll);
	
	String substring = s.substring(20);
	System.out.println(substring);
	
	String substring2 = s.substring(13, 20);
	System.out.println(substring2);
}
}
