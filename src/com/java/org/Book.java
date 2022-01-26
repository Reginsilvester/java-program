package com.java.org;

public class Book {
	public void name() {
		System.out.println("name : two states");
	}
	public void author() {
		System.out.println("author : Chetan Bhaghat");
	}
	public void release() {
	System.out.println("Release : October");
	}
	public void Journer() {
		System.out.println("Journer : Love and horror");
	}
	public void Response() {
		System.out.println("Response : Hit");
		
	}
	public static void main(String[] args) {
		Book A = new Book();
		A.name();
		A.author();
		A.release();
		A.Journer();
		A.Response();
	}

}
