package com.java.org;

public class Arraydupli {
public static void main(String[] args) {
	int a[]= new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=33;
		a[3]=44;
		a[1]=11;// indupilcate last value is taken priority
		a[3]=80;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
}
}
