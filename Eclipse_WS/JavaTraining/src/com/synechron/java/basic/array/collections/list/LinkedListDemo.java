package com.synechron.java.basic.array.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		
		
		List list = new LinkedList();
		
		list.add(12);
		list.add('A');
		list.add("MAN");
		list.add(123.222);
		list.add(true);
		print(list);
		
		list.add(0, "New Element at 0 index");
		print(list);
		
		list.remove(1);
		print(list);
		
		printUsingForEach(list);
		
		printUsingIterator(list);
		
	}

	public static void printUsingIterator(List list) {
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void printUsingForEach(List list) {
		System.out.println("Printing using foreach");
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("-----X------X-------X------X------");
	}

	public static void print(List list) {
		System.out.println("Total size of collection is " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println("-----X------X-------X------X------");
	}
}
