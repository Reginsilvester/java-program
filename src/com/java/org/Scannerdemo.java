package com.java.org;

import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact Number");
		int i = sc.nextInt(); 
		System.out.println("the number is :"+i);
	
System.out.println("Enter your name:");		
String name = sc.next();
System.out.println("entered name is : "+name);

sc.nextLine();

System.out.println("feedback");
String feed = sc.nextLine();
System.out.println("Feedback entered is : "+ feed);

System.out.println("review");
float w = sc.nextFloat();
System.out.println("entered review is :"+ w);

System.out.println("choice number");
byte b = sc.nextByte();
System.out.println("number is : "+ b);

sc.nextLine();
System.out.println("Full name");
String nm = sc.nextLine();
System.out.println("full name is :"+ nm);


		System.out.println("alternate no");
		double db = sc.nextDouble();
		System.out.println("the no is:"+ db);
	
	}

}
