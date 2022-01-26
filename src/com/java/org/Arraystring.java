package com.java.org;

public class Arraystring {
	public static void main(String[] args) {
		int a[]= new int[4];
		String b[]= new String[2];
		b[0]="good morning";
		b[1]="good evening";
		
			a[0]=10;
			a[1]=20;
			a[2]=33;
			a[3]=44;
			a[1]=11;// indupilcate last value is taken priority
			a[3]=80;
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			System.out.println(a[2]);//if needed selected 1
			for (String d : b) {
				System.out.println(d);
			}
	int c[]= {1,2,3,4};//it can b entered in block also
	for (int i : c) {
		System.out.println(i);
	}
	}
}
