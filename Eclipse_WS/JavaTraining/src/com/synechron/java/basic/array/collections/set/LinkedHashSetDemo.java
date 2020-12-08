package com.synechron.java.basic.array.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		Set s = new LinkedHashSet();
		
		s.add(123);
		s.add("abc");
		s.add(212.22);
	
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
