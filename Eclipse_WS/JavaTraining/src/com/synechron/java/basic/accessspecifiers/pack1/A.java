package com.synechron.java.basic.accessspecifiers.pack1;

public class A {

	private int privateInt = 0;
	int defaultInt = 1;
	protected int protectedInt = 2;
	public int publicInt = 3;

	private void test1() {
		System.out.println("private method- from class A ");
	}

	void test2() {
		System.out.println("Default method- from class A ");
	}

	protected static void test3() {
		System.out.println("protected method- from class A ");
	}

	public static void test4() {
		System.out.println("public method- from class A ");
	}
	
	public void printAllMembers() {
		System.out.println(privateInt);
		System.out.println(defaultInt);
		System.out.println(protectedInt);
		System.out.println(publicInt);
	}
	public static void main(String[] args) {
		A a = new A();
		
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}

}
