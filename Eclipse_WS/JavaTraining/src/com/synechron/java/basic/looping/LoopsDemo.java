package com.synechron.java.basic.looping;

import javax.swing.text.TabableView;

public class LoopsDemo {

	public static void main(String[] args) {
		int num = 11;
		int count = 1;
		int tablesCount = 10;
		System.out.println("Welcome to Multiplication Tables, Printing table for  " + num);
		// printTableUsingFor(num);
		// printUsingWhileLoop(num);

		printMultipleTables(num, tablesCount);
	}

	public static void printMultipleTables(int num, int tablesCount) {
		int count = 1;
		do {
			System.out.println("Welcome to Multiplication Tables, Printing table for  " + num);
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
			count++;
			num++;
			System.out.println("-----------------------------------------------------");
		} while (count <= tablesCount);
	}

	public static void printUsingWhileLoop(int num) {
		int ix = 1;
		while (ix <= 10) {
			System.out.println(num + " * " + ix + " = " + num * ix);
			ix++;
		}
	}

	public static void printTableUsingFor(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
