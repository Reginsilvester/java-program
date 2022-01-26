package com.java.org;

public class Switchcase2 {
public static void main(String[] args) {
	for (int i = 1; i <=9; i++) 
	/*	
	  {if (i==3) {
			continue;	// if needed we can skip or break also
			}*/
		switch (i) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;		

		default:
			break;
		}
		
	}
}

