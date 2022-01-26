package com.java.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatativePgm {
	public static void main(String[] args) {
		String s ="For The People By The People Of The People";
		String[] split = s.split(" ");
		
		Map<String, Integer> sp = new LinkedHashMap<>();
		for (String st : split) {
			if (sp.containsKey(st)) {
				Integer i = sp.get(st);
				sp.put(st, i+1);
				
			} else {
				sp.put(st, 1);
			}
			
		}
		//System.out.println(sp);
		Set<Entry<String, Integer>> entrySet = sp.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);	
			}
			
		}
		
	}

}
