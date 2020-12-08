package com.synechron.java.basic.exception;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		try 
		{
			Thread.sleep(10000);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}

}
