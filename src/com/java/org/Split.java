package com.java.org;

public class Split {
	public static void main(String[] args) {
		String s = "All That Glitters Are Not Gold";
		String[] split = s.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
			
			int length = s.length();
			System.out.println("total words gn : "+length);
			
			
			String[] split2 = s.split(" ",4 );
			for (String a : split2) {
				System.out.println(a);
				// breaks from the word given length
			}
			
	}
	

}
