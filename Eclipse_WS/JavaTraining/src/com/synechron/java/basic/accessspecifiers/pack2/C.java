package com.synechron.java.basic.accessspecifiers.pack2;

import com.synechron.java.basic.accessspecifiers.pack1.A;

public class C extends A {

	public static void main(String[] args) {
		//A a = new A();
		C a = new C();
		//a.test1();
		//a.test2();
		a.test3();
		a.test4();
	}
	
	
	
	protected static void test3() {
		System.out.println("protected method- from class C ");
	}
	
	
	public static void test4() {
		System.out.println("public method- from class C ");
	}
}
