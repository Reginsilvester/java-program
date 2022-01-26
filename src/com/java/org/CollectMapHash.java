package com.java.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectMapHash {
	public static void main(String[] args) {
		Map<Integer, Object> h = new HashMap<>();
	//	Map<Integer, Object> h = new LinkedHashMap<>();
		// if needed in exact order
		h.put(1, "Jeni");
		h.put(2, 'A');
		h.put(3, true);
		h.put(4, 32.09);
		h.put(5, null);
		h.put(6, 30);
		h.put(null, 40);
		h.put(null, 10);// last null priority
		h.put(7, null);
		h.put(2, 20);
		
		System.out.println(h);
		boolean containsKey = h.containsKey(6);
		System.out.println(containsKey);
		
		boolean containsValue = h.containsValue('B');
		System.out.println(containsValue);
		
		Object object = h.get(6);
		System.out.println(object);
		
		int size = h.size();
		System.out.println(size);
		
		Set<Integer> keySet = h.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = h.values();
		System.out.println(values);
		
		Set<Entry<Integer, Object>> entrySet = h.entrySet();
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
	}

}
