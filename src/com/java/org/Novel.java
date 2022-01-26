package com.java.org;

public class Novel extends Book
{
	public void NextBook() {
		System.out.println("NextBook : Midnight Train");
		
	}
    public static void main(String[] args) {
		Novel N = new Novel();
		N.author();
		N.Journer();
		N.name();
		N.NextBook();
	}
}