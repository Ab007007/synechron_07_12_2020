package com.synechron.java.basic.accessmodifiers;

public class StaticDemo {
	
	static int x = 10 ;
	public static final double PI = 3.142;
	public static void main(String[] args) {
		StaticDemo.test1();
		StaticDemo.printPI();
		
	}

	static void test1()
	{
		System.out.println("Static test1 method : " + x);
		System.out.println("10 times of PI is " + (PI * 10));
	}
	
	
	static final void printPI() {
		System.out.println("The default value of PI is : "  + PI);
	}
}
