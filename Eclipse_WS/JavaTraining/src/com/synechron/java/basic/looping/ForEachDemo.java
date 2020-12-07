package com.synechron.java.basic.looping;

public class ForEachDemo {

//	String a ="abc";

	public static void main(String[] args) {
		String[] names = { "Aravinda ", "Ramesh", "Girish", "Mahesh", "Suresh" };

		for (String name : names) {
			System.out.println(name);
		}
		LoopsDemo.printTableUsingFor(10);
		LoopsDemo.printMultipleTables(1, 20);
	}
}
