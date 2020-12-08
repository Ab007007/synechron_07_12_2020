package com.synechron.java.basic.array.generics.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synechron.java.basic.interfaces.Cow;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		List<Cow> al = new ArrayList<Cow>();
		al.add(new Cow());
		al.add(new Cow());
		al.add(new Cow());
		al.add(new Cow());
		al.add(new Cow());
		al.add(new Cow());
		
		print(al);
		
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
