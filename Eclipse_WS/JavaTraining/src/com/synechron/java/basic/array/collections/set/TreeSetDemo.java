package com.synechron.java.basic.array.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		Set s = new TreeSet();
		
		s.add(123);
		s.add(13);
		s.add(1223);
		s.add(12223);
	
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
