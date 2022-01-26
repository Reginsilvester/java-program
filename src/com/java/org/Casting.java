package com.java.org;

public class Casting {
	public static void main(String[] args) {
		 short a = 32456;
		 int b= a;
		 System.out.println("code number is:"+b);// lower to higher
		 
		 int e = 912345678;
		 long f = e; //lower to higher
		System.out.println("changed id :"+ f);
		
		int i = 45689;
		 float k= i;// double and float same
		 System.out.println("arr:"+ k);
		 
		 long c= 987654321;//accepts only 10 digit number
		 int d= (int) c;
		 System.out.println("Id is :"+d);//high to low
		 
		 short g = 123;
		 byte h= (byte) g;//higher to lower
		 System.out.println("choice no:"+h);	
		 
		 long m = 1234567890; //didnt accept high value
		 short n = (short) m;// higher to low-o/p wrong
		 System.out.println("given value :"+ n);
		 
	}
}
