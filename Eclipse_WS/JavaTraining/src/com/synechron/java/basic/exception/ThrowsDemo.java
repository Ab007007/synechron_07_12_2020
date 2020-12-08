package com.synechron.java.basic.exception;

public class ThrowsDemo 
{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started ");
		test();
		System.out.println("Main Ended ");
		
	}


	public static void test() throws InterruptedException
	{
		System.out.println("I'm in test method");
		Thread.sleep(5000);
	}

}

