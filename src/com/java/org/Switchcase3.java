package com.java.org;

import java.util.Scanner;

public class Switchcase3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter A value");
	int a = s.nextInt();
	System.out.println("A = "+a);
	System.out.println("Enter B value");
	int b = s.nextInt();
	System.out.println("B = "+b);
	System.out.println("to do");
	int c = s.nextInt();
	System.out.println("C ="+c);
	
	switch (c) {
	case 1:
		c=a+b;
		System.out.println("Added value :"+c);		
		break;
	case 2:
		c=a-b;
		System.out.println("subtracted value: "+c);
		break;
	case 3:
		c=a*b;
		System.out.println("Multiplied value :"+c);
		break;
	case 4:
		c=a/b;
		System.out.println("Divided value:"+c);
		break;

	default:
		System.out.println("the given value is wrong");
		break;
	}
	
	
	
}
}
