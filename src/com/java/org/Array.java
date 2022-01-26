package com.java.org;

public class Array {
	public static void main(String[] args) {
		
		int a[] = new int[4];
//index counts start wit '0'& length count from'1'
		a[0] = 10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//a[4]=50;bcoz it exceeds given length
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
