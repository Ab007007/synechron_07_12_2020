package com.synechron.java.basic.array.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	
	public static void main(String[] args) {
		
		Map mp = new LinkedHashMap();
		
		mp.put("name", "aravinda");
		mp.put("age", "38");
		mp.put("location", "bangalore");
		
		System.out.println("Total elements in map " + mp.size());
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}
		
	}
}
