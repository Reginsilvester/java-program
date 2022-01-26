package com.java.org;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatPGM {
	public static void main(String[] args) {
String s = "Let It Go Let It Play Let It Suffer Let Them Make Noise";
String[] sp = s.split(" ");

Map<String, Integer> m = new LinkedHashMap<>();
for (String st : sp) {
	if (m.containsKey(st)) {
		Integer in = m.get(st);
		m.put(st, in+1);
	} else {
m.put(st,1);
	}
}
System.out.println(m);
Set<Entry<String, Integer>> entrySet = m.entrySet();
for (Entry<String, Integer> entry : entrySet) {
	//if (entry.getValue()>1) {
		System.out.println(entry);
//	}
	
}
	}

}
