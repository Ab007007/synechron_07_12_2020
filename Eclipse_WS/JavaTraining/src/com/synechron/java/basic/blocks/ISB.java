package com.synechron.java.basic.blocks;

public class ISB {

	
	{
		System.out.println("total count : " + ++count);
	}
	
	static int count = 0;
	public static void main(String[] args) {
		System.out.println("main");
		
		ISB isb1 = new ISB();
		ISB isb2 = new ISB();
		ISB isb3 = new ISB();
		ISB isb4 = new ISB();
	}
}
