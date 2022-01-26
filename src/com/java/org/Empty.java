package com.java.org;

public class Empty {
	public static void main(String[] args) {

		String s = "welcome";
		String s1=" ";
		String s2="";
		String s3=null;
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean empty2 = s1.isEmpty();
		System.out.println(empty2);
		
		boolean empty3 = s2.isEmpty();
		System.out.println(empty3);
		
		boolean empty4 = s3.isEmpty();
		System.out.println(empty4);//null value default error
	}
	
	

}
